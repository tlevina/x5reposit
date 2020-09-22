package T1;
import java.util.Arrays;

public class MyArrayList <T>{
    private Object[] data = new Object[0];

    public void add(int index, T item){
        Object[] result = (T[]) new Object[data.length+1];
        if (index > data.length) {
            System.out.println(" индекс больше размера массива");
        } else {
            for (int i = 0; i < index; i++) {
                result[i] = data[i];
            }
            for (int i = index + 1; i < result.length; ) {
                result[i] = data[i + 1];
            }
            result[index] = item;
            this.data = result;
        }
    }
   public void add(T item){
       Object[] result = (T[]) new Object[data.length+1];
       for (int i = 0; i < result.length-1; i++) {
           result[i] = data[i];
       }
       result[result.length-1] = item;
       this.data = result;
   }
    public void remove(int index){
         Object[] result = (T[]) new Object[data.length-1];
         if (index > data.length) {
           System.out.println(" индекс больше размера массива");
        } else {
             for (int i = 0; i < index; i++) {
                 result[i] = data[i];
             }
             for (int i = index; i < result.length; ) {
                 result[i] = data[i + 1];
             }
             this.data = result;
         }
    }

    public T get(int index){
         return (T) data[index];
    }

    public void clear(){
        data = new Object[0];
    }
    public int size(){
         return data.length;
    }

    public void print(){
        System.out.println(Arrays.toString(data));
    }

}
