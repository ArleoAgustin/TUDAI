package ej7;

public class Main {

    public static void main(String[] args) {


        DoubleLinkedList list1 = new DoubleLinkedList(new ComparadorInteger<>());
        DoubleLinkedList list2 = new DoubleLinkedList(new ComparadorInteger<>());

        list1.insertFront(63);
        list1.insertFront(842);
        list1.insertFront(11);
        list1.insertFront(7);
        list1.insertFront(50);


        list2.insertFront(11);
        list2.insertFront(63);
        list2.insertFront(50);
        list2.insertFront(99);
        list2.insertFront(77);

        list1.printList();

        System.out.println("");
        System.out.println(list1.toString());

    }
}
