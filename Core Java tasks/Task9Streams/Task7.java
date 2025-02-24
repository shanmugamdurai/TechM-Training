package Task9;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 45, 78, 23, 89, 5, 67, 34);

        int max = numbers.stream().max(Integer::compareTo).orElseThrow(NoSuchElementException::new);

        int min = numbers.stream().min(Integer::compareTo).orElseThrow(NoSuchElementException::new);

        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }
}
