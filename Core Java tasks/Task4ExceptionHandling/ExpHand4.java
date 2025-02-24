package Task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExpHand4 {
     public static void checkPositiveNum(String path) throws IOException, PositiveNumberException {
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + path);
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line.trim());
                    if (number > 0) {
                        throw new PositiveNumberException("Positive number found: " + number);
                    }
                    System.out.println("Valid number: " + number);
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid entry: " + line);
                }
            }
        }
    }
    public static void main(String[] args) {
        String path = "\"C:\\Users\\shan2\\OneDrive\\ドキュメント\\Numbers.txt\""; 
        
        try {
            checkPositiveNum(path);
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (PositiveNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
    class PositiveNumberException extends Exception {
        public PositiveNumberException(String a) {
            super(a);
        }
    }
