package Task2;

public class Engine {
    private int power;
    private String performance;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getPerformance() {
        return performance;
    }


    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public Engine(int power, String performance) {
        this.power = power;
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "Двигатель {" +
                "мощность =" + power +
                ", performance ='" + performance + '\'' +
                '}';
    }

}
