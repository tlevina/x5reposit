package ru;

public class Dog extends Animal {
    public Dog(String name, String vaccinations) {
        super(name);
        this.vaccinations = vaccinations;
    }

    String vaccinations;

    @Override
    public void makeNoise() {
        System.out.println("Собака громко лает ");
    }

    @Override
    public void eat() {
        System.out.println("Собака грызёт кость ");
    }
}
