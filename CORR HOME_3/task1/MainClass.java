package task1;


import task2.Animal;

public class MainClass {
    public static void main(String[] args) {

        Phone phone1 = new Phone(11, 12, 13);
        Phone phone2 = new Phone(21, 22, 23);
        Phone phone3 = new Phone(31, 32);
        Phone[] phones = {phone1, phone2, phone3};

        for (Phone an : phones) {
            System.out.println("model: " + an.model + "\nnumber: " + an.number + "\nweight: " + an.weight);

        }
        for (Phone an : phones) {
            System.out.println("Телефон " + an.getNumber());
        }

        Phone.receiveCall("Николай");
        Phone.receiveCall("Маринка");
        Phone.receiveCall("Ксюшка");
        Phone.receiveCall("Люська", 555);

        Phone.sendMessage(111, 222);
        Phone.sendMessage(111, 222, 333);
    }
}
