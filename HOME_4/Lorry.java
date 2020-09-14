package ru;

public class Lorry extends Car {
    int load;

    public Lorry(String class_car, int weight, String brand, int load) {
        super(class_car, weight, brand);
        super.enjine_car = new Enjine_car(120, "Toyota");
        this.load = load;
    }


    @Override
    public void start() {
        if (load <= 1000) {
            System.out.println("Грузовик поехал");
        }

    }

    @Override
    public void stop() {
        if (load > 1000) {
            System.out.println("Грузовик остановился");
        }
    }


    @Override
    public void printInfo() {

        System.out.println("Характеристики грузовика: Грузоподъёмность " + load +
                " Класс " + super.getClass_car() +
                " Вес " + super.getWeight() + " Марка " + super.getBrand() +
                " Двигатель : Производитель " + super.enjine_car.getPerformance() +
                " Мощность" + super.enjine_car.getPower());
    }
}
