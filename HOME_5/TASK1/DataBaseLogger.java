package TASK1;

public class DataBaseLogger extends Logger {
    @Override
    public InputLog log(String message) {
        return new DataBase();
    }
}
