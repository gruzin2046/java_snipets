package java_snippets._26_Generics;

import java.util.*;
import java.util.function.Predicate;

public class _Generic_FilterByPredicate {

    // 1. define method which takes generic list and generic predicate
    // 2. check condition define in predicate for every element in list
    // 3. if it matches add element to result arr
    // 4. return results

    public static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element)) {
                result.add(element);
            }
        }
        return result;
    }

    /////////////////////////////////////////////////////////////////////////////////
    //// example:
    /////////////////////////////////////////////////////////////////////////////////
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
        List<String> namesWithDoubleLetters = filterByPredicate(namesList, n -> {
            List<Integer> integers = new ArrayList<>(List.of(0));
            for (int i = 0; i < n.length(); i++) {
                int counter = 0;
                for (int j = 0; j < n.length(); j++) {
                    if (n.charAt(i) == n.charAt(j))
                        counter++;
                }
                if (counter >= 2) integers.add(counter);
            }
            List<Integer> x = integers.stream().filter(i -> i >= 2).toList();
            return x.size() != 0;
        });

        System.out.println(namesWithDoubleLetters); // [Anna, Miriam]
    }
}

