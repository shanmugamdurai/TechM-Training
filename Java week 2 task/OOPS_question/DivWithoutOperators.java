package OOPS_question;

import java.util.Scanner;

public class DivWithoutOperators {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();
        
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        
        sc.close();
        
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }
        
        int quotient = 0;
        int sign = 1;
        
        if (dividend < 0 && divisor < 0) {
            dividend = -dividend;
            divisor = -divisor;
        } else if (dividend < 0) {
            dividend = -dividend;
            sign = -1;
        } else if (divisor < 0) {
            divisor = -divisor;
            sign = -1;
        }
        
        int remainder = dividend;
        
        while (remainder >= divisor) {
            remainder -= divisor;
            quotient++;
        }
        
        System.out.println("Quotient: " + (quotient * sign));
        System.out.println("Remainder: " + remainder);
    }
}

    

