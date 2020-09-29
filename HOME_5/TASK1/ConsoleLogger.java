package TASK1;

public class ConsoleLogger extends Logger{
    @Override
    public InputLog log(String message) {
        return new Console();
    }
}
