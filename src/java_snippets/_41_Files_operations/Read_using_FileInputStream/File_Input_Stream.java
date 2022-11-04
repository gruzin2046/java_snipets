package java_snippets._41_Files_operations.Read_using_FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;


public class File_Input_Stream {
    public static void main(String[] args) {

        String path = ".\\src\\java_snippets\\_41_Files_operations\\Read_using_FileInputStream\\testFile.txt";

        // byte stream

        // Here we create a file input stream by specifying the name of the file.
        // The byte-by-byte approach also works here, similar to the character streams example.
        byte[] bytes = new byte[6];

        try (FileInputStream inputStream = new FileInputStream(path)) {
            inputStream.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (byte byte_ : bytes) {
            char c = (char) byte_;
            System.out.println(c);
            /*
            m
            o
            n
            d
            a
            y
            */
        }

    }
}
