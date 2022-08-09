package java_snippets._21_streams;

import java.util.Arrays;

public class Stream_reduce {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // A simple sum operation using a for loop:
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("sum : " + sum); // 55

        // The equivalent in Stream.reduce():
        // init value = 0
        int sum1 = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
        //it can be replaced by:
        int sum2 = Arrays.stream(numbers).reduce(0, Integer::sum);
        System.out.println("sum : " + sum1); // 55
    }
}
