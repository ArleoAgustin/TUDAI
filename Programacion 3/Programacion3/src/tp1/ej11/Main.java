package tp1.ej11;

import tp1.ej10.Ejercicio9;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    Ejercicio11 ej = new Ejercicio11();

        //  int[] aux = new int[] {1,5,2,7,3,1,0};
           int[] aux = new int[] {1,6,8,15,18,55,177};
        //int[] aux = new int[]{9,8};
        System.out.println(Arrays.toString(aux));
        System.out.println(ej.buscarElemento(aux,15));
    }
}