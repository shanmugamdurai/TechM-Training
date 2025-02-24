package Task3;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();
        scanner.close();
        
        File file = new File(filePath);
        
        if (file.exists()) {
            long lastModified = file.lastModified();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = sdf.format(new Date(lastModified));
            System.out.println("Last Modified Date: " + formattedDate);
        } else {
            System.out.println("File does not exist.");
        }
    }
}
