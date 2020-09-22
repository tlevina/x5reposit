package T1;

public class MyLinkedList<T> {
    // private Object[] data = new Object[0];
    Node head; // заголовок списка
    Node tail;

    // Узел связанного списка.
    static class Node<T> {

        T data;
        Node next;

        Node(T item) {
            data = item;
            next = null;
        }
    }

    public void add(T item) {
        Node new_node = new Node(item);
        new_node.data = item;
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {

            tail.next = new_node;
            tail = new_node;
        }
    }

    public void add(int index, T item) {
        Node new_node = new Node(item);
        new_node.data = item;
        if (head == null & index == 1) {
            head = new_node;
            tail = new_node;
        } else if (head != null & index == 1) {
            new_node.next = head;
            head = new_node;

        } else {
            Node t = head;
            Node v = head;
            int i = 1;
            while (t != null) {
                if (i == index - 1) {
                    v = t.next;
                    t.next = new_node;
                    new_node.next = v;
                    break;
                }

                i++;
                t = t.next;

            }

        }

    }
    public void remove(int index) {
     //   Node new_node = new Node(item);
      //  new_node.data = item;
        if (head == null & index == 1) {
            System.out.println("Список не создан");
        }  else if (head != null & index == 1){
            head = head.next;
        } else {
            Node t = head;
            Node v = head;
            int i = 1;
            while (t != null) {
                if (i == index - 1) {
                    v = t.next;
                    v = v.next;
                    t.next = v;
                    break;
                }

                i++;
                t = t.next;

            }

        }

    }

    public T get(int index){
        Node t = head;
        int i = 0;
        while (t != null) {
            i++;
            if (i==index){  break; }
            t = t.next;
        }
        return (T) t;



    }

    public void clear(){
        head = null;
    }
    public int size(){
        Node t = head;
        int i = 0;
        while (t != null) {
            i++;
            t = t.next;
        }
        return i;
    }

    void print() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }


}
