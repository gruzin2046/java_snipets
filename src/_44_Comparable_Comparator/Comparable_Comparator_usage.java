package _44_Comparable_Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Comparable_Comparator_usage {
    public static void main(String[] args) {

        // I. Comparable usage - compareTo() method is defined in Product class
        // for standardized comparing, can be used inside Comparator

        // II. Comparator is a functional interface for comparing objects.
        // It has only one method - compare(Object o1, Object o2)

        // list of Product instances - class which implements Comparable
        Product[] products = new Product[7];
        products[0] = new Product("gloves", 22.4);
        products[1] = new Product("jacket", 123);
        products[2] = new Product("t-shirt", 44.3);
        products[3] = new Product("dress", 55.3);
        products[4] = new Product("trousers", 44.99);
        products[5] = new Product("shoes", 44.99);
        products[6] = new Product("hoodie", 100);


        // Arrays.sort(T[] a, Comparator<T> c) method takes array and Comparator as parameters

        // 1 .anonymous class - override Comparator inside: (not recommended - boiler code!)
        // only by name
        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        // by price
        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.price > o2.price) return 1;
                else if (o1.price < o2.price) return -1;
                return 0;
            }
        });

        // by compareTo() algorithm (defined in Product)
        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.compareTo(o2);
            }
        });

        // 2.lambda expression - create Comparator and override it automatically:
        // only by name
        Arrays.sort(products, (o1, o2) -> o1.name.compareTo(o2.name));

        // by price
        Arrays.sort(products, (o1, o2) -> {
            if(o1.price > o2.price) return 1;
            else if (o1.price < o2.price) return -1;
            return 0;
        });
        System.out.println(Arrays.deepToString(products));

        // by compareTo() algorithm (defined in Product)
        Arrays.sort(products, (o1, o2) -> o1.compareTo(o2));

        // 3.method reference - shorter notation for lambda
        // only by name
        Arrays.sort(products, Comparator.comparing(o -> o.name));

        // by price -> can not be simplified to method reference

        // by compareTo() algorithm (defined in Product)
        Arrays.sort(products, Product::compareTo);

    }
}
