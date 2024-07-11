package ej10;

import java.util.ArrayList;
import java.util.List;

public class Ej10 {

    private List<List> solucion;
    private ArrayList<Integer> conjunto, visitados;


    public Ej10(ArrayList conjunto) {
        solucion = new ArrayList();
        this.conjunto =conjunto;

        this.visitados = new ArrayList();
    }

    public List buscarConjuntos(int n){

        this.buscarConjuntoBack(new ArrayList<>(), 0, n);

        return solucion;
    }

    private void buscarConjuntoBack(ArrayList solucionParcial, int suma, int n) {

        if (conjunto.isEmpty()) {

            if (solucionParcial.size() == n && calcularSuma(solucionParcial) == 0) {
                solucion.add(new ArrayList<>(solucionParcial));
            }
        }
        else{

            // Caso 1: incluir el primer valor en la solución parcial
            int aux =conjunto.get(0);
            conjunto.remove(0);
            solucionParcial.add(aux);
            buscarConjuntoBack(solucionParcial, suma+aux, n);
            solucionParcial.remove(solucionParcial.size() - 1);


            // Caso 2: no incluir el primer valor en la solución parcial
            buscarConjuntoBack(solucionParcial, suma+aux, n);
            conjunto.add(0, aux);
        }
    }

    private int calcularSuma(ArrayList<Integer> solucionParcial) {

        int suma = 0;
        for (Integer i : solucionParcial){

            suma += i;

        }
        return suma;
    }

    private boolean contieneValor(List<Integer> c){

        for(List l: this.solucion){
            for (int v : c){
                if (l.contains(v))
                    return true;
            }

        }
        return false;
    }

}

