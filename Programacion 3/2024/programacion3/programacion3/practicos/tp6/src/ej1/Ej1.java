package ej1;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.Collections;

public class Ej1 {

    private ArrayList<Integer> conjunto;

    public Ej1(ArrayList conjunto) {
        this.conjunto = conjunto;
    }

    public ArrayList getConjunto() {
        return conjunto;
    }

    public ArrayList greedy(int m){

        Collections.sort(conjunto, Collections.reverseOrder());

        ArrayList solucion = new ArrayList();
        int suma = 0;
        while (!conjunto.isEmpty() && suma < m){
            int v = conjunto.get(0);

            if (suma + v <= m) {
                solucion.add(v);
                suma += v;
            }
            else
                conjunto.remove(0);
        }
        return solucion;
    }
}
