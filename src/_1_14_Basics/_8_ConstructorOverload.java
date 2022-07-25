package _1_14_Basics;

public class _8_ConstructorOverload {
    int age;
    int idNumber;
    String name;
    String favouriteColor;

    //we can create several constructors
    //without params
    _8_ConstructorOverload() {
        //empty constructor
    }

    _8_ConstructorOverload(String name) {
        this.name = name + "_the_King";
    }

    _8_ConstructorOverload(int age, int idNumber, String name) {
        this.age = age;
        this.idNumber = idNumber;
        this.name = name;
    }

    //we also can use one constructor inside another using this()
    _8_ConstructorOverload(int a, int i, String n, String color) {
        //we call previous constructor method:
        this(a, i, n);
        this.favouriteColor = color;
    }

    public static void main(String[] args) {
        _8_ConstructorOverload obj1 = new _8_ConstructorOverload();
        _8_ConstructorOverload obj2 = new _8_ConstructorOverload("Udo");
        _8_ConstructorOverload obj3 = new _8_ConstructorOverload(23, 435, "Albert");
        _8_ConstructorOverload obj4 = new _8_ConstructorOverload(2, 22, "Dani", "pink");
        System.out.println(obj2.name); // prints: Udo_the_KIng
        System.out.println(obj4.favouriteColor); // prints: pink
        System.out.println(obj3.name + " is " + obj3.age + "years old");
    }
}
