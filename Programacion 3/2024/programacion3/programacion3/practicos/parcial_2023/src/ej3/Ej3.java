package ej3;

import java.util.ArrayList;
import java.util.List;

public class Ej3 {

    private ArrayList conjunto;
    private ArrayList solucion;
    private int cantIteraciones;
    public Ej3(ArrayList conjunto) {
        this.conjunto = conjunto;
        this.solucion = new ArrayList();
        this.cantIteraciones = 0;
    }

    public ArrayList back(int t) {

        this.buscarBack(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(),t, 0);
        return solucion;
    }
/*
    private void buscarBack(ArrayList solParcial, int suma, int t) {

        if (suma == t) {
            if (solucion.size() < 4) {
                solucion.add(new ArrayList<>(solParcial));
            }
        }
        else{
            for (int i = 0; i < conjunto.size(); i++){

                int aux = (int)conjunto.get(i);

                if (!solParcial.contains(aux)) {
                    solParcial.add(aux);
                    suma += aux;
                    buscarBack(solParcial, suma, t);
                    solParcial.remove(solParcial.size() - 1);
                    suma -= aux;
                }
            }
        }
    }
*/

    private void buscarBack(ArrayList l1, ArrayList l2, ArrayList l3, ArrayList l4, int t, int index) {

        cantIteraciones++;

        if (index == conjunto.size()) {

        if (solucion.size() < 4){
            if (sum(l1) == t && sum(l2) == t && sum(l3) == t && sum(l4) == t) {
                    solucion.add(new ArrayList<>(l1));
                    solucion.add(new ArrayList<>(l2));
                    solucion.add(new ArrayList<>(l3));
                    solucion.add(new ArrayList<>(l4));
                }
            }
        }
        else {
            int aux = (int) this.conjunto.get(index);

            l1.add(aux);
            buscarBack(l1, l2, l3, l4, t, index + 1);
            l1.remove(l1.size() - 1);
            l2.add(aux);
            buscarBack(l1, l2, l3, l4, t, index + 1);
            l2.remove(l2.size() - 1);
            l3.add(aux);
            buscarBack(l1, l2, l3, l4, t, index + 1);
            l3.remove(l3.size() - 1);
            l4.add(aux);
            buscarBack(l1, l2, l3, l4, t, index + 1);
            l4.remove(l4.size() - 1);



        }

    }

    public int getCantIteraciones() {
        return cantIteraciones;
    }

    private int sum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    private boolean contieneValor(List<Integer> c) {

        List<List<Integer>> copiaSolucion = new ArrayList<>(solucion);

        for (List<Integer> l : copiaSolucion) {
            for (int v : c) {
                if (l.contains(v))
                    return true;
            }
        }
        return false;
    }

}




