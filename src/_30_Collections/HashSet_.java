package _30_Collections;

// hierarchy of HashSet:
// HashSet(class) < AbstractSet(abstract class) < AbstractCollection (abstract class) < Collection (interface)
// HashSet(class) < Set(interface) < Collection (interface)

import java.util.HashSet;

public class HashSet_ {

    public static void main(String[] args) {
        // A Set is a collection of items where every item is UNIQUE
        // rest is same like ArrayList

        HashSet<String> animals = new java.util.HashSet<>();
        animals.add("Zebra");
        animals.add("Hippo");
        animals.add("Lion");
        animals.add("Zebra"); // is will be ignored - "Zebra" was added previously


        System.out.println(animals); // in this case it prints: [Zebra, Hippo, Lion]

    }
}