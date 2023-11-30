package tp3.ej4;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Ej4 {

    private HashMap<Integer, String> vertices;
    private GrafoDirigido grafo;
    private List mejorCamino;

    public Ej4(GrafoDirigido grafo) {
        this.grafo = grafo;
        this.vertices = new HashMap<>();
        this.mejorCamino = new ArrayList<>();
        Iterator<Integer> itVertices = grafo.obtenerVertices();
        while (itVertices.hasNext()){
            vertices.put(itVertices.next(), "Blanco");
        }
    }

    public List caminoMasLargo(int i, int j){

        List res = new ArrayList();
        List visitados = new ArrayList();
        res.add(i);
        visitados.add(i);
        buscarCamino(i,j,res, visitados);

        return mejorCamino;
    }

    private void buscarCamino(int i, int j, List<Integer> camino, List<Integer> v) {

        if (i == j) {
            if (camino.size() > mejorCamino.size())
                mejorCamino = new ArrayList<>(camino);
            return;
        }
        else {
            for (Iterator<Integer> it = grafo.obtenerAdyacentes(i); it.hasNext(); ) {
                int ady = it.next();
                    if (!v.contains(ady)){
                        camino.add(ady);
                        v.add(ady);
                        buscarCamino(ady, j, camino,v);
                        camino.remove(camino.size() - 1);
                        v.remove(v.size()-1);}
                }
            }
        }
    }

