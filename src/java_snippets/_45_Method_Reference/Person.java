package java_snippets._45_Method_Reference;

import java.util.Random;

class Person {
    private static String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
    private static String[] lastNames = {"Sienkiewicz", "Kowalski", "Zalewski", "Korzeniewski"};
    private static int[] ages = {22, 33, 44, 55};
    private static Random random = new Random();

    private String firstName;
    private String lastName;
    private int age;

    Person() {
        firstName = firstNames[random.nextInt(firstNames.length)];
        lastName = lastNames[random.nextInt(lastNames.length)];
        age = ages[random.nextInt(ages.length)];
    }
}
