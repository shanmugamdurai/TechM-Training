package Task3;

import java.io.File;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file or directory path: ");
        String path = scanner.nextLine();
        scanner.close();
        
        File file = new File(path);
        
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The specified path refers to a file and it exists.");
            } else if (file.isDirectory()) {
                System.out.println("The specified path refers to a directory and it exists.");
            }
        } else {
            System.out.println("The specified file or directory does not exist.");
        }
    }
}
