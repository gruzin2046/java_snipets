package _1_14_Basics;

// Wrapper classes
import java.util.*;

public class _32_Wrapper_classes {

    public static void main(String[] args) { /*
        1. They convert primitive data types into objects.
        2. The classes in java.util package handles only objects and hence wrapper classes help in this case also.
        3. Data structures in the Collection framework, such as ArrayList and Vector,
           store only objects (reference types) and not primitive types. */
        ArrayList<Integer> arrayList = new ArrayList<>();
        /* 4. An object is needed to support synchronization in multithreading.

        char -> Character, byte -> Byte, short -> Short, int -> Integer,
        long -> Long, float -> Float, double -> Double  */

        // Autoboxing- primitive char to Character object conversion
        char ch = 'A';
        Character a = ch;
        System.out.println(a); // Prints: "A"


    }
}