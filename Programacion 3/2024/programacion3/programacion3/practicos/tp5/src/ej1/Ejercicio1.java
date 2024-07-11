package ej1;

import grafos.GrafoDirigido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Ejercicio1 {

    private GrafoDirigido grafo;
    private LinkedHashMap<Integer, Boolean> salas;

    public Ejercicio1(GrafoDirigido grafo) {
        this.grafo = grafo;
        this.salas = new LinkedHashMap<>();

        Iterator<Integer> itSalas = grafo.obtenerVertices();
        while (itSalas.hasNext()){
            salas.put(itSalas.next(), false);
        }
    }

    public ArrayList buscarCamino(int inicio, int fin){

        ArrayList camino = new ArrayList();


        camino.addAll(back(inicio, fin, new ArrayList<>(), new ArrayList<>()));

        return camino;
    }

    private ArrayList back(int actual, int fin, ArrayList<Integer> camino, ArrayList<Integer> mejorCamino) {

        this.salas.put(actual, true);
        camino.add(actual);

        if (actual == fin){

          if (camino.size() > mejorCamino.size()){
              mejorCamino = new ArrayList<>(camino);
              camino.remove(camino.size()-1);
              this.salas.put(actual, false);
            return mejorCamino;
          }
        }
        else {
            Iterator<Integer> itAdy = grafo.obtenerAdyacentes(actual);
            while (itAdy.hasNext()){
                int adyacente = itAdy.next();
                if (!this.salas.get(adyacente)){
                    mejorCamino = back(adyacente, fin, camino, mejorCamino);

                }
            }
        }
        camino.remove(camino.size()-1);
        this.salas.put(actual, false);
    return mejorCamino;
    }
}
