package parcial2022.ej1;

import java.util.*;

public class ServicioDFS {

    private LinkedHashMap<Integer, String> vertices;
    private Grafo<?> grafo;

    public ServicioDFS(Grafo<?> grafo) {
        this.grafo = grafo;
        this.vertices = new LinkedHashMap<>();
        Iterator<Integer> iteradorVertices = grafo.obtenerVertices();   //iterador de vertices

        while (iteradorVertices.hasNext()) {
            this.vertices.put(iteradorVertices.next(), "Blanco");   //se agregan los vertices en "blanco"
        }
    }

    public boolean dfsForest() {


            for (Map.Entry<Integer, String> input : vertices.entrySet()) {
                if (input.getValue().equals("Blanco"))
                    return dfsForest(input.getKey());
            }
        return false;
    }

    private boolean dfsForest(int v){

        vertices.put(v,"Amarillo"); //lo marca como visitado
        Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(v);  // Obtiene los adyacentes del vértice

        if (adyacentes!= null){
            while (adyacentes.hasNext()) {
                int ady = adyacentes.next();
                if (vertices.get(ady).equals("Blanco")) //si no fue visitado
                    this.dfsForest(ady);
                else{
                    if (vertices.get(ady).equals("Amarillo")) {
                        System.out.println(ady);
                        System.out.println("Hay ciclo");
                    }
                }
            }
        }
        return false;
    }


}
