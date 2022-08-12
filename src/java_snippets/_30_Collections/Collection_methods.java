package java_snippets._30_Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection_methods {
    public static void main(String[] args) {
        String lorem = "lorem ipsum dolor sit amet consectetur adipiscing elit" +
                " morbi vel blandit nisl phasellus posuere urna ut magna pellentesque" +
                " quis aliquam libero porta quisque nisl felis congue in quam nec" +
                " porttitor eleifend ante in scelerisque diam ac lacinia efficitur" +
                " aenean tempus aliquam pulvinar nunc laoreet pulvinar tristique" +
                " in at porttitor ante";

        List<String> list = Arrays.asList(lorem.split(" "));

        // Collections methods

        // 1. shuffle(List list)
        Collections.shuffle(list);
        // 2. sort(list) , sort(List list, Comparator c)
        Collections.sort(list, String::compareTo);
        // 3. binarySearch(List list, Object key) - returns position from natural-sorted collection
        int position = Collections.binarySearch(list, "ante");
        System.out.println(position); // 6
        // 4. freq(List list, Object o)
        int frequency = Collections.frequency(list, "in");
        System.out.println(frequency); // 3
        // 5. min(List list, Comparator c)
        String min = Collections.min(list, Comparator.comparingInt(String::length));
        System.out.println(min); // ac
    }
}
