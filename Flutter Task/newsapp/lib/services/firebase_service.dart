import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:firebase_auth/firebase_auth.dart';

class FirebaseService {
  final FirebaseFirestore _firestore = FirebaseFirestore.instance;
  final FirebaseAuth _auth = FirebaseAuth.instance;

  String get userId {
    return _auth.currentUser?.uid ?? "guest_user"; // Use guest ID if not logged in
  }

  /// Save a category to bookmarks
  Future<void> saveBookmark(String category) async {
    try {
      await _firestore
          .collection("bookmarks")
          .doc(userId)
          .collection("categories")
          .doc(category)
          .set({"name": category, "timestamp": FieldValue.serverTimestamp()});
    } catch (e) {
      print("Error saving bookmark: $e");
    }
  }

  /// Remove a category from bookmarks
  Future<void> removeBookmark(String category) async {
    try {
      await _firestore
          .collection("bookmarks")
          .doc(userId)
          .collection("categories")
          .doc(category)
          .delete();
    } catch (e) {
      print("Error removing bookmark: $e");
    }
  }

  /// Get all bookmarked categories
  Future<Set<String>> getBookmarkedCategories() async {
    try {
      QuerySnapshot snapshot = await _firestore
          .collection("bookmarks")
          .doc(userId)
          .collection("categories")
          .get();

      return snapshot.docs.map((doc) => doc.id).toSet();
    } catch (e) {
      print("Error getting bookmarks: $e");
      return {};
    }
  }
}
