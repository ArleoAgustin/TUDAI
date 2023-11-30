package tp4.ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Ej3 {

    private List<Integer> conjunto;
    private List<List> res;
    private int iteraciones;

    public Ej3(List conjunto) {
        this.conjunto = conjunto;
        res = new ArrayList<>();
        iteraciones =0;
    }

    public int getIteraciones() {
        return iteraciones;
    }

    public List<List>buscarCombinaciones(int m){

        List solParcial = new ArrayList();

        buscar(solParcial, 0, m);

        return res;
    }

    private void buscar(List<Integer> solParcial, int suma, int m) {


        iteraciones++;
        if (suma == m && !existe(solParcial)) {
            res.add(new ArrayList<>(solParcial));
            return;
        } else if (suma > m || conjunto.isEmpty()) {
            return;
        } else {
/*
            for (int i = 0; i < conjunto.size(); i++){
                if (!solParcial.contains(conjunto.get(i))) {
                    solParcial.add(conjunto.get(i));
                    suma+= conjunto.get(i);
                    buscar(solParcial,suma,m);
                    solParcial.remove(solParcial.size() - 1);
                    suma -= conjunto.get(i);
                }
            }*/

            int primerValor = conjunto.get(0);
            conjunto.remove(0);
            solParcial.add(primerValor);
            suma += primerValor;
            buscar(solParcial, suma, m);
            solParcial.remove(solParcial.size() - 1);
            suma -= primerValor;

            buscar(solParcial, suma, m);
            conjunto.add(0, primerValor);

        }
    }

    private boolean existe(List c){

        for(List<Integer> subConjunto: this.res){
            for (int v: subConjunto){
                if (c.containsAll(subConjunto))
                    return true;
            }
        }
        return false;
    }

            /*

            int primerValor = conjunto.get(0);
            conjunto.remove(0);

            // Caso 1: incluir el primer valor en la solución parcial
            solParcial.add(primerValor);
            suma += primerValor;
            buscar(solParcial, suma, m);
            solParcial.remove(solParcial.size() - 1);
            suma -= primerValor;

            System.out.println("segundo");
            // Caso 2: no incluir el primer valor en la solución parcial
            buscar(solParcial, suma, m);

            conjunto.add(0, primerValor);*/
}
