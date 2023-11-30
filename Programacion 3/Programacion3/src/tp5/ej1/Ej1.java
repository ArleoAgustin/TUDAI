package tp5.ej1;

import java.util.ArrayList;
import java.util.List;

public class Ej1 {

    private List<Integer> conjunto;

    public Ej1(List conjunto) {
        this.conjunto = conjunto;
    }

    public List Greedy(List solParcial, int suma, int v){

        while(suma <= v && !conjunto.isEmpty()){
            int valor = obtenerMayor();
            if (valor <= v && suma + valor <= v){
                solParcial.add(valor);
                suma+= valor;
            }
            else
                conjunto.removeIf(num -> num == valor);
        }
        if (suma == v)
            return solParcial;
        else return new ArrayList();
    }

    private int obtenerMayor(){
        int mayor = -10;

        for (int v: conjunto){
            if (v > mayor)
                mayor = v;
        }
        return mayor;
    }
}
