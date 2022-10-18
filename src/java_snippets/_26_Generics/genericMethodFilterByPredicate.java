package java_snippets._26_Generics;

import java.util.*;
import java.util.function.Predicate;

public class genericMethodFilterByPredicate {

    // 1. define method which takes generic list and generic predicate
    // 2. check condition define in predicate for every element in list
    // 3. if it matches add element to result arr
    // 4. return results

    public static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate) {
        return list.stream().filter(predicate).toList();
    }

    public static void main(String[] args) {
        String[] names = {"Anna", "Nico", "Adam", "Miriam", "Vito", "Albert"};
        LinkedList<String> namesList = new LinkedList<>(Arrays.asList(names));

        // use method to have only names ending with "o"
        List<String> namesEndingWithO = filterByPredicate(namesList, n -> n.endsWith("o"));
        System.out.println(namesEndingWithO); // [Nico, Vito]

        // use method to have only 6-letter names
        List<String> namesLengthEquals6 = filterByPredicate(namesList, n -> n.length() == 6);
        System.out.println(namesLengthEquals6); // [Miriam, Albert]

        // use method to have only names with double letters inside
        Predicate<String> doubleLettersInStringPredicate = n -> {
            long chars = n.chars().mapToObj(i -> (char) i).distinct().count();
            return chars != n.length();
        };

        List<String> namesWithDoubleLetters = filterByPredicate(namesList, doubleLettersInStringPredicate);
        System.out.println(namesWithDoubleLetters); // [Anna, Miriam]
    }
}
