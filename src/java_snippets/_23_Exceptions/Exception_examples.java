package java_snippets._23_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exception_examples {
    public static void main(String[] args) {

        // 1. ArithmeticException
        int a = 2;
        int b = 0;
        int c = (a / b); // throws ArithmeticException

        // 2. NumberFormatException
        String strToParse = "123x";
        int number = Integer.parseInt(strToParse); // throws NumberFormatException

        // 3. NullPointerException
        String data = null;
        data.length(); // throws NullPointerException

        // 4. ClassCastException
        String[] strArray = new String[] { "John", "Snow" };
        ArrayList<String> strList = (ArrayList<String>) Arrays.asList(strArray); // throws ClassCastException
        // in this case it throws ClassCastException because Arrays.asList(strArray)
        // returns List<String>, not ArrayList<String>

        // 5. ArrayIndexOutOfBoundsException
        String[] arr = new String[5];
        arr[6] = "More Data"; // throws ArrayIndexOutOfBoundsException

        // 6. NegativeArraySizeException
        String[] arr2 = new String[-5]; // throws Runtime Exception
        arr2[1] = "More Data";

        // 7. NoSuchElementException
        Set set = new HashSet();
        set.iterator().next(); // throws NoSuchElementException
        // You can't iterate through an empty iterator!

    }
}
