package Task1;

public class Rectangle implements  Shape{
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }



    @Override
    public double square() {
        return length * width;
    }
}
