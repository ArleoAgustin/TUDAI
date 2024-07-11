package ej3;

public class Main {


    public static void main(String[] args) {


        Tree tree = new Tree();

        tree.add(12);
        tree.add(5);
        tree.add(2);
        tree.add(9);
        tree.add(18);
        tree.add(15);
        tree.add(17);
        tree.add(19);
        tree.add(17);

        tree.imprimirPreOrden();
        System.out.println("");


        tree.ejercicio3(1).forEach( i ->{

            System.out.print(i.getValue() + " ");
        });

    }
}
