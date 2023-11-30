package tp3.ej7;

import tp3.ej4.Arco;
import tp3.ej4.GrafoDirigido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Ej7 {

    private HashMap<Integer, String> vertices;
    private GrafoDirigido grafo;
    private List resultado;

    public Ej7(GrafoDirigido grafo) {
        this.grafo = grafo;
        this.vertices = new HashMap<>();
        this.resultado = new ArrayList<>();

        Iterator<Integer> itVertices = grafo.obtenerVertices();
        while (itVertices.hasNext()){
            vertices.put(itVertices.next(), "Blanco");
        }
    }

    public List resolver(int v1, int v2) {

        List camino = new ArrayList();
        List visitados = new ArrayList();

        buscar(v1,v2, 0, camino, visitados);

        return resultado;
    }


    private void buscar(int actual, int v2, int distancia, List camino, List visitados){


        if (actual == v2){
            System.out.println(camino);
            if (resultado.isEmpty())
                resultado = new ArrayList(camino);

            if (camino.size() < resultado.size()){

                resultado = new ArrayList(camino);
            }
            return;
        }
        else {

            for (Iterator<Integer> it = grafo.obtenerAdyacentes(actual); it.hasNext(); ) {
                int ady = it.next();
                Arco arco = grafo.obtenerArco(actual, ady);

                if (!visitados.contains(ady)) {
                    visitados.add(ady);
                    camino.add(arco);
                    buscar(ady, v2, distancia, camino, visitados);
                    visitados.remove(visitados.size() - 1);
                    camino.remove(camino.size() - 1);
                }
            }
        }
    }

}
