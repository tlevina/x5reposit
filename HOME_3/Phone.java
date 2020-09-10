package ru;

public class Phone {
    public Phone(int model, int number, int weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    public Phone(int inputModel, int inputNumber) {
        model = inputModel;
        number = inputNumber;
    }

    int number;
    int model;
    int weight;

    public static void  receiveCall (String name){
        System.out.println("Звонит "+name);
    }

    public static void  receiveCall (String name, int number){
        System.out.println("Звонит "+name+"\nТелефон "+number);
    }

    public static int getNumber(Phone phone){
        return phone.number;
    }

    public static void sendMessage (int... number){
        for (int i : number){
            System.out.print(i+", ");
        }
    }


}
