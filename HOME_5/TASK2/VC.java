package TASK2;

public class VC implements Components {
    private String manufacturer;
    private TypeRAMVC typeRAMVC;
    private int size;
    private Cooling cooling;

    public VC() {
    }

    public VC(String manufacturer, TypeRAMVC typeRAMVC, int size, Cooling cooling) {
        this.manufacturer = manufacturer;
        this.typeRAMVC = typeRAMVC;
        this.size = size;
        this.cooling = cooling;
    }

    public void setGC(String manufacturer, TypeRAMVC typeRAMVC, int size, Cooling cooling) {
        this.manufacturer = manufacturer;
        this.typeRAMVC = typeRAMVC;
        this.size = size;
        this.cooling = cooling;
    }

    @Override
    public String toString() {
        return "VC{" +
                "manufacturer=" + manufacturer +
                ", typeRAMVC=" + typeRAMVC +
                ", size=" + size +
                ", cooling =" + cooling +
                '}';
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}
