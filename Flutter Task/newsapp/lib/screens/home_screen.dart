import 'package:flutter/material.dart';
import 'package:flutter_localizations/flutter_localizations.dart';
import 'package:newsapp/localization/app_localizations.dart';
import 'news_list_screen.dart';
import '../localization/app_localizations_delegate.dart';
import '../services/firebase_service.dart'; // Import Firebase service
import 'bookmarks_screen.dart'; // Import Bookmarks screen

class HomeScreen extends StatefulWidget {
  @override
  _HomeScreenState createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  Locale _selectedLocale = Locale('en'); // Default Language
  final FirebaseService _firebaseService = FirebaseService();
  Set<String> bookmarkedCategories = {}; // Store bookmarked categories

  final List<Map<String, String>> categories = [
    {"title": "world", "imageUrl": "https://play-lh.googleusercontent.com/YIXIHi5PJvUnakhBNFesY_rj9jrJQvNVwB1DiV4aYoKBrMKQ11nJ4NUCgH16S9ufNTg"},
    {"title": "national", "imageUrl": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQG_S7zAGneu_pW2V43B1TWQPx7kQ8rQyqkYg&s"},
    {"title": "sports", "imageUrl": "https://www.shutterstock.com/shutterstock/videos/29587630/thumb/3.jpg?ip=x480"},
    {"title": "entertainment", "imageUrl": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFfKzGm56pg22qzZwdwYXfwIuVylvkTmXWbw&s"},
    {"title": "technology", "imageUrl": "https://assets.thehansindia.com/h-upload/2021/10/04/1115546-tech-news.webp"},
  ];

  @override
  void initState() {
    super.initState();
    _loadBookmarks();
  }

  void _changeLanguage(Locale locale) {
    setState(() {
      _selectedLocale = locale;
    });
  }

  void _toggleBookmark(String category) async {
    if (bookmarkedCategories.contains(category)) {
      await _firebaseService.removeBookmark(category);
      bookmarkedCategories.remove(category);
    } else {
      await _firebaseService.saveBookmark(category);
      bookmarkedCategories.add(category);
    }
    setState(() {}); // Refresh UI
  }

  void _loadBookmarks() async {
    Set<String> bookmarks = await _firebaseService.getBookmarkedCategories();
    setState(() {
      bookmarkedCategories = bookmarks;
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      locale: _selectedLocale,
      supportedLocales: [
        Locale('en', ''),
        Locale('hi', ''),
        Locale('te', ''),
        Locale('ta', ''),
      ],
      localizationsDelegates: [
        AppLocalizationsDelegate(),
        GlobalMaterialLocalizations.delegate,
        GlobalWidgetsLocalizations.delegate,
        GlobalCupertinoLocalizations.delegate,
      ],
      home: Scaffold(
        appBar: AppBar(
          title: Text(AppLocalizations.of(context)!.translate("home_title")),
          actions: [
            IconButton(
              icon: Icon(Icons.bookmark),
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => BookmarksScreen()),
                );
              },
            ),
            Padding(
              padding: const EdgeInsets.only(right: 8.0),
              child: DropdownButton<Locale>(
                value: _selectedLocale,
                onChanged: (Locale? newLocale) {
                  if (newLocale != null) {
                    _changeLanguage(newLocale);
                  }
                },
                dropdownColor: Colors.white,
                icon: Icon(Icons.language, color: Colors.white),
                underline: SizedBox(),
                items: [
                  DropdownMenuItem(value: Locale('en'), child: Text("English")),
                  DropdownMenuItem(value: Locale('hi'), child: Text("हिंदी")),
                  DropdownMenuItem(value: Locale('te'), child: Text("తెలుగు")),
                  DropdownMenuItem(value: Locale('ta'), child: Text("தமிழ்")),
                ],
              ),
            ),
          ],
        ),
        body: Padding(
          padding: const EdgeInsets.all(8.0),
          child: GridView.builder(
            gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
              crossAxisCount: 2,
              crossAxisSpacing: 8,
              mainAxisSpacing: 8,
              childAspectRatio: 1.2,
            ),
            itemCount: categories.length,
            itemBuilder: (context, index) {
              final category = categories[index];

              return GestureDetector(
                onTap: () {
                  Navigator.push(
                    context,
                    MaterialPageRoute(
                      builder: (context) =>
                          CategoryNewsScreen(category: category["title"]!),
                    ),
                  );
                },
                child: Card(
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(12),
                  ),
                  elevation: 4,
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.stretch,
                    children: [
                      Expanded(
                        child: ClipRRect(
                          borderRadius: BorderRadius.vertical(
                            top: Radius.circular(12),
                          ),
                          child: Image.network(
                            category["imageUrl"]!,
                            fit: BoxFit.cover,
                            loadingBuilder: (context, child, loadingProgress) {
                              if (loadingProgress == null) return child;
                              return Center(child: CircularProgressIndicator());
                            },
                            errorBuilder: (context, error, stackTrace) {
                              return Center(
                                child: Icon(
                                  Icons.broken_image,
                                  size: 50,
                                  color: Colors.grey,
                                ),
                              );
                            },
                          ),
                        ),
                      ),
                      Container(
                        padding: EdgeInsets.all(8),
                        decoration: BoxDecoration(
                          color: Colors.white.withOpacity(0.7),
                          borderRadius: BorderRadius.vertical(
                            bottom: Radius.circular(12),
                          ),
                        ),
                        child: Row(
                          mainAxisAlignment: MainAxisAlignment.spaceBetween,
                          children: [
                            Expanded(
                              child: Text(
                                AppLocalizations.of(context)!
                                    .translate(category["title"]!),
                                style: TextStyle(
                                  color: Colors.black,
                                  fontSize: 16,
                                  fontWeight: FontWeight.bold,
                                ),
                              ),
                            ),
                            IconButton(
                              icon: Icon(
                                bookmarkedCategories.contains(category["title"])
                                    ? Icons.bookmark
                                    : Icons.bookmark_border,
                                color: Colors.red,
                              ),
                              onPressed: () => _toggleBookmark(category["title"]!),
                            ),
                          ],
                        ),
                      ),
                    ],
                  ),
                ),
              );
            },
          ),
        ),
      ),
    );
  }
}
