package _15_polymorphism;

import java.util.Objects;

public class Dog extends Animal {
    public int age;
    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    // We can override equals() method to set it manually:


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return age == dog.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "Dog: " +
                "name='" + name + '\'' +
                ", age=" + age ;
    }

    void bark() {
        System.out.println("bark bark");
    }
}
