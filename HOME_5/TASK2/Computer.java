package TASK2;

public class Computer {
    private CPU cpu;
    private RAM ram;
    private VC vc;
    private HDD hdd;
    private Monitor monitor;

    public Computer() {
        this.cpu = new CPU();
        this.ram = new RAM();
        this.vc = new VC();
        this.hdd = new HDD();
        this.monitor = new Monitor();
    }

    public void createComputer() {
        cpu.output();
        ram.output();
        vc.output();
        hdd.output();
        monitor.output();
    }
}
