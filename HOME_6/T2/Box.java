package T2;

import T1.MyArrayList;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();

    public Box() {
        float weight = 0.0f;
    }
    public void addFruit(T fruit, int summa) {
        for(int i=0;i<summa;i++) {
            box.add(fruit);
         //   weight = weight + fruit.getWeight();
        }
    }
    public float getWeight() {
        float weight = 0.0f;
        for(T v : box){
            weight += v.getWeight();
        }return weight;
    }
    public boolean compare(Box anotherBox){
        if (getWeight() == anotherBox.getWeight()){
            return true;
        } return false;
    }
    public void fillTo(Box anotherBox){

        anotherBox.box.addAll(box);

        box.clear();
    }
}
