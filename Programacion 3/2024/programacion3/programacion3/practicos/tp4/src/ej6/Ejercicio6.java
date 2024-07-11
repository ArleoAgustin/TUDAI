package ej6;

import grafos.GrafoDirigido;
import grafos.GrafoNoDirigido;

import java.util.*;

public class Ejercicio6 {

    private LinkedHashMap<Integer, Boolean> vertices;
    private GrafoNoDirigido grafo;
    private Queue<Integer> fila;

    public Ejercicio6(GrafoNoDirigido grafo) {
        this.vertices = new LinkedHashMap<>();
        this.grafo = grafo;
        this.fila = new LinkedList<>();

        Iterator<Integer> itVertices = grafo.obtenerVertices();

        while (itVertices.hasNext()){
            int vertice = itVertices.next();
            this.vertices.put(vertice, false);
        }

    }

    public ArrayList caminoMasCorto(int inicio, int fin){

        ArrayList camino = new ArrayList<>();

        camino.addAll(this.buscarCamino( fin, inicio));


        return camino;

    }

/*  Supongamos que una ciudad se encuentra modelada mediante un grafo, donde cada nodo
    es una esquina, y las aristas representan las calles. Diseñe un algoritmo tal que dadas dos
    esquinas, devuelva el camino más corto entre ambas de manera de caminar la menor
    cantidad de cuadras posible.
*/

    private ArrayList buscarCamino(int fin, int inicio){


        HashMap<Integer,Integer> padre = new HashMap<>();
        this.vertices.put(inicio, true);
        this.fila.add(inicio);
        padre.put(inicio, -1);

        while (!fila.isEmpty()){
            int primero = fila.poll();
            if (primero == fin)
                break;

            Iterator<Integer> itady = grafo.obtenerAdyacentes(primero);
            while (itady.hasNext()){
                int verticeAdy = itady.next();
                if (!padre.containsKey(verticeAdy)){        // Verificar si el nodo adyacente no ha sido visitado
                    padre.put(verticeAdy,primero);      // Establecer el nodo actual como padre del nodo adyacente
                    fila.add(verticeAdy);

                }
            }

        }
        // Reconstrucción del camino más corto
        ArrayList camino = new ArrayList<>();
        int verticeActual = fin;
        while(verticeActual != -1){                     // El nodo de inicio tiene un padre de -1
            camino.add(0, verticeActual);     // Agregar el nodo actual al inicio del camino
            verticeActual = padre.get(verticeActual);       // Mover al padre del nodo actual
        }

        return camino;

    }


}
