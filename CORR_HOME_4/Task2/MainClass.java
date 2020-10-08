package Task2;

public class MainClass {
    public static void main(String[] args){
        Engine engine1 = new Engine(200,"Toyota");
        Car car1 = new Lorry("Грузовой бортовой", 2000, "Toyota Hilux", engine1,1000);
        car1.printInfo();
        car1.start();
        car1.stop();

        Engine engine2 = new Engine(200,"General Electric");
        Car car2 = new SportCar("Легковой", 300, "Audi R8", engine2,210);
        car2.printInfo();
        car2.start();
        car2.stop();
    }
}
