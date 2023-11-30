package parcial2019.ej1;

import tp3.GrafoNoDirigido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Ej1 {

    private GrafoNoDirigido grafo;
    private List<List> resultado;
    private HashMap<Integer, String> vertices;

    public Ej1(GrafoNoDirigido grafo) {

        this.grafo = grafo;
        this.resultado = new ArrayList<>();
        this.vertices = new HashMap<>();

        Iterator<Integer> itVertices = grafo.obtenerVertices();
        while (itVertices.hasNext()){
            vertices.put(itVertices.next(), "Blanco");
        }
    }

    public List buscar(int v, int z, int w){

        buscar(v, z, w, new ArrayList<>(), new ArrayList<>());

        return resultado;
    }

    private void buscar(int v, int z, int w, List camActual, List visitados){

        if (v == w){
            if (resultado.size() < camActual.size()){
                resultado = new ArrayList<>(camActual);
            }
            return;
        }
        else {
            if (visitados.isEmpty()) {
                visitados.add(v);
                camActual.add(v);
            }
            for (Iterator<Integer> it = grafo.obtenerAdyacentes(v); it.hasNext(); ) {
                int ady = it.next();

                if (!visitados.contains(ady) && ady != z){
                    visitados.add(ady);
                    camActual.add(ady);
                    buscar(ady,z,w,camActual,visitados);
                    visitados.remove(visitados.size()-1);
                    camActual.remove(camActual.size()-1);
                }

            }
        }
    }
}
