package java_snippets._20_43_Adv_Topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _20_Iterator {
    public static void main(String[] args) {

        String[] names = {"ala","ada","asia","kasia","beata","kamil"};
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList); // [ala, ada, asia, kasia, beata, kamil]

        // create iterator based on list.
        // iterator is a pointer who point certain element on the list.
        // we can use iterator to remove element from dynamic list,
        // without problems with index.

        // use while + iterator.hasNext() to walk through the list
        // hasNext() is returning boolean
        Iterator<String> iterator = nameList.iterator();
        while (iterator.hasNext()) {
            String currentElement = iterator.next();
            if (currentElement.equals("ada")) {
                iterator.remove();
            }
        }

        // same action but different syntax:
        // removeIf(Predicate predicate)
        nameList.removeIf(currentElement -> currentElement.equals("beata"));

        System.out.println(nameList); // [ala, asia, kasia, kamil]
    }
}
