package ej4;

import ej3.Ej3;
import grafos.GrafoNoDirigido;

public class Main {

    public static void main(String[] args) {

        GrafoNoDirigido grafo = new GrafoNoDirigido();

        grafo.agregarVertice(5);
        grafo.agregarVertice(7);
        grafo.agregarVertice(9);
        grafo.agregarVertice(10);
        grafo.agregarVertice(2);
        grafo.agregarVertice(8);

        grafo.agregarArco(5,7,"");
        grafo.agregarArco(5,9,"");
        grafo.agregarArco(7,9,"");
        grafo.agregarArco(9,2,"");
        grafo.agregarArco(9,10,"");
        grafo.agregarArco(10,2,"");
        grafo.agregarArco(10,8,"");
        grafo.agregarArco(2,8,"");


        Ej4 ej4 = new Ej4(grafo);

        System.out.println(ej4.encontrarMayorCiclo());


    }
}
