package ej1;

public class Main {

    public static void main(String[] args) {


        MySimpleLinkedList list = new MySimpleLinkedList<>();


        list.insertFront(77);
        list.insertFront(99);
        list.insertFront(525);

        System.out.println("");
        System.out.println("size: " + list.size());

        System.out.println("");
        System.out.println("valor obtenido:"+  list.get(2));

        System.out.println("");
        System.out.println("posicion del valor:" + list.indexOf(77));

        System.out.println("");
        list.printList();

        System.out.println("");
        System.out.println("");

        MySimpleLinkedList list1 = new MySimpleLinkedList(new ComparadorInteger<>());
        MySimpleLinkedList list2 = new MySimpleLinkedList(new ComparadorInteger<>());

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


        System.out.println("");
        System.out.println("lista comun:");

        System.out.println( list1.listaComun(list2));

        System.out.println("");
        System.out.println("lista NO comun:");

        System.out.println(list1.elementosNoComunes(list2));

    }
}
