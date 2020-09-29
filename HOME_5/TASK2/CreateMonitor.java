package TASK2;

public class CreateMonitor extends FactoryComponents{
    @Override
    public Components createComponent() {
        return new Monitor();
    }
}
