package task2;

public class Horse extends Animal {
    String kind;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Horse(String name, String food, String location, String kind) {
        super(name, food, location);
        this.kind = kind;
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " ржёт ");
    }

    @Override
    public void eat() {
        System.out.println(name + " жуёт " + food);
    }
}
