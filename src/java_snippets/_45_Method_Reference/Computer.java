package java_snippets._45_Method_Reference;

class Computer {
    private String name;
    private int cpu;
    private int temperature;

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", cpu=" + cpu +
                ", temperature=" + temperature +
                '}';
    }

    public Computer(String name, int cpu, int temperature) {
        this.name = name;
        this.cpu = cpu;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    void overclock() {
        cpu *= 1.1;
        temperature *= 1.1;
    }
}
