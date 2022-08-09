package java_snippets._15_polymorphism;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println("meow meow");
    }
}
