package _41_Files_operations.Write_using_BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_Writer {
    public static void main(String[] args) {
        String projDir = System.getProperty("user.dir");
        String path = projDir +
                "\\src\\_41_Files_operations\\Write_using_BufferedWriter" +
                "\\testFile.txt";
        // 1. initiate FileWriter and BufferedWriter inside tryWithResources block
        // -> resources passed to try as arguments
        try (FileWriter fileWriter = new FileWriter(path);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
        {
            // write anything into file
            for (int i = 1; i <= 10; i++) {
                bufferedWriter.write("" + i);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
