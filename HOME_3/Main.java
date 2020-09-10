package ru;

public class Main {

    public static void main(String[] args) {
        double salary;
        System.out.println("\n Класс Phone");
        // 1. Класс Phone
        Phone phone1 = new Phone(11, 12, 13);
        Phone phone2 = new Phone(21, 22, 23);
        Phone phone3 = new Phone(31, 32);

        System.out.println("model: " + phone1.model + "\nnumber: " + phone1.number + "\nweight: " + phone1.weight);
        System.out.println("model: " + phone2.model + "\nnumber: " + phone2.number + "\nweight: " + phone2.weight);
        System.out.println("model: " + phone3.model + "\nnumber: " + phone3.number + "\nweight: " + phone3.weight);

        System.out.println("Телефон " + Phone.getNumber(phone1));
        System.out.println("Телефон " + Phone.getNumber(phone2));
        System.out.println("Телефон " + Phone.getNumber(phone3));

        Phone.receiveCall("Николай");
        Phone.receiveCall("Маринка");
        Phone.receiveCall("Ксюшка");
        Phone.receiveCall("Люська", 555);

        Phone.sendMessage(111, 222);
        Phone.sendMessage(111, 222, 333);

        System.out.println("\n Класс Animal");

        // 2.Класс Animal

        Animal animal1 = new Cat("Мурзик", "Британец");
        Animal animal2 = new Dog("Бакс", "Бешенство");
        Animal animal3 = new Horse("Лучик", "Тяжеловоз");

        animal1.setLocation("Москва");
        animal2.setLocation("Михнево");
        animal3.setLocation("Клоково");
        animal1.setFood("мышки");
        animal2.setFood("кости");
        animal3.setFood("солома");

        Veterinarian v = new Veterinarian();
        Animal[] animals = {animal1, animal2, animal3};

        for (Animal an : animals) {
            v.treatAnimal(an);
        }

        System.out.println("\n Класс Aspirant и класс Student");

        // 3. Класс Aspirant и класс Student

        Student student = new Aspirant();

        Student student1 = new Student();
        Student student2 = new Student();
        Student aspirant1 = new Aspirant();
        Student aspirant2 = new Aspirant();

        student1.setLastName("Петров");
        student2.setLastName("Иванов");
        aspirant1.setLastName("Сидоров");
        aspirant2.setLastName("Романов");

        student1.setAverageMark(5.0);
        student2.setAverageMark(4.2);
        aspirant1.setAverageMark(5.0);
        aspirant2.setAverageMark(4.5);

        Student[] students = {student1, student2, aspirant1, aspirant2};

        for (Student st : students) {
            salary = st.getScholarship();
            System.out.println(st.lastName + " Стипендия = " + salary);
        }

    }


}