package java_snippets._16_interface_lambda_anonymClass;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    /*
       List on all functional interfaces:
       https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html

       1. Consumer<T> - posiada metodę accept(T t) -
    przyjmuje argument typu T, ma za zadanie wykonać pewną operację i nie zwraca wyniku,
       2. Function<T, R> - posiada metodę apply(T t) -
    reprezentuje funkcję przyjmującą argument typu T i zwracającą argument typu R,
       3. Predicate<T> - posiada metodę test(T t) -
    przyjmuje argument typu T i zwraca wartość typu boolean,
       4. Supplier<T> - posiada metodę get()
    - tworzy nowy obiekt typu T. */

    public static void main(String[] args) {
        String[] names = {"Anna", "Nico", "Adam", "Miriam", "Vito"};
        LinkedList<String> namesList = new LinkedList<>(Arrays.asList(names));

        System.out.println(namesList);

        // 1. Consumer<T>: takes <T>, returns void
        Consumer<String> stringPrinter = s -> System.out.println("I'm printing string: " + s);
        stringPrinter.accept("xyz"); // I'm printing string: xyz

        // stream example:
        namesList.stream()
                // forEach method takes Function
                .forEach(n -> System.out.print("{" + n + "}")); // {Anna}{Nico}{Adam}{Miriam}{Vito}
                //.forEach(n -> System.out.println(n));


        // 2. Function<T, R>: takes <T>, returns <R>
        Function<String, Integer> stringParsAndMultiplyX10 = s -> Integer.parseInt(s) * 10;
        stringParsAndMultiplyX10.apply("10"); // 100

        // stream example:
        List<String> namesToUpperCase = namesList.stream()
                // map method takes Function
                .map(String::toUpperCase).toList();
                //.map(n -> n.toUpperCase()).toList();

        System.out.println(namesToUpperCase); // [ANNA, NICO, ADAM, MIRIAM, VITO]

        // 3. Predicate<T>: takes <T>, returns boolean
        Predicate<String> stringStartsWithA = s -> s.startsWith("A");
        stringStartsWithA.test("Agamemnon"); // true
        stringStartsWithA.test("Zarathustra"); // false

        // stream example:
        List<String> namesStartsWithA = namesList.stream()
                // filter method takes Predicate
                .filter(n -> n.startsWith("A")).toList();

        System.out.println(namesStartsWithA); //[Anna, Adam]

        // 4. Supplier<T>: takes void, returns <T>
        Supplier<LocalDateTime> time = () -> LocalDateTime.now();
        LocalDateTime timeNow = time.get();

        System.out.println(timeNow); // 2022-08-11T14:14:55.026751100

    }
}
