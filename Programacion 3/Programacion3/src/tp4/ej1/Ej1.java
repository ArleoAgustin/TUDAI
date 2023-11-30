package tp4.ej1;

import tp4.Grafo;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class Ej1 {

    private Grafo grafo;
    private List camino;
    private HashSet salas;

    public Ej1(Grafo grafo) {
        this.grafo = grafo;
        this.salas = new HashSet();
        this.camino = new ArrayList();

        for (Iterator<Integer> it = grafo.obtenerVertices(); it.hasNext(); ) {
            int s = it.next();
            salas.add(s);
        }
    }

    public List buscarCamino(int entrada, int salida){

            List visitados = new ArrayList();
            List caminoActual = new ArrayList();
            visitados.add(entrada);
            caminoActual.add(entrada);
            resolver(entrada, salida, caminoActual, visitados);

        return camino;
    }

    private void resolver(int actual, int salida, List caminoActual, List visitados){

        if (actual == salida){
            if (caminoActual.size() > camino.size()){
                camino = new ArrayList(caminoActual);
            }
            return;
        }
        else{
            for (Iterator<Integer> it = grafo.obtenerAdyacentes(actual); it.hasNext(); ) {
                int salaAdy = it.next();

                if (!visitados.contains(salaAdy)){
                    visitados.add(salaAdy);
                    caminoActual.add(salaAdy);
                    resolver(salaAdy, salida, caminoActual, visitados);
                    visitados.remove(visitados.size()-1);
                    caminoActual.remove(caminoActual.size()-1);
                }

            }
        }
    }

}
