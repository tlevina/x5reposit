package TASK2;

public class Strategy {
    private Components components;

    public void setComponents(Components components) {
        this.components = components;
    }

    public void createComponent() {
        components.output();
    }
}
