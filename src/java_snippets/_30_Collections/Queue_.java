package java_snippets._30_Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue_ {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Andrzej");
        queue.add("Leszek");
        queue.add("Wojtek");
        queue.add("Marcel");
        System.out.println(queue); // [Andrzej, Leszek, Wojtek, Marcel]

        // we can use PriorityQueue with comparator interface in it (same like HashTree)
        // in this case reversed natural (alphabetical) order
        Queue<String> names = new PriorityQueue<>((o1, o2) -> - o1.compareTo(o2));
        names.add("Andrzej");
        names.add("Leszek");
        names.add("Wojtek");
        names.add("Marcel");

        System.out.println(names); // [Wojtek, Marcel, Leszek, Andrzej]

        // queue methods:
        // 1. peek() - return first elem
        System.out.println(queue.peek()); // Andrzej
        // 2. poll() - return and remove first elem
        System.out.println(queue.poll()); // Andrzej
        System.out.println(queue.poll()); // Leszek

        // 3. offer()
        // we can initiate ArrayBlockingQueue with max capacity
        Queue<Integer> integers = new ArrayBlockingQueue<>(2);
        integers.offer(1);
        integers.offer(2);
        // offer is adding elem like add() but if capacity is full, no exception is thrown
        integers.offer(3);
        System.out.println(integers); // [1, 2]
    }
}
