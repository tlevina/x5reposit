package task1;

public class Phone {
    int number;
    int model;
    int weight;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Phone(int number, int model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, int model, int weight) {
        this(number, model);
        this.weight = weight;
    }


    public static void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public static void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + "\nТелефон " + number);
    }


    public static void sendMessage(int... number) {
        for (int i : number) {
            System.out.print(i + ", ");
        }
    }


}
