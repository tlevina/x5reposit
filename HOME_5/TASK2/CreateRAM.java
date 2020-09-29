package TASK2;

public class CreateRAM extends FactoryComponents {
    @Override
    public Components createComponent() {

        return new RAM();
    }
}
