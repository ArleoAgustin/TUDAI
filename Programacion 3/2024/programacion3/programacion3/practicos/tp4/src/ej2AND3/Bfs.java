package ej2AND3;

import grafos.GrafoDirigido;

import java.util.*;

public class Bfs {

    private LinkedHashMap<Integer, Vertice> vertices;
    private Queue<Integer> fila;
    private GrafoDirigido grafo;

    public Bfs(GrafoDirigido grafo) {

        this.grafo = grafo;
        this.vertices = new LinkedHashMap<>();
        this.fila = new LinkedList<>();

        Iterator<Integer> it = grafo.obtenerVertices();
        while (it.hasNext()){
            vertices.put(it.next(), new Vertice());
        }
    }


    public ArrayList<Integer> bfs(){

        ArrayList<Integer> visitados = new ArrayList<Integer>();

        vertices.forEach( (vertice, value) ->{

            if (value.getColor().equals("Blanco"))
                visitados.addAll(this.bfs(vertice));

        });

        return visitados;
    }


    private ArrayList<Integer> bfs(Integer v){

        ArrayList<Integer> visitados = new ArrayList<Integer>();

        vertices.get(v).setColor("Amarillo");
        fila.add(v);

        while (!fila.isEmpty()){

            int primero = fila.poll();
            visitados.add(primero);

            Iterator<Integer> itady = grafo.obtenerAdyacentes(primero);
            while (itady.hasNext()){
                int verticeAdy = itady.next();
                if (vertices.get(verticeAdy).getColor().equals("Blanco")){
                    vertices.get(verticeAdy).setColor("Amarillo");
                    fila.add(verticeAdy);

                }
            }

        }
        return visitados;

    }


}
