package ej2AND3;

import ej1.Ej1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Ej1 ej1 = new Ej1();

        ArrayList<Integer> aux = new ArrayList<Integer>();

        aux.add(1);
        aux.add(5);
        aux.add(8);
        aux.add(10);
        aux.add(23);

        Ej2 ej2 = new Ej2();

        if (ej2.estaOrdenado(aux)){
            System.out.println( ej2.estaElemento(aux, 7));
        }
    }
}
