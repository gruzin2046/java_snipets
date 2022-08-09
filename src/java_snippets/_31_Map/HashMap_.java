package java_snippets._31_Map;

import java.util.*;
import java.util.stream.Collectors;
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

        // we also can get keys and values as a pair using entrySet()
        Set<Map.Entry<Integer, String>> countriesEntrySet = countries.entrySet();
        for (Map.Entry<Integer, String> entry: countriesEntrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}