package tp4.ej4;

import java.util.ArrayList;
import java.util.List;

public class Ej4 {

    private List<List> solucion;
    private List<Integer> conjunto;
    private int sumaSolucion;

    public Ej4(List conjunto) {
        this.conjunto = conjunto;
        this.sumaSolucion = 0;
        this.solucion = new ArrayList<>();
    }

    public List<List> buscarCombinaciones(){

        List solParcial = new ArrayList();
        buscar(solParcial ,0);


        return solucion;
    }

    private void buscar(List solParcial, int suma){

        System.out.println("conjunto "+conjunto);
        System.out.println("sol parcial "+solParcial);
        System.out.println("solucion "+solucion);
        System.out.println(" ");
        if (conjunto.isEmpty() && solucion.size() < 2) {
            System.out.println("conjunto vacio");
            solucion.clear();
            return;
        }

        if (!solParcial.isEmpty() && suma == sumaSolucion){
            System.out.println("Entro");
                solucion.add(new ArrayList(solParcial));

                return;
            }

            if (solucion.isEmpty() && !solParcial.isEmpty()){

                solucion.add(new ArrayList(solParcial));
                sumaSolucion = suma;
                return;
            }



        else {

                    int primerValor = conjunto.get(0);
                    conjunto.remove(0);
                    solParcial.add(primerValor);
                    suma+= primerValor;
                    buscar(solParcial, suma);
                    //solParcial.remove(solParcial.size()-1);
                    suma-= primerValor;

                    buscar(solParcial, suma);
                    conjunto.add(0,primerValor);

            /*
                        int primerValor = conjunto.get(0);
            conjunto.remove(0);
            solParcial.add(primerValor);
            suma += primerValor;
            buscar(solParcial, suma, m);
            solParcial.remove(solParcial.size() - 1);
            suma -= primerValor;

            buscar(solParcial, suma, m);
            conjunto.add(0, primerValor);

                int primerValor = conjunto.get(0);
                conjunto.remove(0);
                solParcial.add(primerValor);
                suma += primerValor;
                buscar(solParcial, suma);
                solParcial.remove(solParcial.size() - 1);
                suma -= primerValor;

                buscar(solParcial, suma);
                conjunto.add(0, primerValor);

*/
        }


    }

    private boolean existe(List c){

        if (!solucion.isEmpty()) {
            for (List<Integer> subConjunto : this.solucion) {
                for (int v : subConjunto) {
                    if (c.containsAll(subConjunto))
                        return true;
                }
            }
        }
        return false;
    }
}
