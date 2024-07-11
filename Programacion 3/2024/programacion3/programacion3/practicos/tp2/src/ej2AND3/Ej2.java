package ej2AND3;

import java.util.ArrayList;

public class Ej2 {

    public Ej2() {
    }

    public boolean estaOrdenado(ArrayList<Integer> aux) {

        if (aux.size() <= 1) {
            return true;
        }

        if (aux.get(0) <= aux.get(1))
            return estaOrdenado(new ArrayList<>(aux.subList(1, aux.size())));

        return false;
    }

    public boolean estaElemento(ArrayList aux, int valor) {

        if (aux.size() <= 1) {
            return  aux.get(0).equals(valor);
        }
        if (!aux.get(0).equals(valor))
            return estaElemento(new ArrayList<>(aux.subList(1, aux.size())), valor);

        return true;
    }
}
