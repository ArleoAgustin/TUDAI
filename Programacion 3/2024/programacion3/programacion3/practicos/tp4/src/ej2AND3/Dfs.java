package ej2AND3;

import grafos.GrafoDirigido;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class Dfs {

    private GrafoDirigido grafo;
    private LinkedHashMap<Integer, Vertice> vertices;
    private int tiempo;
    private boolean ciclico;

    public Dfs(GrafoDirigido grafo) {

        this.ciclico = false;
        this.grafo = grafo;
        this.vertices = new LinkedHashMap<>();
        Iterator<Integer> getVertices = grafo.obtenerVertices();
        while (getVertices.hasNext()){

            int vertice = getVertices.next();
            Vertice verticeObj = new Vertice();
            verticeObj.setColor("Blanco");
            vertices.put(vertice, verticeObj);

        }
    }

    public LinkedHashMap resolver_dfs(){

        int tiempo = 0;

        for (Integer v : vertices.keySet()){
            if (vertices.get(v).getColor().equals("Blanco"))
                dfs_visit(v);
        }
        return new LinkedHashMap(this.vertices);
    }

    private void dfs_visit(Integer v) {

        vertices.get(v).setColor("Amarillo");
        tiempo = tiempo+1;
        vertices.get(v).setTiempoDescubrimiento(tiempo);
        Iterator<Integer> ady = grafo.obtenerAdyacentes(v);

        while (ady.hasNext()){
            int adyacente = ady.next();
            if (vertices.get(adyacente).getColor().equals("Blanco"))
                dfs_visit(adyacente);

            else if(vertices.get(adyacente).getColor().equals("Amarillo"))
                this.ciclico = true;
        }

        vertices.get(v).setColor("Negro");
        tiempo = tiempo+1;
        vertices.get(v).setTiempoFinalizacion(tiempo);

    }

    public boolean isCiclico() {
        return ciclico;
    }

}


