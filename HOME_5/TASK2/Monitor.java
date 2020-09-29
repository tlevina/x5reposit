package TASK2;

public class Monitor implements Components {
    private String name;

    public Monitor() {
    }

    public Monitor(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "name= " + name +
                '}';
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}
