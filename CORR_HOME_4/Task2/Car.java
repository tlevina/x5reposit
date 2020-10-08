package Task2;

public abstract class Car {
    // класс автомобиля
    protected String class_car;
    // вес автомобиля
    protected int weight;
    // марка автомобиля
    protected String brand;
    // двигатель автомобиля
    protected Engine engine;

    public Car(String class_car, int weight, String brand, Engine engine) {
        this.class_car = class_car;
        this.weight = weight;
        this.brand = brand;
        this.engine = engine;
    }

    public String getClass_car() {
        return class_car;
    }

    public void setClass_car(String class_car) {
        this.class_car = class_car;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }


}
