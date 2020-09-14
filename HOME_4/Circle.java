package ru;

public class Circle implements Shape {
    public Circle(int r) {
        this.r = r;
    }

    private int r;


    @Override
    public int square() {
        return r * r;
    }
}
