package ru;

public class Rectangle implements Shape {
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int length;
    int width;

    @Override
    public int square() {
        return length * width;
    }
}
