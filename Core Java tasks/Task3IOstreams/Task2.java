package Task3;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class Task2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the folder path: ");
        String folderPath = scanner.nextLine();
        
        System.out.print("Enter the file extension (e.g., txt, java): ");
        String extension = scanner.nextLine();
        
        File folder = new File(folderPath);
        
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path!");
            return;
        }
  
        FilenameFilter filter = (dir, name) -> name.toLowerCase().endsWith("." + extension.toLowerCase());
        
  
        File[] files = folder.listFiles(filter);
        
        if (files == null || files.length == 0) {
            System.out.println("No files found with the extension ." + extension);
        } else {
            System.out.println("Files found:");
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
        
        scanner.close();
    }
}
