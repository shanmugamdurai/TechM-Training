import 'package:flutter/material.dart';
import '../services/firebase_service.dart';

class NewsDetailScreen extends StatefulWidget {
  final String title;
  final String imageUrl;
  final String content;
  final String category;

  NewsDetailScreen({
    required this.title,
    required this.imageUrl,
    required this.content,
    required this.category,
  });

  @override
  _NewsDetailScreenState createState() => _NewsDetailScreenState();
}

class _NewsDetailScreenState extends State<NewsDetailScreen> {
  final FirebaseService _firebaseService = FirebaseService();
  bool _isBookmarked = false;

  @override
  void initState() {
    super.initState();
    _checkIfBookmarked();
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
        title: Text(widget.title),
        actions: [
          IconButton(
            icon: Icon(_isBookmarked ? Icons.bookmark : Icons.bookmark_border),
            onPressed: _toggleBookmark,
          ),
        ],
      ),
      body: SingleChildScrollView(
        padding: EdgeInsets.all(16),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            widget.imageUrl.isNotEmpty
                ? ClipRRect(
                    borderRadius: BorderRadius.circular(10),
                    child: Image.network(widget.imageUrl, fit: BoxFit.cover),
                  )
                : SizedBox(),
            SizedBox(height: 16),
            Text(
              widget.title,
              style: TextStyle(fontSize: 22, fontWeight: FontWeight.bold),
            ),
            SizedBox(height: 10),
            Text(
              widget.content,
              style: TextStyle(fontSize: 16),
            ),
          ],
        ),
      ),
    );
  }
}
