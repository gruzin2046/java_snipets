package java_snippets._23_Exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class try_with_recourses {

    // 1. consider following example:
    // FileReader input stream needs to be closed, but it needs to be
    // surrounded by another try - catch block:


    // java_snippets/_23_Exceptions/testFile.txt

    static void readFile(String path) throws IOException {
        Reader reader = null;
        try {
            reader = new FileReader(path);
            throw new RuntimeException("Exception1");
        } finally {
            try {
                reader.close(); // throws new RuntimeException("Exception2")
            } catch (Exception e) {
                // handle the Exception2
            }
        }
    }

    // 2. Let's replace it with try with resources block

    static void readFile2(String path) {
        try (Reader reader = new FileReader(path) ) {
            // do something
        } catch (IOException e) {
            // handle the Exception
        }
    }

    public static void main(String[] args) {
        String path = ".\\src\\java_snippets\\_23_Exceptions\\testFile.txt";
        //readFile(path);
        readFile2(path);
    }

}
