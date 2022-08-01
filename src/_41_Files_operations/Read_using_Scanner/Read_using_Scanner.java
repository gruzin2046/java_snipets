package _41_Files_operations.Read_using_Scanner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Read_using_Scanner {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        String projDir = System.getProperty("user.dir");
        String path = projDir +
                "\\src\\_41_Files_operations\\Read_using_Scanner" +
                "\\testFile.txt";
        File file = new File(path);
        System.out.println(path);
        // *. first create file if needed
        //file.createNewFile();

        // 1. Initiate scanner instance
        Scanner sc = new Scanner(file);
        // 2. Read file
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            // 3. Store data in ArrayList
            list.add(line);
        }

        sc.close();

        System.out.println(list); // [monday, tuesday, wednesday, thursday, friday, saturday, sunday]
    }
}
