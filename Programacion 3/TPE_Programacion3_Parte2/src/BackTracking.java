import TPE_Parte1.Arco;
import TPE_Parte1.GrafoNoDirigido;

import javax.swing.*;
import java.util.*;

public class BackTracking {

    private GrafoNoDirigido<Integer> grafo;
    private List<Arco<Integer>> mejorSolucion;
    private int menorDistancia;
    private int iteraciones;
    private List<Arco<Integer>> arcos;

    public int getIteraciones() {
        return iteraciones;
    }

    public BackTracking(GrafoNoDirigido<Integer> grafo) {
        this.grafo = grafo;
        this.mejorSolucion = new ArrayList<>();
        this.menorDistancia = Integer.MAX_VALUE;
        this.iteraciones = 0;
        this.arcos = new ArrayList<>();

        for (Iterator<Arco<Integer>> it = grafo.obtenerArcos(); it.hasNext(); ) {
            Arco<Integer> arco = it.next();
            this.arcos.add(arco);
        }
    }


    public List<Arco<Integer>> backtracking(int estacionInicial) {

        List<Integer> estaciones = new ArrayList<>();
        ArrayList<Arco<Integer>> arcosVisitados = new ArrayList<>();
        List<Arco<Integer>> solucionActual = new ArrayList<>();
        backtracking(estaciones, estacionInicial, arcosVisitados, solucionActual, mejorSolucion,0);
        return mejorSolucion;
    }



    private void backtracking(List<Integer> estacionesVisitadas, int estacionActual, List<Arco<Integer>> arcosVisitados,
                              List<Arco<Integer>> solucionActual, List<Arco<Integer>> mejorSolucion, int distanciaActual) {
        iteraciones++;
        estacionesVisitadas.add(estacionActual);
        if (estacionesVisitadas.size() == grafo.cantidadVertices()) {
            if (mejorSolucion.isEmpty() || (distanciaActual < menorDistancia)) {
                menorDistancia = distanciaActual;
                mejorSolucion.clear();
                mejorSolucion.addAll(solucionActual);
            }
            return;
        }

        for (int i = 0; i < arcos.size(); i++) {
            Arco<Integer> arco = arcos.get(i);
            if (esArcoValido(arco, solucionActual) && (distanciaActual + arco.getEtiqueta() < menorDistancia) && (!estacionesVisitadas.contains(arco.getVerticeDestino()))) {
                arcos.remove(arco);
                arcosVisitados.add(arco);
                solucionActual.add(arco);
                distanciaActual += arco.getEtiqueta();
                backtracking(estacionesVisitadas, arco.getVerticeDestino(), arcosVisitados, solucionActual, mejorSolucion, distanciaActual);
                distanciaActual -= arco.getEtiqueta();
                arcosVisitados.remove(arco);
                arcos.add(arco);
                estacionesVisitadas.remove(estacionesVisitadas.size() - 1);
                solucionActual.remove(solucionActual.size() - 1);
            }
        }
    }

//verificia que el arco no forme un ciclo en el camino actul
    private boolean esArcoValido(Arco<Integer> arco, List<Arco<Integer>> solucionActual) {
        Set<Integer> verticesEnSolucion = new HashSet<>();
        for (Arco<Integer> solucion : solucionActual) {
            verticesEnSolucion.add(solucion.getVerticeOrigen());
            verticesEnSolucion.add(solucion.getVerticeDestino());
        }
        return !verticesEnSolucion.contains(arco.getVerticeOrigen()) || !verticesEnSolucion.contains(arco.getVerticeDestino());
    }
}




