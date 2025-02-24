package Task9;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        // Sample list of numbers
        List<Integer> numbers = Arrays.asList(51, 35, 52, 43, 56, 64, 76, 82, 94, 57);

        int evenSum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        int oddSum = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
