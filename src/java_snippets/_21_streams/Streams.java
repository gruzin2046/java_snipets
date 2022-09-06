package java_snippets._21_streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) throws FileNotFoundException {

        // 1. Create stream of primitive based on elements sequence
        DoubleStream doubleStream = DoubleStream.of(1.2, 2.553, 3.0, 4.2, 5.12);

        // 2. Based on existing arr
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream intStream = IntStream.of(ints);

        // 3. Open string on existing list:
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("ala", "ma", "kota", "kot", "ma", "problem"));
        Stream<String> stringStream = strList.stream();

        // 4. Create stream using iterate(int startingValue, intUnaryOperator f)
        // intUnaryOperator is functional interface which takes int and returns int
        // in this case it is creating stream of integers starting from 0 to 100
        IntStream numStream = IntStream.iterate(0, x -> x + 1).limit(100);

        // 5. We can also open stream using methods from certain class
        String path = System.getProperty("user.dir") +
                "\\src\\java_snippets\\_41_Files_operations\\Read_using_BufferedReader" +
                "\\testFile.txt";

        // tokens() from Scanner
        Scanner scanner = new Scanner(new File(path));
        Stream<String> tokensStream = scanner.tokens();
        System.out.println(tokensStream.collect(Collectors.toList()));

        // lines() from BufferedReader
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedreader = new BufferedReader(fileReader);
        Stream<String> linesStream = bufferedreader.lines();
        System.out.println(linesStream.collect(Collectors.toList()));
    }
}
