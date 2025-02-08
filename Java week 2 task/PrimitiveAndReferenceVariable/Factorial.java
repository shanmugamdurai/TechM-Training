package PrimitiveAndReferenceVariable;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int trailingZeroes = countTrailingZeroes(number);
        
        System.out.println("Number of trailing zeroes in " + number + "! is: " + trailingZeroes);
        
        scanner.close();
    }
    static int countTrailingZeroes(int n) {
        int count = 0;
        
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        
        return count;
    }
}
