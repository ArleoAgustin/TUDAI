package ej5;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    private TreeNode root;

    public Tree() {
        this.root = null;
    }

    public void add(char value) {
        if (this.root == null)
            this.root = new TreeNode(value);
        else
            this.add(this.root, value);
    }

    private void add(TreeNode actual, char value) {
        if (actual.getValue() > value) {
            if (actual.getLeft() == null) {
                TreeNode temp = new TreeNode(value);
                actual.setLeft(temp);
            } else {
                add(actual.getLeft(), value);
            }
        } else if (actual.getValue() < value) {
            if (actual.getRight() == null) {
                TreeNode temp = new TreeNode(value);
                actual.setRight(temp);
            } else {
                add(actual.getRight(), value);
            }
        }
    }

    public void addNode(TreeNode node){
        this.root = node;
    }

    public char getRoot() {
        return root.getValue();
    }

    public boolean hasElem(char value) {
        return getValue(this.root, value);
    }

    private boolean getValue(TreeNode node, char value) {

        if (node == null)
            return false;

        if (node.getValue() == value)
            return true;

        else if (node.getValue() > value)
            return getValue(node.getLeft(), value);

        else
            return getValue(node.getRight(), value);



    }


    public boolean isEmpty(){
        return this.root == null;
    }

    public List<Character> ejercicio5(){

        return ejercicio5_recursivo(new ArrayList<Character>(), new ArrayList<Character>(), 2, 0, this.root);
    }

    private ArrayList<Character> ejercicio5_recursivo(ArrayList<Character> ramaActual, ArrayList<Character> ramas, int n, int cantVocales, TreeNode node) {

        if (isVocal(node.getValue())){
            if (cantVocales > n)
                return ramas;
            else
                cantVocales++;
        }

        ramaActual.add(node.getValue());




        if (node.getLeft() != null)
            ramas = ejercicio5_recursivo(ramaActual, ramas, n, cantVocales, node.getLeft());

        if (node.getRight() != null)
            ramas = ejercicio5_recursivo(ramaActual, ramas, n, cantVocales, node.getRight());


        if (isHoja(node)) {
            if (cantVocales != n){
                ramaActual.remove(ramaActual.size()-1);
                return ramas;
            }
            else
                ramas.addAll(ramaActual);
        }

        ramaActual.remove(ramaActual.size()-1);
        return ramas;
    }

    private boolean isHoja(TreeNode node){

        return node.getRight() == null && node.getLeft() == null;
    }

    private boolean isVocal(char value){
        switch (value) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }

    /*---------------------------------impresion----------------------------------------------------------------*/

    public void imprimirPreOrden(){this.imprimirPreOrdenRecursivo(this.root);}

    private void imprimirPreOrdenRecursivo(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.getValue() + " ");
        imprimirPreOrdenRecursivo(node.getLeft());
        imprimirPreOrdenRecursivo(node.getRight());
    }


    public void imprimirPosOrden(){
        this.imprimirPosOrdenRecursive(this.root);
    }

    private void imprimirPosOrdenRecursive(TreeNode node) {

        if (node == null)
            return;
        imprimirPosOrdenRecursive(node.getLeft());
        imprimirPosOrdenRecursive(node.getRight());
        System.out.print(node.getValue() + " ");
    }


    public void imprimirEnOrden(){
        imprimirEnOrdenRecursive(this.root);
    }

    private void imprimirEnOrdenRecursive(TreeNode node) {
        if (node == null)
            return;
        imprimirEnOrdenRecursive(node.getLeft());
        System.out.print(node.getValue() + " ");
        imprimirEnOrdenRecursive(node.getRight());
    }

}