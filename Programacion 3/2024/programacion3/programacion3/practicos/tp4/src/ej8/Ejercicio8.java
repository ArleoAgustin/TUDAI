package ej8;

import grafos.Arco;
import grafos.GrafoDirigido;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Ejercicio8 {

    private LinkedHashMap<Integer, Tarea> tareas;
    private HashMap<Integer, Boolean> tareasVisitadas;
    private GrafoDirigido grafo;
    private HashMap<Integer, ArrayList<Integer>> tareasCriticas;

    public Ejercicio8(LinkedHashMap<Integer, Tarea> tareas, HashMap<Integer, Boolean> tareasVisitadas, GrafoDirigido grafo) {
        this.tareas = new LinkedHashMap<>(tareas);
        this.tareasVisitadas = new HashMap<>(tareasVisitadas);
        this.grafo = grafo;
        this.tareasCriticas = new HashMap<>();
    }

    public ArrayList<Integer> buscarTareasCriticas() {
        tareas.forEach((key, value) -> {
            if (!tareasVisitadas.get(key)) {
                buscar(key, value, 0, new ArrayList<>());
            }
        });

        // Encontrar el máximo tiempo de ejecución
        int maxDuracion = 0;
        for (int duracion : tareasCriticas.keySet()) {
            maxDuracion = Math.max(maxDuracion, duracion);  //devuelve el mayor de los valores
        }

        // Devolver las tareas críticas que tienen la duración máxima
        return tareasCriticas.get(maxDuracion);
    }

    private void buscar(int vActual, Tarea tActual, int contadorHs, ArrayList<Integer> encontradas) {
        tareasVisitadas.put(vActual, true);
        encontradas.add(vActual);
        contadorHs += tActual.getDuracion();

        Iterator<Integer> itAdy = grafo.obtenerAdyacentes(vActual);
        if (itAdy.hasNext()) {
            while (itAdy.hasNext()) {
                int ady = itAdy.next();
                if (!tareasVisitadas.get(ady)) {
                    Arco arco = grafo.obtenerArco(vActual, ady);
                    contadorHs += (int) arco.getEtiqueta();
                    tareasVisitadas.put(ady, true);
                    buscar(ady, tareas.get(ady), contadorHs, encontradas);
                    contadorHs -= (int) arco.getEtiqueta();
                    tareasVisitadas.put(ady, false);
                }
            }
        } else {
           //  Almacena las tareas críticas con la duración acumulada
            if (!tareasCriticas.containsKey(contadorHs) || tareasCriticas.get(contadorHs).size() < encontradas.size()) {
                tareasCriticas.put(contadorHs, new ArrayList<>(encontradas));
            }
        }
        encontradas.remove(encontradas.size() - 1);
        contadorHs -= tActual.getDuracion();
    }
}
