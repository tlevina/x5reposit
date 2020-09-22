package T1;

public class MainClass {
    public static void  main(String[] args){
     MyArrayList<String> myArray = new MyArrayList<>();
     myArray.add(0,"1");
        myArray.add(1,"2");
        myArray.add(2,"3");
        myArray.add(3,"4");

        myArray.print();
       myArray.add(5,"6");
        myArray.print();
       myArray.remove(3);
        myArray.print();
        System.out.println("Размер массива = " + myArray.size());

        myArray.add("4");
     //   myArray.clear();
       myArray.print();

        MyLinkedList<String> myArrayL = new MyLinkedList<>();
        myArrayL.add("1");
        myArrayL.add("2");
        myArrayL.add("3");
        myArrayL.add("4");
        myArrayL.add("5");
        myArrayL.add("6");
        myArrayL.print();

        myArrayL.add(6,"11");
        myArrayL.print();
        myArrayL.remove(6);
        myArrayL.print();
        System.out.println("Размер массива = " + myArrayL.size());




    }
}
