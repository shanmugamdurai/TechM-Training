package Anagram;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p)); 
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }
        
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        
       
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        
        int pLength = p.length();
        for (int i = 0; i < s.length(); i++) {
  
            sCount[s.charAt(i) - 'a']++;
    
            if (i >= pLength) {
                sCount[s.charAt(i - pLength) - 'a']--;
            }
            
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - pLength + 1);
            }
        }
        
        return result;
    }
}
