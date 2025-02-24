package Task3;

import java.io.File;

public class Task4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java FilePermissionChecker <file_or_directory_path>");
            return;
        }

        String path = args[0];
        File file = new File(path);

        if (!file.exists()) {
            System.out.println("The specified file or directory does not exist.");
            return;
        }

        System.out.println("Checking permissions for: " + file.getAbsolutePath());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
    }
}
