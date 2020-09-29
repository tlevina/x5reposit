package TASK2;

public class CreateVC extends FactoryComponents{
    @Override
    public Components createComponent() {

        return new VC();
    }
}
