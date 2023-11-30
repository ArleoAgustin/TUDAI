package tp3.ej8;

import tp3.ej4.Arco;
import tp3.ej4.GrafoDirigido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Ej8 {


    private HashMap<Integer, String> vertices;
    private GrafoDirigido grafo;
    private List<List> resultado;

    public Ej8(GrafoDirigido grafo) {
        this.grafo = grafo;
        this.vertices = new HashMap<>();
        this.resultado = new ArrayList<>();

        Iterator<Integer> itVertices = grafo.obtenerVertices();
        while (itVertices.hasNext()){
            vertices.put(itVertices.next(), "Blanco");
        }
    }


    public List<List> resolver(int v1, int v2) {

        List camino = new ArrayList();
        List visitados = new ArrayList();
        camino.add(v1);
        visitados.add(v1);
        resolver(v1,v2, camino, visitados);

        return resultado;
    }

    private void resolver(int v1, int v2, List camino, List visitados){

        if (v1 == v2){
            System.out.println(camino);
            resultado.add(new ArrayList(camino));
        }
        else{
            for (Iterator<Integer> it = grafo.obtenerAdyacentes(v1); it.hasNext(); ) {
                int ady = it.next();
                Arco arco = grafo.obtenerArco(v1, ady);

                if (!visitados.contains(ady) && !arco.getEtiqueta().equals("Rojo")){
                    camino.add(ady);
                    visitados.add(ady);
                    resolver(ady,v2,camino,visitados);
                    camino.remove(camino.size()-1);
                    visitados.remove(visitados.size()-1);
                }
            }
        }
    }
}
