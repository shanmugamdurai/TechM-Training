package Task3;

import java.io.File;
import java.util.Scanner;

public class Task8 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();
        scanner.close();
        
        File file = new File(filePath);
        
        if (file.exists() && file.isFile()) {
            long fileSizeInBytes = file.length();
            double fileSizeInKB = fileSizeInBytes / 1024.0;
            double fileSizeInMB = fileSizeInKB / 1024.0;
            
            System.out.println("File size in bytes: " + fileSizeInBytes);
            System.out.println("File size in KB: " + fileSizeInKB);
            System.out.println("File size in MB: " + fileSizeInMB);
        } else {
            System.out.println("File not found or is not a valid file.");
        }
    }
}
