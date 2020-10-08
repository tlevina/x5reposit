package Task1;

public class Triangle implements Shape {
    double hight;
    double base;

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Triangle(double hight, double base) {
        this.hight = hight;
        this.base = base;
    }


    @Override
    public double square() {
        return hight * base/2;
    }
}
