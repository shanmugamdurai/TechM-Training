package Task6;

import java.util.Arrays;
import java.util.List;

public class Task3 {
     public static <T> int findFirstIndex(List<T> list, T target) {
        if (list == null || target == null) {
            return -1; 
        }
        return list.indexOf(target);
    }
    
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50);
        List<String> strList = Arrays.asList("apple", "banana", "cherry", "apple");
        
        System.out.println("Index of 30 in intList: " + findFirstIndex(intList, 30)); 
        System.out.println("Index of 'apple' in strList: " + findFirstIndex(strList, "apple"));
        System.out.println("Index of 'grape' in strList: " + findFirstIndex(strList, "grape")); 
    }
}
