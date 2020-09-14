package ru;

public abstract class Car {
    private String class_car;
    private int weight;
    private String brand;
    Enjine_car enjine_car;

    public Enjine_car getEnjine_car() {
        return enjine_car;
    }

    public String getClass_car() {
        return class_car;
    }

    public int getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }

    public Car(String class_car, int weight, String brand) {
        this.class_car = class_car;
        this.weight = weight;
        this.brand = brand;
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
