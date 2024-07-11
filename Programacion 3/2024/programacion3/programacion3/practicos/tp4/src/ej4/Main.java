package ej4;

import ej2AND3.Dfs;
import ej2AND3.Vertice;
import grafos.GrafoDirigido;

import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {

        GrafoDirigido grafo = new GrafoDirigido<>();

        grafo.agregarVertice(0);
        grafo.agregarVertice(55);
        grafo.agregarVertice(9);
        grafo.agregarVertice(78);
        grafo.agregarVertice(100);



        grafo.agregarArco(0, 55, "");
        grafo.agregarArco(0, 9, "");
        grafo.agregarArco(55, 9, "");
        grafo.agregarArco(55, 78, "");
        grafo.agregarArco(9, 100, "");
        grafo.agregarArco(78, 9, "");
        grafo.agregarArco(78, 100, "");

        Dfs dfs = new Dfs(grafo);

        LinkedHashMap<Integer, Vertice> aux =  dfs.resolver_dfs();


        aux.forEach((vertice, value)->{

            System.out.println("Vertice: "+ vertice + ", Tiempo de descubrimiento: "
                    + value.getTiempoDescubrimiento() + ", Tiempo de finalizacion: "
                    + value.getTiempoFinalizacion());

        });

        Ejercicio4 ej4 = new Ejercicio4(grafo);

        ej4.caminoMasLargo(0,100).forEach( vertice ->{

            System.out.print(vertice + " ");
        });

    }
}
