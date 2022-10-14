package java_snippets._21_streams;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("ala", "ma", "kota", "kot", "ma", "problem"));

        // Terminal operations are ending a stream

        // 1. forEach(Consumer c)
        strList.stream()
                .forEach(e -> System.out.println(e + " " + e.hashCode()));

        // 2. count() returns long
        long numberOfElements = strList.stream()
                .filter(e -> e.startsWith("a"))
                .count(); // 6

        // 3. min(Comparator c) and max(Comparator c) returns Optional<T>
        Optional<String> strWithHighestHashCode = strList.stream()
                //.max((a,b) -> a.hashCode() - b.hashCode()); // lambda expression
                .max(Comparator.comparingInt(String::hashCode)); // Optional[kota]

        // 4. anyMatch(Predicate p), allMatch(Predicate p), noneMatch(Predicate p) returns boolean
        boolean allStringsLongestThanTwoChar = strList.stream()
                .allMatch(p -> p.length() > 2); // false

        // 5. toArray(intFunction generator)
        // intFunction is a functional interface which take int (size) and return Array[size]
        String[] strArr = strList.stream()
                .filter(e -> e.startsWith("a"))
                //.toArray(size -> new String[size]); // lambda expression
                .toArray(String[]::new);

        // 6. toList()
        List<String> strStartingWithAList = strList.stream()
                .filter(e -> e.startsWith("a"))
                .toList();

        // 7. collect(Collector c)
        String strConcat = strList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(" ")); // ALA MA KOTA KOT MA PROBLEM

        // 8. T reduce(T identity, BinaryOperator<T> accumulator);
        String strConcatByReduce = strList.parallelStream()
                .reduce("", (a, b) -> a + " " + b)
                .trim(); // ala ma kota kot ma problem

    }
}
