package TASK2;

public class CreateCPU extends FactoryComponents {
    @Override
    public Components createComponent() {

        return new CPU();
    }
}
