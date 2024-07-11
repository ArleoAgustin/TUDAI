package ej1;

import grafos.GrafoDirigido;

public class Main {

    public static void main(String[] args) {

        GrafoDirigido grafo = new GrafoDirigido();

        grafo.agregarVertice(38);
        grafo.agregarVertice(10);
        grafo.agregarVertice(44);
        grafo.agregarVertice(52);
        grafo.agregarVertice(81);
        grafo.agregarVertice(14);
        grafo.agregarVertice(64);
        grafo.agregarVertice(22);
        grafo.agregarVertice(100);

        grafo.agregarArco(38,81,"");
        grafo.agregarArco(38,10,"");
        grafo.agregarArco(10,44,"");
        grafo.agregarArco(10,52,"");
        grafo.agregarArco(44,52,"");
        grafo.agregarArco(52,14,"");
        grafo.agregarArco(81,14,"");
        grafo.agregarArco(14,64,"");
        grafo.agregarArco(64,52,"");
        grafo.agregarArco(64,22,"");
        grafo.agregarArco(22,100,"");
        grafo.agregarArco(52,22,"");
        grafo.agregarArco(52, 100,"");

        Ejercicio1 ej1 = new Ejercicio1(grafo);
        System.out.println(ej1.buscarCamino(38,100));
    }
}
