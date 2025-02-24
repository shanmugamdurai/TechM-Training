package Task3;

import java.io.File;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the pathname: ");
        String path = scanner.nextLine();
        scanner.close();

        File file = new File(path);

        if (!file.exists()) {
            System.out.println("The specified path does not exist.");
        } else if (file.isDirectory()) {
            System.out.println("The specified path is a directory.");
        } else if (file.isFile()) {
            System.out.println("The specified path is a file.");
        } else {
            System.out.println("The specified path is neither a file nor a directory.");
        }
    }
}
