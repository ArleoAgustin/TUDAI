package ej5;

import grafos.GrafoDirigido;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Ejercicio5 {

    private LinkedHashMap<Integer, Boolean> vertices;
    private GrafoDirigido grafo;
/*
    Escriba un algoritmo que dado un grafo G y un vértice v de dicho grafo, devuelva una lista
    con todos los vértices a partir de los cuales exista un camino en G que termine en v.
*/


    public Ejercicio5(GrafoDirigido grafo) {

        this.vertices = new LinkedHashMap<>();
        this.grafo = grafo;

        Iterator<Integer> itVertices = grafo.obtenerVertices();

        while (itVertices.hasNext()){
            int vertice = itVertices.next();
            this.vertices.put(vertice, false);
        }
    }

    public ArrayList encontrarCamino(int v){

        ArrayList<Integer> camino = new ArrayList<>();

        for (Integer vertice: this.vertices.keySet()){
            if (!this.vertices.get(vertice).booleanValue()) {
                if (encontrarCamino(v, vertice, false))
                    camino.add(vertice);
            }

        }
    return camino;
    }

    private boolean encontrarCamino(int v, int vertice, boolean llego){

        this.vertices.put(v, true);

        Iterator<Integer> itAdy = grafo.obtenerAdyacentes(vertice);
        if (itAdy != null){
            while (itAdy.hasNext()){

                int ady = itAdy.next();
                llego = encontrarCamino(v,ady, llego);

                this.vertices.put(ady, false);

            }
        }

        if (vertice == v){
                return true;
        }

        return llego;
    }

}
