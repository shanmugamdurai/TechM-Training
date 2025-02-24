package Task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExpHand5 {
    public static void main(String[] args) {
        String path = "number.txt"; 
        
        try {
            isFileEmpty(path);
        } catch (EmptyFileException | IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void isFileEmpty(String path) throws EmptyFileException, IOException {
        File file = new File(path);
        
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + path);
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            if (reader.readLine() == null) {
                throw new EmptyFileException("The file is empty.");
            } else {
                System.out.println("File is not empty. Successfully read.");
            }
        }
    }
}
class EmptyFileException extends Exception {
    public EmptyFileException(String m) {
        super(m);
    }
}
