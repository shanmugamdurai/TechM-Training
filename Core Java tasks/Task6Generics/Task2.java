package Task6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static <T extends Number> Map<String, Integer> sumEvenOdd(List<T> numbers) {
        int evenSum = 0, oddSum = 0;
        
        for (T num : numbers) {
            int value = num.intValue();
            if (value % 2 == 0) {
                evenSum += value;
            } else {
                oddSum += value;
            }
        }
        
        Map<String, Integer> result = new HashMap<>();
        result.put("Even Sum", evenSum);
        result.put("Odd Sum", oddSum);
        
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<String, Integer> sums = sumEvenOdd(numbers);
        
        System.out.println("Even Sum: " + sums.get("Even Sum"));
        System.out.println("Odd Sum: " + sums.get("Odd Sum"));
    }
}
