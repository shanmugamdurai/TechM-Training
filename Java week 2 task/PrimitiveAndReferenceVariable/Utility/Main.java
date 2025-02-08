package PrimitiveAndReferenceVariable.Utility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int length = IntLength.getIntegerLength(number);
        System.out.println("Length of the given integer: " + length);
        
        scanner.close();
    }
}
