package parcial2023.ej1_b;

import java.util.List;

public class Ej2 {

    private TreeNode arbol;

    public Ej2(TreeNode arbol) {
        this.arbol = arbol;
    }

    public Node crearArbol(List<Integer> array, int start, int end){

        if (start > end)
            return null;

        int mid = (start + end) / 2;

        Node root = new Node(array.get(mid));
        root.setIzq(crearArbol(array, start,mid-1));
        root.setDer(crearArbol(array, mid+1, end));

        return root;
    }

    public void imprimir(){

        arbol.print();

    }


}
