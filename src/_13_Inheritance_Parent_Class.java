public class _13_Inheritance_Parent_Class {
    String name;
    int size;
    double price;
    String favouriteCar = "ferrari";
    String favouriteMeal = "pasta";

    _13_Inheritance_Parent_Class(String name, int size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    void printSong() {
        System.out.println("na na na, laj laj laj");
    }
    void sayHello() {
        System.out.println("Hello stranger");
    }
}
