package ej7;

import grafos.Arco;
import grafos.GrafoNoDirigido;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Ejercicio7 {

    private LinkedHashMap<Integer, Boolean> ciudades;
    private GrafoNoDirigido<Integer> grafo;

    public Ejercicio7(GrafoNoDirigido<Integer> grafo) {
        this.grafo = grafo;
        this.ciudades = new LinkedHashMap<>();

        Iterator<Integer> itVertices = grafo.obtenerVertices();

        while (itVertices.hasNext()){
            int vertice = itVertices.next();
            this.ciudades.put(vertice, false);
        }
    }

    public ArrayList<ArrayList> buscarCaminos(int inicio, int fin, Arco caminoBloqueado){

        return buscar(inicio, fin, caminoBloqueado, new ArrayList<>(), new ArrayList<>());
    }

    private ArrayList<ArrayList> buscar(int v_actual, int v_destino, Arco caminoBloqueado, ArrayList caminoActual, ArrayList caminosParaLlegar) {

        caminoActual.add(v_actual);
        this.ciudades.put(v_actual, true); //marco la ciudad como visitada

        if (v_actual == v_destino){
            if (caminoActual.size() > caminosParaLlegar.size()) {
                caminosParaLlegar.add(new ArrayList<>(caminoActual));
                return caminosParaLlegar;
            }else
                return caminosParaLlegar;
        }

        Iterator<Integer> vecinos = this.grafo.obtenerAdyacentes(v_actual);

        while (vecinos.hasNext()){
            int vecino = vecinos.next();

            if ((v_actual == caminoBloqueado.getVerticeOrigen() ) && (vecino == caminoBloqueado.getVerticeDestino())){  //omite la ruta
                if (vecinos.hasNext())
                    vecino = vecinos.next();
                else break;
            }
            if (!this.ciudades.get(vecino)) {
                caminosParaLlegar = buscar(vecino, v_destino, caminoBloqueado, caminoActual, caminosParaLlegar);
                caminoActual.remove(caminoActual.size()-1);
                this.ciudades.put(vecino, false);

            }
        }

        return caminosParaLlegar;

    }
}
