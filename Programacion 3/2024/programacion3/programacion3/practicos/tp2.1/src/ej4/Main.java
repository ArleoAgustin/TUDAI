package ej4;

public class Main {


    public static void main(String[] args) {


        Tree tree = new Tree();



        TreeNode n14 = new TreeNode(14);

        TreeNode n7 = new TreeNode(7);

        TreeNode n_5 = new TreeNode(-5);

        TreeNode n9 = new TreeNode(9);

        TreeNode n20 = new TreeNode(20);


        TreeNode vacio1 = new TreeNode(-99);
        TreeNode vacio2 = new TreeNode(-99);
        TreeNode vacio3 = new TreeNode(-99);
        TreeNode vacio4 = new TreeNode(-99);
        TreeNode vacio5 = new TreeNode(-99);

        vacio1.setLeft(vacio2);
        vacio1.setRight(vacio3);
        vacio2.setLeft(n14);
        vacio2.setRight(vacio4);
        vacio4.setLeft(n7);
        vacio4.setRight(n_5);

        vacio3.setLeft(vacio5);
        vacio3.setRight(n20);
        vacio5.setRight(n9);


        tree.addNode(vacio1);

        tree.imprimirPreOrden();
        System.out.println("");

        tree.ejericio4();

        tree.imprimirPreOrden();



    }
}
