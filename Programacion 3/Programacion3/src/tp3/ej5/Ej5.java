package tp3.ej5;

import tp3.ej4.GrafoDirigido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Ej5 {

    private HashMap<Integer, String> vertices;
    private GrafoDirigido grafo;
    private List resultado;

    public Ej5(GrafoDirigido grafo) {
        this.grafo = grafo;
        this.vertices = new HashMap<>();
        this.resultado = new ArrayList<>();

        Iterator<Integer> itVertices = grafo.obtenerVertices();
        while (itVertices.hasNext()){
            vertices.put(itVertices.next(), "Blanco");
        }
    }

    public List resolver(int v){

        List res = new ArrayList();
        List visitados = new ArrayList();
        for (int i: vertices.keySet()) {
            res.clear();
            visitados.clear();
            if (i != v){
                res.add(i);
                visitados.add(i);
                System.out.println("FF" + i);
                buscar(i, v, res, visitados);
            }
        }
        return resultado;
    }

    private void buscar(int actual, int v, List camino, List visitados){
        System.out.println("Actual"+ actual);
        System.out.println(camino);
        if (actual == v){
            if (!resultado.contains(camino.get(0)))
                resultado.add(camino.get(0));
            return;
        }
        else{

            Iterator<Integer> itAdy = grafo.obtenerAdyacentes(actual);
            while (itAdy.hasNext()){
            int ady = itAdy.next();
                if (!visitados.contains(ady)) {
                    visitados.add(actual);
                    camino.add(ady);
                    buscar(ady, v, camino, visitados);
                }
            }

        }

    }

}
