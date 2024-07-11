package Ej8;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GrafoDirigido grafo = new GrafoDirigido();

        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);
        grafo.agregarVertice(5);
        grafo.agregarVertice(6);
        grafo.agregarVertice(7);

        grafo.agregarArco(1,2,"");
        grafo.agregarArco(2,3,"");
        grafo.agregarArco(2,4,"");
        grafo.agregarArco(3,5,"");
        grafo.agregarArco(4,6,"");
        grafo.agregarArco(4,3,"");
        grafo.agregarArco(4,5,"");
        grafo.agregarArco(6,5,"");
        grafo.agregarArco(7,6,"");
        grafo.agregarArco(1,7,"");
        grafo.agregarArco(7,4,"");


        ArrayList colores = new ArrayList();

        colores.add("Amarillo");
        colores.add("Azul");
        colores.add("Verde");

    }
}
