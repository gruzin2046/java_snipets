package java_snippets._18_super_key_word;

public class Computer {
    double cpuTemperature;
    int ramMemory;
    String producer = "Apple";

    Computer(double cpuTemperature, int ramMemory) {
        this.cpuTemperature = cpuTemperature;
        this.ramMemory = ramMemory;
    }

    public void printParameters(Computer computer) {
        System.out.println("Computer params: " +
                            "\ncpu temperature: " + cpuTemperature +
                            "\nram memory: " + ramMemory);
    }
}
