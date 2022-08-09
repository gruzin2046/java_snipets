package java_snippets._30_Collections.Set;

// hierarchy of HashSet:
// HashSet(class) < AbstractSet(abstract class) < AbstractCollection (abstract class) < Collection (interface)
// HashSet(class) < Set(interface) < Collection (interface)

import java.util.HashSet;

public class HashSet_ {

    public static void main(String[] args) {
        // A Set is a collection of items where every item is UNIQUE
        // HashSet doesn't care about adding order of collection

        HashSet<String> animals = new HashSet<>();
        animals.add("Zebra");
        animals.add("Hippo");
        animals.add("Lion");
        animals.add("Zebra"); // is will be ignored - "Zebra" was added previously

        System.out.println(animals); // in this case it prints: [Zebra, Hippo, Lion]

        // in case of adding two new objects we need to remember about
        // override equals() method.
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Adam", "Ondra"));
        people.add(new Person("Adam", "Ondra"));
        // in this case we can add this two person, because equals() compare address in memory

        System.out.println(people); //prints:
        //[Person{firstName='Adam', secondName='Ondra'},Person{firstName='Adam', secondName='Ondra'}]


        //**************************
        /*Methods:
        add(E e) - return boolean,
        clear() - return void,
        clone() - Object, returns a shallow copy of this HashSet instance: the elements themselves are not cloned,
        contains(Object o) - return boolean,
        isEmpty() - return boolean
        iterator() - return Iterator<E>
        size() - return int
        spliterator() - return Spliterator<T>
        */
        //**************************
    }
}