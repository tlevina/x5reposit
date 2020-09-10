package ru;

public class Veterinarian {
    public Veterinarian() {
    }

    public void treatAnimal(Animal animal) {
        System.out.println("Пища - " + animal.food + " место пребывания - " +
                animal.location);
    }
}
