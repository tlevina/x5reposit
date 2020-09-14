package ru;

public class Triangle implements Shape {
    public Triangle(int hight, int base) {
        this.hight = hight;
        this.base = base;
    }

    int hight;
    int base;

    @Override
    public int square() {
        return hight * base;
    }
}
