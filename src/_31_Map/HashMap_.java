package _31_Map;

import java.util.*;
// hierarchy of hashmap:
// LinkedHashMap(class) < HashMap(class) < AbstractMap (abstract class) < Map (interface)

public class HashMap_ {

    public static void main(String[] args) {
        //hashmap is arrayList with key-value pairs
        HashMap<Integer,String> countries = new HashMap<>();
        countries.put(1, "Russia");
        countries.put(2, "USA");
        countries.put(3, "China");

    /* useful methods:
    .put(key, value) .get(k) .replace(k, v) .remove(k) .clear()
    .keySet() .values() .containsKey(k) .containsValue(v)
    .isEmpty() .size() .putIfAbsent(k, v) .getOrDefoult(key, default value) */

        for (int key: countries.keySet()) {
            System.out.println(key); //Prints: 1,2,3
        }
        for (String values: countries.values()) {
            System.out.println(values); //Prints: Russia, USA, China
        }
    }
}