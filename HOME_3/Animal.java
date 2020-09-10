package ru;

public class Animal {

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    String name;
    String food;
    String location;

    public void makeNoise() {
        System.out.println(this.name + " животное шумит ");
    }

    public void eat() {
        System.out.println(this.name + " животное ест ");
    }

    public void sleep() {
        System.out.println(this.name + " животное спит ");
    }
}
