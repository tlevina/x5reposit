package T2;

public class MainClass {
    public static void main(String[] args) {
        Box<Orange> o1 = new Box<>();
        Box<Orange> o2 = new Box<>();
        Box<Orange> o3 = new Box<>();
        Box<Apple> a1 = new Box<>();
        Box<Apple> a2 = new Box<>();
        Box<Apple> a3 = new Box<>();

        o1.addFruit(new Orange(), 15);
        o2.addFruit(new Orange(), 15);
        o3.addFruit(new Orange(), 10);

        a1.addFruit(new Apple(), 7);
        a2.addFruit(new Apple(), 9);
        a3.addFruit(new Apple(), 25);
        System.out.println("Box orange 1 :  " + o1.getWeight());
        System.out.println("Box orange 2 :  " + o2.getWeight());
        System.out.println("Box orange 3 :  " + o3.getWeight());
        System.out.println("Box apple 1 :  " + a1.getWeight());
        System.out.println("Box apple  2 :  " + a2.getWeight());
        System.out.println("Box apple  3 :  " + a3.getWeight());
        System.out.println("Box o1 = Box  a1 :  " + o1.compare(a1));
        System.out.println("Box o2 = Box  a3 :  " + o1.compare(o2));
        System.out.println("Box a1 fillTo  Box  o1 :  ");
        a1.fillTo(a2);
        System.out.println("Box apple 1 :  " + a1.getWeight());
        System.out.println("Box apple 2 :  " + a2.getWeight());
    }
}
