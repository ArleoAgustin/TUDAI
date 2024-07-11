package ej1;

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
//        System.out.println(tree.hasElem(15));

//        System.out.println(tree.isEmpty());

//        System.out.println(tree.getHeight());

/*
        tree.getLongestBranch().forEach(index ->{

            System.out.print(index.getValue()+ " ");
        });

        System.out.println("");

        tree.getFrontera().forEach(index ->{

            System.out.print(index.getValue() +" " );
        });

        System.out.println("");

        System.out.println("mayor elemento del arbol: "+ tree.getMaxElem());

        System.out.println("");
        System.out.println("elementos por nivel:");
        tree.getElemAtLevel(2).forEach( index ->{

            System.out.print(index.getValue() + " ");

        });
*/

        tree.delete(18);

        System.out.println("");
        tree.imprimirPreOrden();
    }
}
