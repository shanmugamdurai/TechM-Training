package Task4;

import java.io.File;
import java.io.FileNotFoundException;

public class ExpHand3 {
    public static void fileFinderMethod(String path) throws FileNotFoundException {
         File f = new File(path);
         if(! f.exists()) {
            throw new FileNotFoundException("File not found");
         }
    }
    public static void main(String[] args) {
        String path ="Num.txt";
        try {
            fileFinderMethod(path);
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
