package java_snippets._31_Map_HashMap;

import java.util.HashMap;
import java.util.Map;

public class _21_Map_loop_using_entry {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "Jan");
        map.put("2", "Feb");
        map.put("3", "Mar");

        // classic way, loop a Map using Map.Entry and .entrySet() method
        for (Map.Entry<String, String> currentElement : map.entrySet()) {
            System.out.println("Key : " + currentElement.getKey() + " Value : " + currentElement.getValue());
        }

        // forEach and Lambda
        map.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
    }
}
