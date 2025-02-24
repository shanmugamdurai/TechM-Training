package Task3;

import java.io.File;

public class Task1 {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\shan2\\OneDrive\\ドキュメント";

        File directory = new File(directoryPath);

        if (directory.isDirectory()) {
            String[] fileList = directory.list();

            if (fileList != null && fileList.length > 0) {
                System.out.println("Files and directories in " + directoryPath + ":");
                for (String fileName : fileList) {
                    System.out.println(fileName);
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The specified path is not a directory.");
        }
    }
}
