public class NotEnouthMoneyException extends RuntimeException{
    private double value;
    public NotEnouthMoneyException(double _value) {
        value = _value;
    }

    public String toString() {
        String msg = "Exception: " + value + " недостаточно денег на счёте!!!";
        return msg;
    }
}
