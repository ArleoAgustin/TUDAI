package ej2AND3;

import grafos.GrafoDirigido;

import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {

        GrafoDirigido grafo = new GrafoDirigido<>();

        grafo.agregarVertice(19);
        grafo.agregarVertice(4);
        grafo.agregarVertice(11);
        grafo.agregarVertice(25);
        grafo.agregarVertice(44);
        grafo.agregarVertice(7);
        grafo.agregarVertice(0);
        grafo.agregarVertice(94);

        grafo.agregarArco(19, 4, "");
        grafo.agregarArco(19, 44, "");
        grafo.agregarArco(19, 25, "");
        grafo.agregarArco(4, 11, "");
        grafo.agregarArco(4, 44, "");
        grafo.agregarArco(11, 19, "");
        grafo.agregarArco(44, 11, "");
        grafo.agregarArco(25, 44, "");
        grafo.agregarArco(25, 7, "");
        grafo.agregarArco(7, 44, "");
        grafo.agregarArco(0, 25, "");
        grafo.agregarArco(0, 7, "");
        grafo.agregarArco(0, 94, "");
        grafo.agregarArco(94, 44, "");

        Dfs dfs = new Dfs(grafo);

        LinkedHashMap<Integer, Vertice> aux =  dfs.resolver_dfs();


        aux.forEach((vertice, value)->{

            System.out.println("Vertice: "+ vertice + ", Tiempo de descubrimiento: "
                    + value.getTiempoDescubrimiento() + ", Tiempo de finalizacion: "
                    + value.getTiempoFinalizacion());

        });

        System.out.println("Es ciclico: "+dfs.isCiclico());

/*
        GrafoDirigido grafo2 = new GrafoDirigido<>();

        grafo2.agregarVertice(25);
        grafo2.agregarVertice(10);
        grafo2.agregarVertice(40);
        grafo2.agregarVertice(35);
        grafo2.agregarVertice(55);
        grafo2.agregarVertice(8);
        grafo2.agregarVertice(17);

        grafo2.agregarArco(25,10,"");
        grafo2.agregarArco(25,40,"");
        grafo2.agregarArco(10,55,"");
        grafo2.agregarArco(40,35,"");
        grafo2.agregarArco(35,55,"");
        grafo2.agregarArco(55,8,"");
        grafo2.agregarArco(55,17,"");

        Bfs bfs = new Bfs(grafo2);

        bfs.bfs().forEach( index -> {
            System.out.print(index + " ");
        });

        */
    }
}