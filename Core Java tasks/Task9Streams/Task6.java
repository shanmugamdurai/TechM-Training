package Task9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Banana", "Apple", "Mango", "Cherry", "Orange");

        List<String> ascendingOrder = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        List<String> descendingOrder = strings.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Original List: " + strings);
        System.out.println("Ascending Order: " + ascendingOrder);
        System.out.println("Descending Order: " + descendingOrder);
    }
}
