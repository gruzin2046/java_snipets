package java_snippets._41_Files_operations;

import java.io.File;
import java.io.IOException;

public class File_class {
    public static void main(String[] args) {

        // 1. create file name and assign it to string
        String fileName = ".\\src\\java_snippets\\_41_Files_operations\\test2_File.txt";
        String directory = ".\\src\\java_snippets\\_41_Files_operations";

        // 2. create File class instance
        File file = new File(fileName);
        File dir = new File(directory);

        // 3. check if file is already existing using exist() method
        boolean fileExist = file.exists();
        if (fileExist) System.out.println("file is already existing");

        // 4. if not, create a file
        if (!fileExist) {
            try {
                // because create new file throws IOEx
                // we need to use try catch block
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 5. We can get name of file
        String name = file.getName();
        System.out.println("name: " + name);

        // 6. We can get path of file directory
        String path = file.getPath();
        System.out.println("path: " + path);

        // 7. There is also a group of methods canRead(), canWrite(), canExecute()
        // to test whether the application can read/modify/execute the file denoted by the path.
        boolean canRead = file.canRead();
        boolean canWrite = file.canWrite();
        boolean canExecute = file.canExecute();

        System.out.println(canRead); // true
        System.out.println(canWrite); // true
        System.out.println(canExecute); // true

        // 8. isFile() method checks if it is normal file
        boolean isFile = file.isFile();
        System.out.println(isFile); // true

        // 9. isDirectory() checks if it is a folder
        boolean isDirectory = file.isDirectory();
        System.out.println(isDirectory); // false

        boolean isDirectory2 = dir.isDirectory();
        System.out.println(isDirectory2); // true

        // 10. we can also create file in directory (f.e. desktop)
        //create string Path to home dir + desktop
        String desktopPath = System.getProperty("user.home") + "\\Desktop";
        String filename = "/testFile.txt";
        File file2 = new File(desktopPath + filename);
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 11. we can also create directory (f.e abc folder on desktop)
        String folderName = "/abc";
        File file3 = new File(desktopPath + folderName);
        file3.mkdir();

    }
}
