package Task2;

public class SportCar extends Car {
    int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public SportCar(String class_car, int weight, String brand, Engine engine, int speed) {
        super(class_car, weight, brand, engine);
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
                " Вес " + super.getWeight() + " Марка " + super.getBrand() + "  " +
                super.engine);
    }


}
