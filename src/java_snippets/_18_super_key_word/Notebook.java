package java_snippets._18_super_key_word;

public class Notebook extends Computer {
    double batteryCapacity;
    String producer = "hp";

    Notebook(double cpuTemperature, int ramMemory, double batteryCapacity) {
        // 1. super key word allows using constructor from parent class
        // inside constructor of the child class:
        super(cpuTemperature, ramMemory);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void printParameters(Computer notebook) {
        // 2. super allows us also using method from parent class
        // which is now override:
        super.printParameters(notebook);
        System.out.println("batteryCapacity: " + batteryCapacity);
    }

    public void printProducerName() {
        // 3. super allows us to access parent class field
        System.out.println("parent class producer name " + super.producer);
        System.out.println("child class producer name " + producer);
    }

    public static void main(String[] args) {
        Notebook myNotebook = new Notebook(98432, 124, 20000);
        myNotebook.printParameters(myNotebook);
        myNotebook.printProducerName();
    }
}
