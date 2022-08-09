package java_snippets._41_Files_operations;

import java.io.File;
import java.io.IOException;

public class File_class {
    public static void main(String[] args) {

        // 1. create file name and assign it to string
        String fileName = "testFile.txt";

        // 2. create File class instance
        File file = new File(fileName);

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

        // 5. we can also create file in directory (f.e. desktop)
        //create string Path to home dir + desktop
        String desktopPath = System.getProperty("user.home") + "\\Desktop";
        String filename = "/testFile.txt";
        File file2 = new File(desktopPath + filename);
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 6. we can also create directory (f.e abc folder on desktop)
        String folderName = "/abc";
        File file3 = new File(desktopPath + folderName);
        file3.mkdir();

    }
}
