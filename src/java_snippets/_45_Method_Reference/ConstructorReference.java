package java_snippets._45_Method_Reference;

import java.util.*;
import java.util.function.Supplier;


public class ConstructorReference {

    // define method which will take int and a Supplier<T>
    private static <T> List<T> generateRandomList(int elements, Supplier<T> supplier) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            result.add(supplier.get());
        }
        return result;
    }

    public static void main(String[] args) {
        // supplier takes nothing () and -> returns <T>

        // supplier can be defined as lambda
        // 1. in this case it calls constructor method:
        Supplier<Person> supplier2 = () -> new Person();

        // 2. so it can be written as constructor method reference:
        Supplier<Person> supplier = Person::new;
        List<Person> people = generateRandomList(5, supplier);
        System.out.println(people);
    }
}
