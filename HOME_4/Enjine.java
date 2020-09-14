package ru;

public abstract class Enjine {
    private int power;
    private String performance;

    public Enjine(int power, String performance) {
        this.power = power;
        this.performance = performance;
    }

    public int getPower() {
        return power;
    }

    public String getPerformance() {
        return performance;
    }
}
