package ej6;

import ej5.Ejercicio5;
import grafos.GrafoDirigido;
import grafos.GrafoNoDirigido;

public class Main {

    public static void main(String[] args) {

        GrafoNoDirigido grafo = new GrafoNoDirigido();

        grafo.agregarVertice(78);
        grafo.agregarVertice(5);
        grafo.agregarVertice(35);
        grafo.agregarVertice(667);
        grafo.agregarVertice(954);
        grafo.agregarVertice(44);
        grafo.agregarVertice(100);

        grafo.agregarArco(78,667, "Alem");
        grafo.agregarArco(78,5, "Garibaldi");
        grafo.agregarArco(5,35, "Colon");
        grafo.agregarArco(35,667, "Roca");
        grafo.agregarArco(667,954, "9 de julio");
        grafo.agregarArco(35,44, "Marconi");
        grafo.agregarArco(667,44, "Garralda");
        grafo.agregarArco(954,44, "Saavedra");
        grafo.agregarArco(44,100, "Alem");


        Ejercicio6 ej6 = new Ejercicio6(grafo);

        System.out.println(ej6.caminoMasCorto(78,100));
    }
}
