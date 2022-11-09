package java_snippets._21_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ints = ints.parallelStream()
                .map(ParallelStream::incrementValue)
                .collect(Collectors.toList());

        System.out.println(ints); // [2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
    }

    public static int incrementValue(int x) {
        System.out.println("I process " + x);
        return x + 1;

        // 1. parallelStream() is processing multiple actions in the same time, but splitting and merge streams
        //    can cost more time than sequential stream time in some cases, so it needs to be used carefully.
        //
        // 2. processing is making without standard order, and every time it can be different, f.e. :

        /*  I process 8
            I process 3
            I process 6
            I process 2
            I process 9
            I process 10
            I process 5
            I process 1
            I process 7
            I process 4
        */

        // 3. even if it is processing without order, it is gathered in order:
        // System.out.println(ints); // [2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
    }

}
