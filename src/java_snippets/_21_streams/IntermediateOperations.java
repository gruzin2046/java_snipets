package java_snippets._21_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
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

        // 3. flatMap() - map stream of lists to stream of elements
        // for example from Stream<ArrayList<String>> to Stream<String>
        List<String> combinedStrLists = Stream.of(strList, strListXYZ)
                //.flatMap(list -> list.stream()) // lambda expression
                .flatMap(List::stream)
                .toList(); // [ala, ma, kota, kot, ma, problem, x, y, z]

        // 4. iterate(T seed, UnaryOperator<T> f) and limit(long maxSize)
        List<Integer> iterateToLimitList = IntStream.iterate(0, n -> n + 2)
                .limit(8) // max length of the stream
                .boxed()
                .toList(); // [0, 2, 4, 6, 8, 10, 12, 14]
    }
}
