package task2;

public class Cat extends Animal {
    String breed;

    public Cat(String name, String food, String location, String breed) {
        super(name, food, location);
        this.breed = breed;
    }


    @Override
    public void makeNoise() {
        System.out.println(name + " мурлычет");
    }

    @Override
    public void eat() {
        System.out.println(name + " ловит" + food);
    }

    @Override
    public void sleep() {
        System.out.println(name + " нежится " + location);
    }
}
