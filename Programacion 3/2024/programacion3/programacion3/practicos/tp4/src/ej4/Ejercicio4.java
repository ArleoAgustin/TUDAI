package ej4;

import ej2AND3.Vertice;
import grafos.GrafoDirigido;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Ejercicio4 {

    private GrafoDirigido grafo;
    private LinkedHashMap<Integer, Boolean> vertices;

    public Ejercicio4(GrafoDirigido grafo) {
        this.grafo = grafo;

        this.vertices = new LinkedHashMap<>();
        Iterator<Integer> getVertices = grafo.obtenerVertices();
        while (getVertices.hasNext()){
            int vertice = getVertices.next();
            vertices.put(vertice, false);

        }
    }


    public ArrayList caminoMasLargo(int i, int j){


        ArrayList masLargo = new ArrayList<>();

       masLargo.addAll(this.buscar(i,j, i, new ArrayList(), new ArrayList()));


        return masLargo;
    }

    private ArrayList buscar(int i, int j, int vertice, ArrayList caminoActual, ArrayList caminoMasLargo) {

        this.vertices.put(vertice, true);
        caminoActual.add(vertice);

        Iterator<Integer> it_ady = grafo.obtenerAdyacentes(vertice);
        if (it_ady != null){
            while (it_ady.hasNext()){
                int adyacente = it_ady.next();

                if (!this.vertices.get(adyacente).booleanValue()) {
                    caminoMasLargo = buscar(i, j, adyacente, caminoActual, caminoMasLargo);

                    caminoActual.remove(caminoActual.size()-1);
                    this.vertices.put(adyacente, false);
                }
            }
        }
        if (vertice == j){
            if (caminoActual.size() > caminoMasLargo.size()) {
                caminoMasLargo = new ArrayList<>(caminoActual);
                return caminoMasLargo;
            }
        }

        return caminoMasLargo;
    }
}
