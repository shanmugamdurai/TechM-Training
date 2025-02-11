package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputMethods {
    static void InputusingBufferReader() throws IOException
    {

            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter the input:");
            String s = r.readLine();

            System.out.println("The given input:"+s);
        }
   static void InputUsingScanner()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the input string :");
        String s1 = s.nextLine();
        System.out.println("You entered string " + s1);
        s.close();

        System.out.println("Enter the input integer :");
        int a = s.nextInt();
        System.out.println("You entered integer " + a);

        System.out.println("Enter the input float :");
        float b = s.nextFloat();
        System.out.println("You entered float " + b);
    }
}
