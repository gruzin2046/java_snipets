package _1_14_Basics;

import _15_polymorphism.Dog;

public class _17_toString_method {
    public static void main(String[] args) {

        Dog pluto = new Dog("pluto", 10);

        // 1. By default, toString() method will return object:
        // class name + @ + hashCode() in hexadecimal system:
        System.out.println(pluto.toString()); //prints: _15_polymorphism.Dog@29

        // 2. we can @Override toString() method to show anything what we need,
        // in this case: "Dog: name='xxx', age=yyy"
        // -> see Dog class in polymorphism package
        System.out.println(pluto.toString()); //prints: Dog: name='pluto', age=10
    }
}
