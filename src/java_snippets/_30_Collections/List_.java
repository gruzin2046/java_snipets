package java_snippets._30_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class List_ {
    //Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
    public static void main(String[] args) {
        String[] names = {"Anna", "Nico", "Adam", "Miriam", "Vito"};
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList(names));

        /* Methods:
        .add(index, element), .add(element), addFirst(element), addLast(element),
        .remove(), .remove(Object), .remove(index), .removeFirst(), .removeLast(),
        .removeFirstOccurrence(Object), .removeLastOccurrence(Object),
        .get(index), .getFirst(), .getLast(), .set(index, .element),
        .clone(), .clear(), .contains(Object), .size(),
        .pop() - remove and return the top element from the stack,
        .push(element),
        .indexOf(Object), .lastIndexOf(Object) .toArray(), toString()
        */

        List<String> namesStartsWithA = linkedList.stream()
                .filter(n -> n.startsWith("A")).toList();
        System.out.println(namesStartsWithA); //[Anna, Adam]
    }
}
