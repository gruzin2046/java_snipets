package _30_Collections;

import java.util.Arrays;
import java.util.LinkedList;

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

        // Creating a LinkedList object to represent a stack.
        LinkedList<Integer> stack = new LinkedList<>();



    }
}
