package java_snippets._21_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("ala", "ma", "kota", "kot", "ma", "problem"));
        ArrayList<String> strListXYZ = new ArrayList<>(Arrays.asList("x", "y", "z"));

        // Intermediate operations

        // 1. boxed() - transform simple type stream to object stream,
        // for example IntStream to Stream<Integer>
        List<Integer> intList = IntStream.rangeClosed(0, 10)
                .boxed()
                .toList(); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // 2. distinct() - filter list and remove duplicates (list will contain unique objects)
        List<String> uniqueStrList = strList.stream()
                .distinct()
                .toList(); // [ala, ma, kota, kot, problem]

        // 3. map(Function<T> mapper) - changes one element to something based on function
        // same for mapToInt, mapToDouble, mapToLong
        // same for mapToObject
        List<String> stringListCapitalLetters = strList.stream()
                .map(string -> Character.toUpperCase(string.charAt(0)) + string.substring(1))
                .toList(); // [Ala, Ma, Kota, Kot, Ma, Problem]

        List<Double> mapToDouble = strList.stream()
                //.mapToDouble(string -> string.length()) // lambda expression
                .mapToDouble(String::length)
                .boxed()
                .toList(); // [3.0, 2.0, 4.0, 3.0, 2.0, 7.0]

        Stream<String> mapToBinaryString = IntStream.of(1, 8, 19, 23, 456, 7009)
                //.mapToObj(i -> Integer.toBinaryString(i)); // lambda expression
                .mapToObj(Integer::toBinaryString);
        System.out.println(mapToBinaryString);

        // 4. flatMap(Function<T,extends Stream<R>> mapper) - map stream of lists to stream of elements
        // for example from Stream<ArrayList<String>> to Stream<String>
        List<String> combinedStrLists = Stream.of(strList, strListXYZ)
                //.flatMap(list -> list.stream()) // lambda expression
                .flatMap(List::stream)
                .toList(); // [ala, ma, kota, kot, ma, problem, x, y, z]

        // 5. filter(Predicate<T> predicate) - filter collection base on predicate (boolean)
        List<String> filteredList = strList.stream()
                .filter(s -> s.startsWith("m"))
                .toList(); // [ma, ma]

        // 6. iterate(T seed, UnaryOperator<T> f) and limit(long maxSize)
        // - iterate using order (seed, unary operator) and limit of elements
        List<Integer> iterateToLimitList = IntStream.iterate(0, n -> n + 2)
                .limit(8) // max length of the stream
                .boxed()
                .toList(); // [0, 2, 4, 6, 8, 10, 12, 14]

        // 7. sorted() - returns stream sorted according to natural order
        //    sorted(Comparator<T> comparator) -||- according to the provided Comparator
        List<String> stringSortedNaturalOrder = strList.stream()
                .sorted()
                .toList(); // [ala, kot, kota, ma, ma, problem]
        System.out.println(stringSortedNaturalOrder);

        List<String> stringSortedByLength = strList.stream()
                //.sorted((str1,str2) -> str1.length() - str2.length()) // lambda expression
                .sorted(Comparator.comparingInt(String::length))
                .toList(); // [ma, ma, ala, kot, kota, problem]
        System.out.println(stringSortedByLength);

        List<Integer> hashCodesReversed = stringSortedNaturalOrder.stream()
                .map(String::hashCode)
                .sorted(Comparator.reverseOrder())
                .toList(); // [3298001, 106384, 96662, 3476, 3476, -309542241]

        // 8. skip(long n) - Returns a stream consisting of the remaining
        // elements of this stream after discarding the first n elements of the stream
        List<String> strListWithoutFirstTwo = strList.stream()
                .skip(2)
                .toList(); // [kota, kot, ma, problem]
     }
}
