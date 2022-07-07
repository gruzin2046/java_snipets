import _15_polymorphism.Dog;

public class _14_equals_hashcode_method {
    public static void main(String[] args) {
        Dog dog = new Dog("matty hong", 2242324);
        Dog dog2 = dog;
        Dog dog3 = new Dog("matty hong", 2242324);

        // 1. equals() method
        // We can use == operator to compare simple types.
        // If we use it co compare Objects, like strings we compare address in memory instead:
        System.out.println(dog == dog2); // Prints: true
        System.out.println(dog == dog3); // Prints: false
        // To compare objects values we use equals() method
        System.out.println(dog.equals(dog2)); // Prints: true
        System.out.println(dog.equals(dog3)); // Prints: true
        // We can override equals() method to set it manually:
        // view Dog class in polymorphism package

        // 2. hashcode method returns int based on numbers value of all parts of objects
        System.out.println(dog.hashCode()); // Prints: 242355
        System.out.println(dog2.hashCode()); // Prints: 242355
        System.out.println(dog3.hashCode()); // Prints: 242355

        // also, we have to remember that hashCode() will return
        // same number if sum of hash will be equal, even if objects will differ:
        String string = "FB";
        String string2 = "Ea";
        System.out.println(string.hashCode()); // Prints: 2236
        System.out.println(string2.hashCode()); // Prints: 2236
    }
}




