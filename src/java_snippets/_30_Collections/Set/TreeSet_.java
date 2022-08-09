package java_snippets._30_Collections.Set;
import java.util.Arrays;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        // 1. tree set is taking care of sorting,
        // based on compareTo() algorithm defined inside object class
        // in this case, inside Person:

        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("Tom", "Ford"));
        people.add(new Person("Albert", "Einstein"));
        people.add(new Person("Nicola", "Tesla"));
        people.add(new Person("Johan", "Gutenberg"));
        people.add(new Person("Henry", "Ford"));


        System.out.println(people);
        //[Albert Einstein, Henry Ford, Tom Ford, Johan Gutenberg, Nicola Tesla]

        // 2. we can also implement Comparator method compare() creating TreeSet
        // in this case inverse alphabetical order (from Z to A)

        TreeSet<String> fruits = new TreeSet<>((o1, o2) -> -o1.compareTo(o2));
        String[] strings = new String[] {"mango", "banana", "kiwi", "pineapple", "apple", "watermelon"};
        fruits.addAll(Arrays.asList(strings));

        // anonymous class syntax for implementation :
        /*TreeSet<String> fruits = new TreeSet<>(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });*/

        System.out.println(fruits);
        // [watermelon, pineapple, mango, kiwi, bananas, apple]
    }
}
