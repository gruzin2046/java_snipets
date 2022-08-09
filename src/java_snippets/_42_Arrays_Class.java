package java_snippets;

import java.util.Arrays;

public class _42_Arrays_Class {
    public static void main(String[] args) {
        String[] names = {"Anna", "Nico", "Adam", "Miriam"};
        int[] numbers = {1, 23, 433, 66, 666, 912, 34};
        int[] numbers2 = new int[5];

        // 1. convert any array to String using toString() method
        String toString = Arrays.toString(numbers); // [1, 23, 433, 66, 666, 912, 34]

        // 2. sort any array using sort() method
        Arrays.sort(names); // [Adam, Anna, Miriam, Nico]
        Arrays.sort(numbers); // [1, 23, 34, 66, 433, 666, 912]

        // 3. copy using copyOf(array arr, int numberOfElemToCopy)
        String[] names2 = Arrays.copyOf(names, 3); //[Adam, Anna, Miriam]

        // 3.1 copy using
        // System.arraycopy(copyFrom arr, indexFrom int, copyTo arr, indexFrom int, howManyElem int)
        System.arraycopy(numbers, 3, numbers2, 0,3);
        System.out.println(Arrays.toString(numbers2)); //[66, 433, 666, 0, 0]

        // 4. compare using equals()
        String[] names3 = {"Adam", "Anna", "Miriam"};
        Arrays.equals(names2, names3); //true

        // 5. fill array with default value
        Arrays.fill(names, "default"); // [default, default, default, default]

    }
}
