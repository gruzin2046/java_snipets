package java_snippets._1_14_Basics;

public class _6_ObjectAsArgument {

    static class Person {
        String name;
        int age;
        Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }

    static Person albert = new Person("Albert", 31);

     static Person addAge(Person person) {
        person.age += 1;
        return person;
    }

    static Person olderAlbert = addAge(albert);

    public static void main(String[] args) {
        System.out.println(olderAlbert.age);
    }
}
