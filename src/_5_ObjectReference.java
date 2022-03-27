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


        Person person1 = new Person("Jan", 32);
        Credit credit1 = new Credit();
        credit1.amount = 200;

        // create reference from borrower to person1 object
        credit1.borrower = person1;

        System.out.println("Borrower " + credit1.borrower.name + " borrow " + credit1.amount + " $");

    }
}
