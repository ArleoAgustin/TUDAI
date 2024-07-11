package ej6;

import java.util.ArrayList;

public class Ej6 {

    public Ej6() {
    }

    /*

    Implemente un algoritmo de ordenamiento por selección en un arreglo.

    Implemente un algoritmo de ordenamiento por burbujeo en un arreglo.

     */

    public ArrayList porSeleccion(ArrayList<Integer> list){

        for (int i=0; i < list.size()-1;i++){

            int indiceMenor = i;

            for (int n = i+1; n < list.size(); n++) {

                if (list.get(n) < list.get(indiceMenor)){
                    indiceMenor = n;
                }
            }
            int aux = list.get(i);
            list.set(i, list.get(indiceMenor));
            list.set(indiceMenor, aux);


        }
        return list;
    }


    public int[] bubbleAdaptative(int[] arr){

        int[] res;

        boolean swapped = true;
        int j = 0;
        int aux;

        while(swapped){
            swapped = false;
            j++;
            for (int i=0; i < arr.length - j; i++){
                if (arr[i] > arr[i+1]){
                    aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                    swapped = true;
                }
            }
        }
        res = arr;
        return res;
    }

}
