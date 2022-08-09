package java_snippets._30_Collections.Set;

public class Person implements Comparable<Person> {
    String firstName;
    String secondName;

    @Override
    public String toString() {
        return  firstName + " " + secondName;
    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public int compareTo(Person o) {
        int secName = secondName.compareTo(o.secondName);
        return (secName != 0) ? secName : firstName.compareTo(o.firstName);
    }
}
