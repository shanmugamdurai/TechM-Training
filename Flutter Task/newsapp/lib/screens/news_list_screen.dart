import 'package:flutter/material.dart';
import '../services/firebase_service.dart';
import 'news_detail_screen.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';

class CategoryNewsScreen extends StatefulWidget {
  final String category;

  CategoryNewsScreen({required this.category});

  @override
  _CategoryNewsScreenState createState() => _CategoryNewsScreenState();
}

class _CategoryNewsScreenState extends State<CategoryNewsScreen> {
  final FirebaseService _firebaseService = FirebaseService();
  List<dynamic> _newsArticles = [];
  bool _isBookmarked = false;
  bool _isLoading = true;

  @override
  void initState() {
    super.initState();
    _fetchNews();
    _checkIfBookmarked();
  }

  void _fetchNews() async {
    final apiKey = "7d575c740724dde57a9f73e668d0ff1d"; // Replace with your GNews API Key
    final url =
        "https://gnews.io/api/v4/top-headlines?category=${widget.category}&lang=en&token=$apiKey";

    try {
      final response = await http.get(Uri.parse(url));
      if (response.statusCode == 200) {
        final data = json.decode(response.body);
        setState(() {
          _newsArticles = data['articles'];
          _isLoading = false;
        });
      } else {
        print("Failed to fetch news: ${response.statusCode}");
        setState(() {
          _isLoading = false;
        });
      }
    } catch (e) {
      print("Error fetching news: $e");
      setState(() {
        _isLoading = false;
      });
    }
  }

  void _checkIfBookmarked() async {
    Set<String> bookmarks = await _firebaseService.getBookmarkedCategories();
    setState(() {
      _isBookmarked = bookmarks.contains(widget.category);
    });
  }

  void _toggleBookmark() async {
    if (_isBookmarked) {
      await _firebaseService.removeBookmark(widget.category);
    } else {
      await _firebaseService.saveBookmark(widget.category);
    }
    setState(() {
      _isBookmarked = !_isBookmarked;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("${widget.category.toUpperCase()} News"),
        actions: [
          IconButton(
            icon: Icon(_isBookmarked ? Icons.bookmark : Icons.bookmark_border),
            onPressed: _toggleBookmark,
          ),
        ],
      ),
      body: _isLoading
          ? Center(child: CircularProgressIndicator())
          : _newsArticles.isEmpty
              ? Center(child: Text("No news available"))
              : ListView.builder(
                  itemCount: _newsArticles.length,
                  itemBuilder: (context, index) {
                    var article = _newsArticles[index];
                    return Card(
                      margin: EdgeInsets.all(8),
                      elevation: 4,
                      child: ListTile(
                        leading: article['image'] != null
                            ? Image.network(
                                article['image'],
                                width: 100,
                                height: 80,
                                fit: BoxFit.cover,
                              )
                            : Icon(Icons.image_not_supported, size: 50),
                        title: Text(article['title'] ?? "No Title"),
                        subtitle: Text(article['source']['name'] ?? ""),
                        onTap: () {
                          Navigator.push(
                            context,
                            MaterialPageRoute(
                              builder: (context) => NewsDetailScreen(
                                title: article['title'] ?? "No Title",
                                imageUrl: article['image'] ?? "",
                                content: article['content'] ?? "No Content",
                                category: widget.category,
                              ),
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
