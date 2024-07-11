package ej4;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.List;

public class Ej4 {

    private ArrayList conjunto;
    private ArrayList<List<Integer>> solucion;
    private int sumaSolucion;
    private boolean encontrado;

    public Ej4(ArrayList conjunto) {
        this.conjunto = conjunto;
        this.solucion = new ArrayList();
        this.sumaSolucion = 0;
        this.encontrado = false;
    }

    public ArrayList<List<Integer>> buscarSolucion() {

        this.backtrack(new ArrayList(), new ArrayList<>(), 0);
        return solucion;
    }

    private void backtrack(List<Integer> lista1, List<Integer> lista2, int index) {
        if (index == conjunto.size()) {

            if (sum(lista1) == sum(lista2)) {
                solucion.add(new ArrayList<>(lista1));
                solucion.add(new ArrayList<>(lista2));
                encontrado = true;
            }
            return;
        }

        else if (encontrado) return;

        else {

            // Probar incluyendo el elemento actual en lista1
            int valor = (int) conjunto.get(index);
            lista1.add(valor);

            backtrack(lista1, lista2, index + 1);
            lista1.remove(lista1.size() - 1);

            // Probar incluyendo el elemento actual en lista2
            lista2.add(valor);
            backtrack(lista1, lista2, index + 1);
            lista2.remove(lista2.size() - 1);

        }
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

    private boolean calcularSumaSolucion(List lista1, List lista2) {

        int suma1 = 0, suma2 = 0;

        for (Object i : lista1) {

            suma1 += (int) i;
        }

        for (Object o : lista2) {

            suma2 += (int) o;
        }

        return (suma1 == suma2);

        }

}
