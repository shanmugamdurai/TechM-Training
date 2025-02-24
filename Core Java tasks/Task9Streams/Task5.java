package Task9;

import java.util.Arrays;
import java.util.List;

public class Task5 {
    public class StringCount {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Apricot", "Blueberry", "Cherry");
            char targetLetter = 'A';

            long count = words.stream()
                    .filter(word -> word.startsWith(String.valueOf(targetLetter)))
                    .count();

            System.out.println("Number of words starting with '" + targetLetter + "': " + count);
        }
    }
}
