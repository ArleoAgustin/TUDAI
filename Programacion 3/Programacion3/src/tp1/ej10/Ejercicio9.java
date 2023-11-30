package tp1.ej10;

import java.util.Arrays;

public class Ejercicio9 {

    public Ejercicio9(){}

    public boolean estaOrdenado(int[] input){


        if (input.length <= 1)
            return true;

        return ((input[0] <= input[1]) && estaOrdenado(Arrays.copyOfRange(input,1, input.length-1)));
    }

}
