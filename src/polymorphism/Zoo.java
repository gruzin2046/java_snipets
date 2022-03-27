package polymorphism;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal("animal");
        Animal kitty = new Cat("kitty");
        Animal puppy = new Dog("puppy", 4);

        //1. We can NOT call method from Cat class on kitty because it is Animal instance
        // kitty.meow(); // error

        //2. Instead, we can cast kitty (Animal type) to type Cat:
        // first solution:
        Cat updatedKitty = (Cat)kitty;
        updatedKitty.meow();

        // second solution:
        ((Cat)kitty).meow();

        //3. We can NOT cast instance of Dog class to Cat (they are not related)
        //Cat updatedPuppy = (Cat)puppy; // error: ClassCastException
        //updatedPuppy.meow();

        //4. We can store Animal objects in the same array
        Animal[] animals = new Animal[3];
        animals[0] = kitty;
        animals[1] = puppy;
        animals[2] = animal;
        for (Animal animalObj : animals) {
            System.out.println(animalObj.name);
        }
    }
}
