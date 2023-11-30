package parcial2023.ej1_b;

import java.util.ArrayList;

public class TreeNode {

    private Node root;

    //constructor
    public TreeNode() {
        this.root = null;
    }

/////////////////////////////////////////PUNTO 1////////////////////////////////////////////////////////////////////////

    //obtiene la raiz
    public int getRoot() {

        return root.getInfo();
    }

    public void setRoot(Node n){

        this.root = n;
    }


    //verifica si existe el elemento
    public boolean hasElement(int info) {

        return hasElementRecursive(this.root, info);

    }

    //verifica si existe el elemento recursivo
    private boolean hasElementRecursive(Node root, int info) {

        if (root == null) {
            return false;
        }

        if (root.getInfo() == info) {
            return true;

        } else if (hasElementRecursive(root.getIzq(), info)) {
            return true;

        } else
            return hasElementRecursive(root.getDer(), info);

    }

    //retorna si esta vacio
    public boolean isEmpty() {

        return this.root == null;
    }

    //inserta un elemento
    public void insert(int value) {

        if (this.root == null)
            this.root = new Node(value);
        else
            this.insertRecursive(this.root, value);
    }

    //inserta un elemento recursivo
    private void insertRecursive(Node node, int value) {

        if (node.getInfo() > value) {
            if (node.getIzq() == null) {
                Node temp = new Node(value);
                node.setIzq(temp);
            } else {
                insertRecursive(node.getIzq(), value);
            }
        } else if (node.getInfo() < value) {
            if (node.getDer() == null) {
                Node temp = new Node(value);
                node.setDer(temp);
            } else {
                insertRecursive(node.getDer(), value);
            }
        }
    }

    //obtiene el alto del arbol
    public int getHeight() {
        int h = 0;
        return getHeight(this.root, h);
    }

    //obtiene la altura del arbol recursivo
    private int getHeight(Node node, int h) {

        if (node != null) {
            int v1 = 0;
            int v2 = 0;
            if (node.equals(this.root)) {
                h = 0;
            }
            if (node.getIzq() != null) {
                v1 = getHeight(node.getIzq(), h);
                v1++;
            }
            if (node.getDer() != null) {
                v2 = getHeight(node.getDer(), h);
                v2++;
            }
            h = Math.max(v1, v2);
        }
        return h;
    }

    //imprime el arbol
    public void print() {
        imprimirEnOrden(this.root);
    }

    //imprimer el arbol en orden
    private void imprimirEnOrden(Node node) {
        if (node == null)
            return;
        System.out.print(node.getInfo() + " ");
        if (node.getIzq() != null)
            imprimirEnOrden(node.getIzq());
        else System.out.print(" - ");


        if (node.getDer() != null)
            imprimirEnOrden(node.getDer());
        else System.out.print(" - ");
    }

    //imprime el arbol posOrden
    private void imprimirPosOrden(Node nodo) {
        if (nodo == null)
            return;
        imprimirPosOrden(nodo.getIzq());
        imprimirPosOrden(nodo.getDer());
        System.out.print(nodo.getInfo() + " ");
    }

    //imprime el arbol en preorden
    private void imprimirPreOrden(Node nodo) {
        if (nodo == null)
            return;
        System.out.print(nodo.getInfo() + " ");
        imprimirPreOrden(nodo.getIzq());
        imprimirPreOrden(nodo.getDer());
    }

    //devuelve la rama mas larga del arbol
    public ArrayList<Integer> getLongestBranch() {
        return getLongestBranch(this.root);

    }

    //devuelve la rama mas larga del arbol recursivo
    private ArrayList<Integer> getLongestBranch(Node node) {

        ArrayList<Integer> list = new ArrayList<>();
        if (node == null) {
            return list;
        }

        ArrayList<Integer> leftList = getLongestBranch(node.getIzq());
        ArrayList<Integer> rightList = getLongestBranch(node.getDer());

        if (leftList.size() > rightList.size()) {
            list.addAll(leftList);
        } else {
            list.addAll(rightList);
        }
        list.add(node.getInfo());

        return list;
    }

    //devuelve las hojas
    public ArrayList<Integer> getFrontera() {
        ArrayList<Integer> list = new ArrayList<>();
        return findHojas(root, list);
    }

    //devuelve las hojas recursivo
    private ArrayList<Integer> findHojas(Node node, ArrayList<Integer> list) {

        if (node == null)
            return list;

        if (node.getIzq() == null && node.getDer() == null) {
            list.add(node.getInfo());
        }
        findHojas(node.getIzq(), list);
        findHojas(node.getDer(), list);

        return list;
    }

    //obtiene el elemento mas grande
    public int getMaxElem() {
        int value = 0;
        return getMaxElement(this.root, value);
    }

    //obtiene el elemento mas grande recursivo
    private int getMaxElement(Node node, int value) {

        if (node == null)
            return value;

        else if (node.getInfo() > value)
            value = node.getInfo();

        if (node.getIzq() != null) {
            if (node.getIzq().getInfo() > value) {
                value = node.getIzq().getInfo();
                value = getMaxElement(node.getIzq(), value);
            }
        }
        if (node.getDer() != null) {
            if (node.getDer().getInfo() > value) {
                value = node.getDer().getInfo();
                value = getMaxElement(node.getDer(), value);
            }
        }

        return value;
    }

    //obtiene todos los nodos de un determinado nivel
    public ArrayList<Integer> getElemAtLevel(int level) {
        ArrayList<Integer> list = new ArrayList<>();
        return getElemAtLevel(root, level, list);
    }

    //obtiene todos los elementos de un determinado nivel recursivo
    private ArrayList<Integer> getElemAtLevel(Node node, int level, ArrayList<Integer> list) {

        if (node == null)
            return list;

        if (level != 0){
            if (node.getIzq() != null){
                getElemAtLevel(node.getIzq(), level-1, list);
            }
            if (node.getDer() != null){
                getElemAtLevel(node.getDer(), level-1, list);
            }
        }
        else
            list.add(node.getInfo());

    return list;
    }




////////////////////////////////////////PUNTO 2/////////////////////////////////////////////////////////////////////////


    public int suma(){
        int v = 0;
        return suma(this.root, v);
    }

    private int suma(Node node, int res){

        if (node == null){
            return 0;
        }

        res += node.getInfo();

        if (node.getIzq() != null){
            res = suma(node.getIzq(), res);
        }
        if (node.getDer() != null){
            res = suma(node.getDer(), res);
        }

        return  res;
    }


///////////////////////////////////////PUNTO 3//////////////////////////////////////////////////////////////////////////


    public ArrayList<Integer> searchLeafs(int k){

        ArrayList<Integer> res = new ArrayList<>();
        return searchLeafs(k, root, res);
    }

    private ArrayList<Integer> searchLeafs(int k, Node node, ArrayList<Integer> res){

        if (node == null){
            return res;
        }

        if ((node.getIzq() == null) && (node.getDer() == null) && node.getInfo() > k){
            res.add(node.getInfo());
        }

        if (node.getIzq() != null){
            res = searchLeafs(k, node.getIzq(), res);
        }


        if (node.getDer() != null){
            res = searchLeafs(k, node.getDer(), res);
        }

        return res;
    }


//////////////////////////////////////////PUNTO 4///////////////////////////////////////////////////////////////////////

    public void llenarEspaciosVacios(){

        llenarEspaciosVacios(root);
    }


    private void llenarEspaciosVacios(Node node){

        int valorIzq = 0;
        int valorDer = 0;

        if (node == null)
            return;

//////////////////////////izquierda//////////////////////////////////////////
        if (node.getIzq() != null) {
            llenarEspaciosVacios(node.getIzq());
            valorIzq = node.getIzq().getInfo();
        }

  //////////////////////derecha///////////////////////////////

        if (node.getDer() != null) {
            llenarEspaciosVacios(node.getDer());
            valorDer = node.getDer().getInfo();
        }

//////////////////////////caso especial/////////////////////////////////////////

        if (node.getInfo() == -1)
            node.setInfo(valorDer - valorIzq);

    }


    ////////////////////////////////////////PUNTO 5/////////////////////////////////////////////////////////////////////


    public ArrayList<String> buscarPalabras(int cant_vocales){
        String palabra = "";
        int contador = 0;
        ArrayList<String> resultado = new ArrayList<>();
        return buscarPalabra(this.root, resultado, cant_vocales, contador, palabra);
    }

    private ArrayList<String> buscarPalabra(Node node, ArrayList<String> resultado, int cant_vocales, int contador, String palabra ) {

        if (node == null) {
            return resultado;
        }

        palabra += node.getInfo();   //error pq es un string

        if (node.soyVocal())
            contador++;

        if (node.getIzq() != null){
            resultado = buscarPalabra(node.getIzq(), resultado, cant_vocales, contador, palabra);
        }

        if(node.getDer() != null){
            resultado = buscarPalabra(node.getDer(), resultado, cant_vocales, contador, palabra);
        }

        if (((node.getIzq() == null) && (node.getDer() == null)) && (contador == cant_vocales)){
            resultado.add(palabra+" ");
        }


        return resultado;
    }

}