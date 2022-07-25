package _1_14_Basics;

public class _13_Inheritance_Child_Class extends _13_Inheritance_Parent_Class {
    String favouriteCar = "porsche";

    //1. we can create constructor with inherit parent class constructor using super()
    _13_Inheritance_Child_Class(String name, int size, double price) {
        super(name, size, price);
    }

    //2. we can override methods from parent class creating different outcome
    @Override
    void printSong() {
        System.out.println("goodbye, goodbye Argentina...");
    }

    //3. We can override method from parent class adding content
    @Override
    void sayHello() {
        super.sayHello();
        System.out.println("its really nice to see you");
    }

    //4. We can access variable from parent class
    void printParentClassVar() {
        System.out.println(favouriteMeal);
    }

    //5. We can access variable (even with the same name) from parent class using super()
    void printFavouriteCar() {
        System.out.println(super.favouriteCar); //prints ferrari (parent class)
        System.out.println(favouriteCar); //prints porsche
    }

    public static void main(String[] args) {
        _13_Inheritance_Child_Class banana = new _13_Inheritance_Child_Class("Yellow", 3, 12.34);
        System.out.println("I'm " + banana.name);
        banana.printSong();
        banana.sayHello();
        banana.printFavouriteCar();
        banana.printParentClassVar();
    }
}

