package java_snippets._45_Method_Reference;

import java.util.List;
import java.util.function.Consumer;

class Method_reference {

    private static void consume(List<Computer> computers, Consumer<Computer> consumer) {
        for (Computer computer : computers) {
            consumer.accept(computer);
        }
    }

    private void printComputerWithTemperature(Computer computer) {
        String textToPrint = computer.getName() + " " + computer.getCpu();
        if (computer.getTemperature() < 50)
            textToPrint += " / cold";
        else
            textToPrint += " / hot";
        System.out.println(textToPrint);
    }

    public static void main(String[] args) {

        // There are three ways to use method reference:

        // 1. Class::staticMethod,
        // 2. Object::methodCallOnInstance - non-static method
        //    previous creation of object instance is necessary,
        // 3. Class::methodCallOnInstance - equals to x.method(y)
        //    where x and y are arguments.

        List<Computer> computers = List.of(
                new Computer("Lenovo", 3000, 45),
                new Computer("HP", 3200, 66),
                new Computer("Apple", 3400, 78),
                new Computer("Asus", 2800, 42)
        );

        // 1. Class::staticMethod
        // static println method is build in System class
        consume(computers, System.out::println);

        // 2. Object::methodCallOnInstance
        Method_reference computerMethods = new Method_reference();
        // not-static printComputerWithTemperature method is defined inside Method_reference class
        consume(computers, computerMethods::printComputerWithTemperature);

        // 3. Class::methodCallOnInstance
        // not-static overclock method is defined inside Computer class
        consume(computers, Computer::overclock);
    }

}
