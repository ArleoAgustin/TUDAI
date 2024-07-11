package ej4;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    private TreeNode root;

    public Tree() {
        this.root = null;
    }

    public void add(Integer value) {
        if (this.root == null)
            this.root = new TreeNode(value);
        else
            this.add(this.root, value);
    }

    private void add(TreeNode actual, Integer value) {
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

    public Integer getRoot() {
        return root.getValue();
    }

    public boolean hasElem(Integer value) {
        return getValue(this.root, value);
    }

    private boolean getValue(TreeNode node, int value) {

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

    public int getHeight(){

        return getHeigthRecursive(0,0,root);

    }

    private int getHeigthRecursive(int level, int maxLevel, TreeNode node){

        if (node == null){
            return level;
        }

        if (node.getLeft() != null){
            maxLevel = getHeigthRecursive(level+1, maxLevel, node.getLeft());
        }
        if (node.getRight() != null){
            maxLevel = getHeigthRecursive(level+1, maxLevel, node.getRight());
        }

        if (level > maxLevel){
            maxLevel = level;
        }

        return maxLevel;
    }


    public List<TreeNode> getLongestBranch(){

        return  this.getLongestBranchRecursive(new ArrayList<TreeNode>(), new ArrayList<TreeNode>(), this.root);

    }

    private List getLongestBranchRecursive(List<TreeNode> actualBranch, List<TreeNode> longestBranch, TreeNode node) {

        actualBranch.add(node);


        if (node.getLeft() != null) {
            longestBranch = getLongestBranchRecursive(actualBranch, longestBranch, node.getLeft());
            actualBranch.remove(actualBranch.size()-1);
        }

        if (node.getRight() != null){
            longestBranch = getLongestBranchRecursive(actualBranch, longestBranch, node.getRight());
            actualBranch.remove(actualBranch.size()-1);
        }

        if (actualBranch.size() > longestBranch.size() && (node.getRight() == null && node.getLeft() == null))
            longestBranch = new ArrayList<>(actualBranch);

        return longestBranch;
    }


    public List<TreeNode> getFrontera(){

        return getFronteraRecursive(new ArrayList<TreeNode>(), this.root);
    }

    private List<TreeNode> getFronteraRecursive(List<TreeNode> hojas, TreeNode node) {

        if (node.getLeft() != null) {

            hojas = getFronteraRecursive(hojas, node.getLeft());
        }

        if (node.getRight() != null){
            hojas = getFronteraRecursive(hojas, node.getRight());
        }

        if (node.getLeft() == null && node.getRight() == null){

            hojas.add(node);
        }

        return hojas;

    }


    public int getMaxElem(){
        return getMaxElemRecursive(this.root, 0);
    }

    private  int getMaxElemRecursive(TreeNode node, int maxElement) {

        if (node != null && (node.getValue() > maxElement))
            maxElement = node.getValue();

        if (node.getLeft() != null) {
            maxElement = getMaxElemRecursive(node.getLeft(), maxElement);
        }

        if (node.getRight() != null){
            maxElement = getMaxElemRecursive(node.getRight(), maxElement);
        }

        return maxElement;
        }


    public List<TreeNode> getElemAtLevel(int level){

        return getElemAtLevelRecursive(this.root, level, 0, new ArrayList<TreeNode>());
     }

    private List getElemAtLevelRecursive(TreeNode node, int level, int levelActual, List<TreeNode> elementsByLevel) {

        if (node != null && levelActual == level){
            elementsByLevel.add(node);
        }

        if (node.getLeft() != null) {
         elementsByLevel = getElemAtLevelRecursive(node.getLeft(), level, levelActual+1, elementsByLevel);
        }

        if (node.getRight() != null){
            elementsByLevel = getElemAtLevelRecursive(node.getRight(), level, levelActual+1, elementsByLevel);
        }

        return elementsByLevel;

    }


    public int suma(){

        return this.sumaRecursive(this.root, 0);
    }

    private int sumaRecursive(TreeNode node, int i) {

        if (node == null)
            return 0;
        else
            i += node.getValue();

        if (node.getLeft() != null){
            i = sumaRecursive(node.getLeft(), i);
        }

        if (node.getRight() != null){
            i = sumaRecursive(node.getRight(), i);
        }

        return i;
    }

    public List<TreeNode> ejercicio3(int k) {

        return this.ejercicio3Recursive(this.root, new ArrayList(), k);
    }

    private List ejercicio3Recursive(TreeNode node, List hojas, int k) {

        if (node == null){
            return hojas;
        }

        if ((node.getLeft() != null) && (node.getLeft().getValue()  >= k)){
            hojas = ejercicio3Recursive(node.getLeft(), hojas,k);
        }

        if ((node.getRight() != null) && (node.getRight().getValue()  >= k)){
            hojas = ejercicio3Recursive(node.getRight(), hojas, k);
        }

        if ((node.getLeft() == null && node.getRight() == null) && node.getValue() > k)
            hojas.add(node);


        return hojas;
    }


    public void ejericio4(){

        this.ejericio4Recursive(this.root, 0, 0);

    }

    private int ejericio4Recursive(TreeNode node, int left, int rigth) {

        if (node == null){
            return node.getValue();
        }

        if (node.getLeft() == null && node.getRight() == null){
            return node.getValue();
        }

        if (node.getLeft() != null)
            left = ejericio4Recursive(node.getLeft(), left, rigth);
        else
            left = 0;

        if (node.getRight() != null)
            rigth = ejericio4Recursive(node.getRight(), left, rigth);

        else
            rigth = 0;


        if (node.getValue() == -99 ) {
            node.setValue(rigth - left);
        }

        return node.getValue();
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