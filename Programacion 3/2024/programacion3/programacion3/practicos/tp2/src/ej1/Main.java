package ej1;

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

        System.out.println(ej1.estaOrdenado(aux));
    }
}
