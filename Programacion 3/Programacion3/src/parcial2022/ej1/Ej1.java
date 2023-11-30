package parcial2022.ej1;

import tp4.Grafo;

import java.util.*;

public class Ej1 {

    private GrafoDirigido grafo;
    private ArrayList<Integer> vertices;
    private HashMap<Integer, String> vert;
    private ArrayList<Integer> visitados;

    public Ej1(GrafoDirigido grafo) {
        this.grafo = grafo;
        this.vert = new HashMap<>();
        vertices = new ArrayList();
        visitados = new ArrayList<>();

        for (Iterator<Integer> it = grafo.obtenerVertices(); it.hasNext(); ) {
            int t = it.next();
            vertices.add(t);
            vert.put(t, "Blanco");
        }

    }

    public boolean esIgual(int t) {

        for (int v : vertices) {
            buscar(t, v, 0);
        }
        return false;
    }

    private void buscar(int t, int actual, int suma) {
        System.out.println(actual);
        if (suma == t) {
            System.out.println("Son iguales");
            return;
        }
        if (!visitados.contains(actual)) {
            visitados.add(actual);
            for (Iterator<Integer> it = grafo.obtenerAdyacentes(actual); it.hasNext(); ) {
                int ady = it.next();
                if (visitados.contains(ady)) {
                    System.out.println("Hay ciclo en" + ady);
                    Arco<Integer> arco = grafo.obtenerArco(actual, ady);
                    suma += arco.getEtiqueta();
                    buscar(t, ady, suma);
                }
            }
        }

    }

    public boolean dfsForest(int t) {

        if (dfsForest(1, t, 0)){
            System.out.println(vert);
            return true;}
return false;
    }

    private boolean dfsForest(int v, int t, int suma) {

        if (vert.get(v).equals("Blanco")) {
            vert.put(v, "Amarillo");
        }

        for (Iterator<Integer> it = grafo.obtenerAdyacentes(v); it.hasNext(); ) {
            int ady = it.next();

            if (vert.get(ady).equals("Blanco")) {
                dfsForest(ady, t, suma);
            }

            if (vert.get(ady).equals("Amarillo")) {
                vert.put(ady, "Rojo");
                dfsForest(ady, t, suma);
            }
        }


        return true;
    }
}
