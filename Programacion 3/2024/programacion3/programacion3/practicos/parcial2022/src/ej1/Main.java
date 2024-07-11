package ej1;

import ej1.grafos.GrafoDirigido;

public class Main {

    public static void main(String[] args) {

        GrafoDirigido grafo = new GrafoDirigido<>();

        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);
        grafo.agregarVertice(5);
        grafo.agregarVertice(6);

        grafo.agregarArco(1,2,7);
        grafo.agregarArco(1,3,3);
        grafo.agregarArco(2,3,1);
        grafo.agregarArco(2,4,6);
        grafo.agregarArco(4,3,3);
        grafo.agregarArco(3,5,8);
        grafo.agregarArco(5,4,2);
        grafo.agregarArco(4,6,2);
        grafo.agregarArco(5,6,8);

        Ej1 ej1 = new Ej1(grafo);

        System.out.println(ej1.buscar(13));
    }

}