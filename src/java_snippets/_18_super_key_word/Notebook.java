package java_snippets._18_super_key_word;

public class Notebook extends Computer {
    double batteryCapacity;
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

    public static void main(String[] args) {
        Notebook myNotebook = new Notebook(98432, 124, 20000);
        myNotebook.printParameters(myNotebook);
    }
}
