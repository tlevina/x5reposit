package TASK2;

public class RAM implements Components{
    private String manufacturer;
    private int size;
    private int frequency;
    private TypeRAM typeRAM;

    public RAM() {
    }

    public RAM(String manufacturer, int size, int frequency, TypeRAM typeRAM) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.frequency = frequency;
        this.typeRAM = typeRAM;
    }

    public void setRAM(String manufacturer, int size, int frequency, TypeRAM typeRAM) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.frequency = frequency;
        this.typeRAM = typeRAM;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "manufacturer= " + manufacturer +
                ", size=" + size +
                ", clockFrequency=" + frequency +
                ", typeRAM=" + typeRAM +
                '}';
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}
