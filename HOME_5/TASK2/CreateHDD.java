package TASK2;

public class CreateHDD extends FactoryComponents{
    @Override
    public Components createComponent() {

        return new HDD();
    }
}
