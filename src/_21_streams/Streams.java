package _21_streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.*;

public class Streams {
    // we can find length of the longest item in the list using for loop:
    public int lengthOfLongestString(List<String> list) {
        int length = list.get(0).length();
        for(String s: list) {
            if (s.length() > length) length = s.length();
        }
        return length;
    }

    // or simpler way creating a stream
    public Optional<Integer> lengthOfLongestString2(List<String> list) {
        return list.stream()
                .map(String::length)
                .max(Comparator.naturalOrder());
    }

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("ala", "ma", "kota", "kot", "ma", "problem"));
        Streams s = new Streams();
        System.out.println(s.lengthOfLongestString(strList));
        System.out.println(s.lengthOfLongestString2(strList));
    }
}