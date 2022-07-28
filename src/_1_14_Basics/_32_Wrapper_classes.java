package _1_14_Basics;

// Wrapper classes
import java.util.*;

public class _32_Wrapper_classes {

    public static void main(String[] args) { /*
        1. They convert primitive data types into objects.
        f. e. we can create Integer from int or String,
        also String in other system like binary using valueOf() */
        Integer i1 = 10;
        Integer i2 = Integer.valueOf("123");
        Integer i3 = Integer.valueOf("1011", 2);
        System.out.println(i2); // prints: 123
        System.out.println(i3); // prints: 11
        /*
        2. The classes in java.util package handles only objects and
        hence wrapper classes help in this case also.
        3. Data structures in the Collection framework, such as ArrayList and Vector,
           store only objects (reference types) and not primitive types. */
        ArrayList<Integer> arrayList = new ArrayList<>();
        /* 4. An object is needed to support synchronization in multithreading.

        char -> Character, byte -> Byte, short -> Short, int -> Integer,
        long -> Long, float -> Float, double -> Double  */

        // 5. Conversions:
        // Autoboxing - primitive char to Character object conversion
        char ch = 'A';
        // Character a = Character.valueOf(ch); -> redundant syntax
        Character a = ch; // java is making Character.valueOf(ch) for us :)
        System.out.println(a); // Prints: "A"

        // AutoUnboxing - Character to primitive
        Character ch1 = 'B';
        // char b = ch1.charValue(); -> redundant syntax
        char b = ch1; // java is making ch1.charValue() for us :)
        System.out.println(b); // Prints: "B"

        // 6. compare using == operator
        // Integer from -127 till 128 can be compared using ==
        Integer iX = 120;
        Integer iY = 120;
        System.out.println(iX == iY); // prints: true

        //

    }
}