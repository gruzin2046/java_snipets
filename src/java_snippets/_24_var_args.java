package java_snippets;

public class _24_var_args {

    // define method with var arguments
    static void printStrings(String...strings) {
        for(String s: strings) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String[] stringsArr = {"ala", "ma", "kota"};

        // 1. we can pass String array as a var arguments:
        printStrings(stringsArr);

        // 2. we can pass some strings
        printStrings("ala", "ma", "kota", "kot", "ma", "problem");
    }
}
