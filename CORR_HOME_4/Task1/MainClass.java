package Task1;

public class MainClass {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(20.1, 30.2);
        shape[1] = new Circle(10.3);
        shape[2] = new Rectangle(5.5, 35.33);
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }
    }
}
