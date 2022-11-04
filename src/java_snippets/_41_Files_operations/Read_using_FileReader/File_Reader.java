package java_snippets._41_Files_operations.Read_using_FileReader;

import java.io.FileReader;
import java.io.IOException;

public class File_Reader {
    public static void main(String[] args) {

        String path = ".\\src\\java_snippets\\_41_Files_operations\\Read_using_Scanner\\testFile.txt";

        // char stream

        // 1. Common way of reading a text data stream is to read it
        //    char by char until the stream is closed

        try (FileReader reader = new FileReader(path)) {
            int charAsNumber = reader.read();

            // When -1 is returned, it means the end of stream was reached,
            // so that is there's nothing left to read.

            while(charAsNumber != -1) {
                char character = (char) charAsNumber;
                System.out.print(character);
                charAsNumber = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
