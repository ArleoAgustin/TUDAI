package ej1;

import java.util.ArrayList;

public class Ej1 {

    public Ej1() {}


    public boolean estaOrdenado(ArrayList<Integer> aux) {

        if (aux.size() <= 1) {
            return true;
        }

        if (aux.get(0) <= aux.get(1))
            return estaOrdenado(new ArrayList<>(aux.subList(1, aux.size())));

        return false;
    }
}
