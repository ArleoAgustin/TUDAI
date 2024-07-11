package ej3;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.List;

public class Ej3 {

    private ArrayList conjunto;
    private ArrayList<ArrayList> soluciones;

    public Ej3(ArrayList conjunto) {
        this.conjunto = conjunto;
        this.soluciones = new ArrayList<>();
    }

    public ArrayList<ArrayList> posibles_conjuntos(int m){

        buscarBack( new ArrayList(), 0, m);
        return soluciones;
    }

    private void buscarBack(ArrayList conjuntoParcial, int i, int m) {

        if (i == m && !existe(conjuntoParcial)) {
            soluciones.add(new ArrayList<>(conjuntoParcial));
            return;
        }
        else if (i > m || conjunto.isEmpty())
            return;

        else {
            // Caso 1: incluir el primer valor en la solución parcial
                int n = (int) conjunto.get(0);
                conjunto.remove(0);
                conjuntoParcial.add(n);
                i += n;
                buscarBack(conjuntoParcial, i, m);
                conjuntoParcial.remove(conjuntoParcial.size() - 1);
                i -= n;

                // Caso 2: no incluir el primer valor en la solución parcial
                buscarBack(conjuntoParcial, i, m);
                conjunto.add(0, n);

        }
    }

    private boolean existe(List c){

        for(List<Integer> subConjunto: this.soluciones){
            for (int v: subConjunto){
                if (c.containsAll(subConjunto))
                    return true;
            }
        }
        return false;
    }
}
