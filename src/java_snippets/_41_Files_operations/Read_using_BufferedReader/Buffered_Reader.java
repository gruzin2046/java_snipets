package java_snippets._41_Files_operations.Read_using_BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Buffered_Reader {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String projDir = System.getProperty("user.dir");
        String path = projDir +
                "\\src\\java_snippets\\_41_Files_operations\\Read_using_BufferedReader" +
                "\\testFile.txt";
        // 1. initiate FileReader and BufferedReader inside tryWithResources block
        // -> resources passed to try as arguments
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedreader = new BufferedReader(fileReader))
        {
            String nextLine;
            while ((nextLine = bufferedreader.readLine()) != null) {
                // 2. save read lines into Array list
                list.add(nextLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(list); // [monday, tuesday, wednesday, thursday, friday, saturday, sunday]
    }
}
