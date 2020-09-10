package ru;

public class Horse extends Animal {
    public Horse(String name, String kind) {
        super(name);
        this.kind = kind;
    }

    String kind;

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржёт ");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест сено ");
    }
}
