package java_snippets._1_14_Basics;

public class _5_ObjectReference {
    public static void main(String[] args) {

        class Person {
            String name;
            int age;
            Person(String name,int age) {
                this.name = name;
                this.age = age;
            }
        }

        class Credit {
            int amount;
            // initiate borrower object of type Person
            Person borrower;
        }

        // 1. create reference from borrower to person1 object

        Person person1 = new Person("Jan", 32);
        Credit credit1 = new Credit();
        credit1.amount = 200;
        credit1.borrower = person1;

        System.out.println("Borrower " + credit1.borrower.name + " borrow " + credit1.amount + " $");
        // Prints: Borrower Jan borrow 200 $

        // 2. assign different values via different reference to the same instance

        Person personX = new Person("Brian", 12);
        Person personY = new Person("Brian", 12); // creates different object than personX (new)
        Person personZ = personY; // personZ points the same instance as personY

        personY.age = 50;
        personZ.age = 100;

        System.out.println(personY.age); // Prints: 100 because personZ refers to the same object as personY
    }
}
