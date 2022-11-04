package java_snippets._41_Files_operations;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Files_createFile {
    public static void main(String[] args) throws IOException {

        // Creation text files using Files.createFile() and writeString()
        // let's create path directory
        String projDir = System.getProperty("user.dir");
        String home = System.getProperty("user.home");
        String desktop = System.getProperty("user.home") + "\\Desktop";
        String tmp = System.getProperty("java.io.tmpdir");
        System.out.println(home); // prints: C:\Users\aluniewi
        System.out.println(desktop); // prints: C:\Users\aluniewi\Desktop
        System.out.println(tmp); // prints: C:\Users\aluniewi\AppData\Local\Temp\

        // create empty file using:
        Files.createFile(
                Path.of(home, "Desktop", "testFile.txt"));
        // create empty file, same directory:
        Files.createFile(
                Path.of(desktop,  "file2.txt"));
        // create file with string in it:
        Path p3 = Files.writeString(
                Path.of(home, "Desktop", "stringFile.txt"),
                "hello you",
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE
        );
    }

}
