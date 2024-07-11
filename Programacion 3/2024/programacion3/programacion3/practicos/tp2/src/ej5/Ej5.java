package ej5;

import java.util.ArrayList;

public class Ej5 {

    public Ej5() {
    }

/*
    Dado un arreglo ordenado de números distintos A (nombre del arreglo) se desea construir un algoritmo que
    determine si alguno de los elementos de dicho arreglo contiene un valor igual a la posición en la
    cuál se encuentra, es decir, A[i] = i.

    1. Construir un algoritmo recursivo que responda a dicha verificación.

    2. Mostrar la pila de ejecución para la invocación algoritmo([-3, -1, 0, 2, 4, 6, 10])

 */
    public boolean contieneValorIgual(ArrayList A){

        return buscar(A, 0);

    }

    private boolean buscar(ArrayList A, int pos){

        if (pos < A.size()){
            System.out.print(A.get(pos)+" ");
            if (A.get(pos).equals(pos))
                return true;
            else
                return  buscar(A, pos + 1);
        }
        return false;
    }
}
