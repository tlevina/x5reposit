package task2;

public class Animal {
    String name;
    String food;
    String location;

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public void makeNoise() {

        System.out.println(this.name + " животное шумит ");
    }

    public void eat() {
        System.out.println(this.name + " животное ест ");
    }

    public void sleep() {

        System.out.println(this.name + " животное спит ");
    }

}
