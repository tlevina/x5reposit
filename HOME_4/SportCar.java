package ru;

public class SportCar extends Car {
    int speed;

    public SportCar(String class_car, int weight, String brand, int speed) {
        super(class_car, weight, brand);
        super.enjine_car = new Enjine_car(250, "General Electric");
        this.speed = speed;
    }

    @Override
    public void start() {
        if (speed <= 200) {
            System.out.println("SportCar поехал");
        }
    }

    @Override
    public void stop() {
        if (speed > 200) {
            System.out.println("SportCar остановился");
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Характеристики SportCar: Предельная скорость " + speed +
                " Класс " + super.getClass_car() +
                " Вес " + super.getWeight() + " Марка " + super.getBrand() +
                " Двигатель : Производитель " + super.enjine_car.getPerformance() +
                " Мощность" + super.enjine_car.getPower());
    }
}
