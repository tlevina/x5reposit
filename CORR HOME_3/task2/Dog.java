package task2;


public class Dog extends Animal {
    String vaccinations;

    public String getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(String vaccinations) {
        this.vaccinations = vaccinations;
    }

    public Dog(String name, String food, String location, String vaccinations) {
        super(name, food, location);
        this.vaccinations = vaccinations;
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " громко лает ");
    }

    @Override
    public void eat() {
        System.out.println(name + " грызёт " + food);
    }
}
