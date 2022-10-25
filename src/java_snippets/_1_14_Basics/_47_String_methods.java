package java_snippets._1_14_Basics;

import java.util.Arrays;
import java.util.List;

public class _47_String_methods {
    public static void main(String[] args) {
        String str = "Albert";

        // 1. isEmpty() returns true if the string is empty, otherwise – false;
        str.isEmpty(); // true

        // 2. toUpperCase() returns a new string in uppercase;
        str.toUpperCase(); // ALBERT

        // 3. toLowerCase() returns a new string in lowercase;
        str.toLowerCase(); // albert

        // 4. startsWith(prefix) returns true if the string starts with the given string prefix
        str.startsWith("s"); // false

        // 5. endsWith(suffix) returns true if the string ends with the given string suffix
        str.endsWith("t"); // true

        // 6. contains(...) returns true if the string contains the given string or character;
        str.contains("t"); // true

        // 7. substring(beginIndex, endIndex) returns a substring
        // of the string in the range: beginIndex, endIndex - 1;
        str.substring(1, 3); // lb
        str.substring(1); // lbert

        // 8. replace(old, new) returns a new string obtained by replacing all occurrences
        // of old with new that can be chars or strings.
        str.replace('A', 'U'); // Ulbert

        // 9. trim() returns a copy of the string obtained by omitting the
        // leading and trailing whitespace. Note that whitespace includes not only the space character,
        // but mostly everything that looks empty: tab, carriage return, newline character, etc.
        String example = "  str  ";
        example.trim(); // str

        // 10 chars() opens IntStream of unicode values representation of each char (integers)
        List<Character> exampleCharacters = str.chars() //IntStream of unicode values (integers)
                .mapToObj(i -> (char) i) //casting to chars
                .toList(); // [A, l, b, e, r, t]

        // 11 split(String regex) returns a String[] array
        //    split(String regex, int limit) returns a String[] array with limit of elements in Array
        String sentence = "welcome to the jungle";
        String[] arr =  sentence.split(" "); // [welcome, to, the, jungle]
        String[] arr2 = sentence.split(" ", 2); // [welcome, to the jungle]
    }
}
