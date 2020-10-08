package Task1;

public class Circle implements Shape{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double square() {
        return Math.PI * r * r;
    }
}
