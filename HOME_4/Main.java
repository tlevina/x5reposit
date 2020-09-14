package ru;

public class Main {
    public static void main(String[] args) {

        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(20, 30);
        shape[1] = new Circle(10);
        shape[2] = new Rectangle(5, 35);
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }
        Car car1 = new Lorry("Грузовой бортовой", 2000, "Toyota Hilux", 1000);

        car1.printInfo();
        car1.start();
        car1.stop();
        Car car2 = new SportCar("Спортивный", 300, "Audi R8", 210);
        car2.printInfo();
        car2.start();
        car2.stop();
    }
}
