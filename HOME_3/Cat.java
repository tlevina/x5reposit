package ru;

public class Cat extends Animal {
    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    String breed;

    @Override
    public void makeNoise() {
        System.out.println("Кот мурлычет");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест мышей");
    }
}