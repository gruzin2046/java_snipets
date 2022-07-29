package _41_Files_operations.Read_using_Scanner;

import java.io.File;
import java.io.IOException;

public class Read_using_Scanner {
    public static void main(String[] args) throws IOException {
        String homeDir = System.getProperty("user.home");
        String path = homeDir + "\\IdeaProjects\\Java_start_snipets\\src\\" +
                "_41_Files_operations\\Read_using_Scanner\\testFile.txt";
        File file = new File(path);
        file.createNewFile();
    }
}
