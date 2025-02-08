package StringHandling;

public class StringProcessor {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
   
    public static int countOccurrences(String text, String sub) {
        int count = 0;
        int index = 0;
        
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        
        return count;
    }
    
    public static String splitAndCapitalize(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1)).append(" ");
            }
        }
        
        return result.toString().trim();
    }
    
    public static void main(String[] args) {
        String sampleText = "hello world, welcome to java programming";
        
        System.out.println("Reversed String: " + reverseString(sampleText));
        System.out.println("Occurrences of 'o': " + countOccurrences(sampleText, "o"));
        System.out.println("Capitalized Words: " + splitAndCapitalize(sampleText));
    }
}
