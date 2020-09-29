package TASK2;

public class CPU implements Components{
    private int frequency;
    private int core;
    private int cacheMemory;
    private String name;
    private String manufacturer;

    public CPU() {
    }

    public CPU(int frequency, int core, int cacheMemory, String name, String manufacturer) {
        this.frequency = frequency;
        this.core = core;
        this.cacheMemory = cacheMemory;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public void setCPU(int frequency, int core, int cacheMemory, String name, String manufacturer) {
        this.frequency = frequency;
        this.core = core;
        this.cacheMemory = cacheMemory;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "CPU{" +
                " frequency= " + frequency +
                ", core=" + core +
                ", cacheMemory=" + cacheMemory +
                ", name= " + name +
                ", manufacturer= " + manufacturer  +
                '}';
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}
