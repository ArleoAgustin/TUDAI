package ej4;

import grafos.GrafoNoDirigido;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ej4 {

    private GrafoNoDirigido grafo;

    public Ej4(GrafoNoDirigido grafo) {
        this.grafo = grafo;
    }

    public List<Integer> encontrarMayorCiclo() {

        ArrayList<Boolean> visitados = new ArrayList();
        List<Integer> mayorCiclo = new ArrayList<>();

        Iterator<Integer> vertices = grafo.obtenerVertices();

        while (vertices.hasNext()) {
            int v = vertices.next();

            if (!visitados.contains(v)) {
                List<Integer> ciclo = new ArrayList<>();
                List<Integer> tempCiclo = new ArrayList<>();
                if (dfs(v, -1, visitados, tempCiclo)) {  // Inicializa la DFS con padre = -1
                    // Un ciclo fue encontrado, ahora cortar el ciclo desde el inicio al final
                    for (int i = 0; i < tempCiclo.size(); i++) {
                        ciclo.add(tempCiclo.get(i));
                        if (tempCiclo.get(i) == tempCiclo.get(tempCiclo.size() - 1) && i != tempCiclo.size() - 1) {
                            break;
                        }
                    }
                    if (ciclo.size() > mayorCiclo.size()) {
                        mayorCiclo = new ArrayList<>(ciclo);
                    }
                }
            }
        }
        return mayorCiclo;
    }

    private boolean dfs(int v, int padre, ArrayList visitados, List<Integer> ciclo) {
        visitados.add(v);
        ciclo.add(v);

        Iterator<Integer> vecinos = grafo.obtenerAdyacentes(v);

        while (vecinos.hasNext()) {
            int vecino = vecinos.next();
            if (!visitados.contains(vecino)) {
                if (dfs(vecino, v, visitados, ciclo)) {  // Llama recursivamente con el nodo actual como padre
                    return true;
                }
            } else if (vecino != padre) {  // Detecta un ciclo si el vecino ya fue visitado y no es el padre
                ciclo.add(vecino);
                return true;
            }
        }

        ciclo.remove(ciclo.size() - 1);  // Si no se encuentra un ciclo, remueve el nodo actual de la lista
        return false;
    }
}

