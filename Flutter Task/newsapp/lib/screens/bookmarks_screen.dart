import 'package:flutter/material.dart';
import '../services/firebase_service.dart';
import 'news_list_screen.dart';

class BookmarksScreen extends StatefulWidget {
  @override
  _BookmarksScreenState createState() => _BookmarksScreenState();
}

class _BookmarksScreenState extends State<BookmarksScreen> {
  final FirebaseService _firebaseService = FirebaseService();
  Set<String> _bookmarkedCategories = {};

  @override
  void initState() {
    super.initState();
    _loadBookmarks();
  }

  void _loadBookmarks() async {
    Set<String> bookmarks = await _firebaseService.getBookmarkedCategories();
    setState(() {
      _bookmarkedCategories = bookmarks;
    });
  }

  void _removeBookmark(String category) async {
    await _firebaseService.removeBookmark(category);
    _loadBookmarks(); // Refresh list after removing
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Bookmarked Categories")),
      body: _bookmarkedCategories.isEmpty
          ? Center(child: Text("No bookmarks found."))
          : ListView.builder(
              itemCount: _bookmarkedCategories.length,
              itemBuilder: (context, index) {
                String category = _bookmarkedCategories.elementAt(index);
                return Card(
                  child: ListTile(
                    title: Text(category.toUpperCase()),
                    trailing: IconButton(
                      icon: Icon(Icons.delete, color: Colors.red),
                      onPressed: () => _removeBookmark(category),
                    ),
                    onTap: () {
                      Navigator.push(
                        context,
                        MaterialPageRoute(
                          builder: (context) =>
                              CategoryNewsScreen(category: category),
                        ),
                      );
                    },
                  ),
                );
              },
            ),
    );
  }
}
