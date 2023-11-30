package tp4.ej10;

import java.util.ArrayList;
import java.util.List;

public class Ej10 {

    private List<Integer> conjunto;
    private List solucion;

    public Ej10(List conjunto) {
        this.conjunto = conjunto;
        this.solucion = new ArrayList();
    }

    public List<List> resolver(int n){

        List subC = new ArrayList();
        resolver(n,subC, 0);

        return solucion;
    }

    private void resolver(int n, List subC, int suma){

        if (suma == 0 && subC.size() == n){
            this.solucion.add(new ArrayList(subC));
            return;
        }
        if (conjunto.isEmpty())
            return;

        else{
            int valor = conjunto.get(0);
            conjunto.remove(0);
            subC.add(valor);
            suma += valor;
            resolver(n,subC,suma);
            subC.remove(subC.size()-1);
            suma-= valor;
            resolver(n,subC,suma);
            conjunto.add(0,valor);
        }
    }

}
