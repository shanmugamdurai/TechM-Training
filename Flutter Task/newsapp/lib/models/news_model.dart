import 'package:cloud_firestore/cloud_firestore.dart';

class NewsArticle {
  final String title;
  final String description;
  final String imageUrl;
  final String source;
  final String url;

  NewsArticle({
    required this.title,
    required this.description,
    required this.imageUrl,
    required this.source,
    required this.url,
  });

  factory NewsArticle.fromJson(Map<String, dynamic> json) {
    return NewsArticle(
      title: json['title'] ?? "No Title",
      description: json['description'] ?? "No Description",
      imageUrl: json['urlToImage'] ?? "",
      source: json['source']['name'] ?? "Unknown",
      url: json['url'] ?? "",
    );
  }

  Map<String, dynamic> toMap() {
    return {
      'title': title,
      'description': description,
      'imageUrl': imageUrl,
      'source': source,
      'url': url,
    };
  }

  factory NewsArticle.fromFirestore(DocumentSnapshot doc) {
    final data = doc.data() as Map<String, dynamic>;
    return NewsArticle(
      title: data['title'],
      description: data['description'],
      imageUrl: data['imageUrl'],
      source: data['source'],
      url: data['url'],
    );
  }
}

