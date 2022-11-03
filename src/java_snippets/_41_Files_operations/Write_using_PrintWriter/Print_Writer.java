package java_snippets._41_Files_operations.Write_using_PrintWriter;

import java.io.*;

public class Print_Writer {
    public static void main(String[] args) {
        String path = ".\\src\\java_snippets\\_41_Files_operations\\Write_using_PrintWriter\\testFile.txt";
        File file = new File(path);

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.printf("%s dolor sit %s", "Lorem", "ipsum", "amet");
            printWriter.print("Hello"); // prints a string
            printWriter.println("Java"); // prints a string and then terminates the line
            printWriter.println(123); // prints a number
            printWriter.printf("You have %d %s", 400, "gold coins"); // prints a formatted string
        } catch (IOException e) {
            System.out.printf("An exception occurred %s", e.getMessage());
        }

        // output:
        // HelloJava
        // 123
        // You have 400 gold coins
    }
}
