package TASK2;

public class HDD implements Components {
    private String manufacturer;
    private int size;
    private TypeHDD typeHDD;
    private TypeFactorHDD typeFactorHDD;

    public HDD() {
    }

    public HDD(String manufacturer, int size, TypeHDD typeHDD, TypeFactorHDD typeFactorHDD) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.typeHDD = typeHDD;
        this.typeFactorHDD = typeFactorHDD;
    }

    public void setHDD(String manufacturer, int size, TypeHDD typeHDD, TypeFactorHDD typeFactorHDD) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.typeHDD = typeHDD;
        this.typeFactorHDD = typeFactorHDD;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "manufacturer= " + manufacturer  +
                ", size=" + size +
                ", typeHDD=" + typeHDD +
                ", formFactorHDD=" + typeFactorHDD +
                '}';
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}
