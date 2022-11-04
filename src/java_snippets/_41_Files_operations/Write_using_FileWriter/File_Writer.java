package java_snippets._41_Files_operations.Write_using_FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {
    // using:
    // new FileWriter(String fileName, boolean append);
    // if append == true -> then data will be written to the end of the file


    // 1. methods like createFile() have to throw IOException
    static void createFile(File file) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write("what tha hell? ");
        // also, writer needs to be closed
        writer.close();
    }

    public static void main(String[] args) {
        String path = ".\\src\\java_snippets\\_41_Files_operations\\Write_using_FileWriter\\testFile.txt";
        File file = new File(path);

        // methods like createFile() needs to be surrounded by try catch block
        try {
            createFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. there is a better way!
        // Since Java 7, a convenient way to close an object of FileWriter
        // is to use the try-with-resources statement.

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
