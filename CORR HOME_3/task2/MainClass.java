package task2;


public class MainClass {
    public static void main(String[] args) {
        Animal animal1 = new Cat("Мурзик", "Мышки", " коробка ", "Британец");
        Animal animal2 = new Dog("Бакс", "кость", "будка", "Бешенство");
        Animal animal3 = new Horse("Лучик", "Сено", "конюшня", "Тяжеловоз");

        animal1.makeNoise();
        animal2.eat();

        Veterinar v = new Veterinar();
        Animal[] animals = {animal1, animal2, animal3};

        for (Animal an : animals) {
            v.treatAnimal(an);
        }

    }
}
