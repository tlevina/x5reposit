package DZ7;

public class UnKnownAccountException extends RuntimeException {
    private int value;


    public UnKnownAccountException(int _value) {
        value = _value;
    }


    public String toString() {
        String msg = "Exception: " + value + " нет такого счёта!!!";
        return msg;
    }
}
