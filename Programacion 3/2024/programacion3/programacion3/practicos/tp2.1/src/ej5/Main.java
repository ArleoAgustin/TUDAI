package ej5;

public class Main {


    public static void main(String[] args) {


        Tree tree = new Tree();

        TreeNode n1 = new TreeNode('M');
        TreeNode n2 = new TreeNode('A');
        TreeNode n3 = new TreeNode('L');
        TreeNode n4 = new TreeNode('N');
        TreeNode n5 = new TreeNode('A');
        TreeNode n6 = new TreeNode('O');
        TreeNode n7 = new TreeNode('I');
        TreeNode n8 = new TreeNode('S');
        TreeNode n9 = new TreeNode('A');
        TreeNode n10 = new TreeNode('O');

        n1.setLeft(n2);
        n1.setRight(n7);
        n2.setLeft(n3);
        n2.setRight(n4);
        n4.setLeft(n5);
        n4.setRight(n6);
        n7.setLeft(n8);
        n7.setRight(n10);
        n8.setRight(n9);


        tree.addNode(n1);

        tree.imprimirPreOrden();

        System.out.println(" ");
        System.out.println("Resultado: ");
        System.out.println(tree.ejercicio5());
    }
}
