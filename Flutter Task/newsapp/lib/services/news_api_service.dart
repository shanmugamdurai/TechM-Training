import 'dart:convert';
import 'package:http/http.dart' as http;
import '../utils/constants.dart';

class NewsApiService {
  Future<List<dynamic>> fetchNews(String category) async {
    final url = Uri.parse(
        "$NEWS_BASE_URL/top-headlines?category=$category&lang=en&country=in&token=$NEWS_API_KEY");

    final response = await http.get(url);
    
    print("API Response: ${response.body}");  

    if (response.statusCode == 200) {
      final Map<String, dynamic> data = json.decode(response.body);
      return data['articles'] ?? []; 
    } else {
      throw Exception("Failed to load news: ${response.body}");
    }
  }
}

