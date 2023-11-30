package tp1.ej11;

import java.util.Arrays;

public class Ejercicio11 {

    public Ejercicio11() {
    }


    public int buscarElemento(int[] arr, int index){

        return  getElemento(0, arr.length-1 , arr, index);
    }

    public int getElemento(int inicio, int fin, int[] input, int index){

        if (inicio > fin){
            return -1;
        }

        int mid = (inicio + fin) / 2;

        if (index == input[mid]) {
            return mid;
        }
        
        else if (index > input[mid]) {
            return getElemento(mid +1, fin, input, index);
        }
        else
            return getElemento(inicio, mid -1, input, index);
    }
}
