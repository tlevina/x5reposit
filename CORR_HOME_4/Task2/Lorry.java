package Task2;

public class Lorry extends Car {
    int load;

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }


    public Lorry(String class_car, int weight, String brand, Engine engine, int load) {
        super(class_car, weight, brand, engine);
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
                " Вес " + super.getWeight() + " Марка " + super.getBrand() + "   " +
                super.engine);
    }
}
