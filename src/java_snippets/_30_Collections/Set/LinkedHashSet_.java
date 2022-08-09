package java_snippets._30_Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet_ {
    public static void main(String[] args) {
        // A Set is a collection of items where every item is UNIQUE

        // HashSet doesn't care about adding order of collection
        HashSet<String> strings = new HashSet<>();

        strings.add("C");
        strings.add("2");
        strings.add("B");
        strings.add("3");
        strings.add("A");
        strings.add("4");

        System.out.println(strings); // [A, 2, B, C, 3, 4]

        // LinkedHashSet care about adding order of collection
        LinkedHashSet<String> strings2 = new LinkedHashSet<>();
        strings2.add("C");
        strings2.add("2");
        strings2.add("B");
        strings2.add("3");
        strings2.add("A");
        strings2.add("4");

        System.out.println(strings2); // [A, 2, B, C, 3, 4]

    }
}
