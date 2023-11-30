package tp1.ej6;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>(new ComparadorInteger<>());

        l1.insertFront(1);
        l1.insertFront(25);
        l1.insertFront(3);
        l1.insertFront(7);


        LinkedList<Integer> l2 = new LinkedList<>(new ComparadorInteger<>());

        l2.insertFront(6);
        l2.insertFront(3);
        l2.insertFront(1);
        l2.insertFront(66);

        System.out.println(l1.listaComun(l2));


    }
}
