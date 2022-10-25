package java_snippets;

import java.util.Arrays;

public class _24_var_args {

    // 1. define method with var arguments
    static void printStrings(String...strings) {
        Arrays.stream(strings).forEach(System.out::println);
    }

    // 2 we can use array in both cases,
    //   long[] longNumbers = { 5L, 8L, 10L };
    //   so varargs can be used to pass an array
    public static void methodX(long... longNumbers) {/* do something*/}
    public static void methodY(long[] longNumbers) {/* do something*/}

    public static void main(String[] args) {
        String[] stringsArr = {"ala", "ma", "kota"};

        // 1a. we can pass String array as a var arguments:
        printStrings(stringsArr);
        // 1b. we can pass some strings
        printStrings("ala", "ma", "kota", "kot", "ma", "problem");


        long[] longNumbers = { 5L, 8L, 10L };

        // 2a
        methodX(longNumbers);
        // 2b
        methodY(longNumbers);
    }
}
