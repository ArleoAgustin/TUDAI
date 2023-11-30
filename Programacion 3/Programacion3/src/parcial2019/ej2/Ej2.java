package parcial2019.ej2;

import java.util.ArrayList;
import java.util.List;

public class Ej2 {

    private List<Integer> conjunto;
    private List<List> solucion;

    public Ej2(List conjunto) {
        this.conjunto = conjunto;
        this.solucion = new ArrayList<>();
    }

    public List<List> resolver(){

        resolver(new ArrayList());
        return solucion;
    }

    private void resolver(List solParcial){

       if (solParcial.size() == conjunto.size()){
            System.out.println("entre");
            solucion.add(new ArrayList(solParcial));
            return;
        }
        else{
            for (int i = 0; i < conjunto.size(); i++){
                if (!solParcial.contains(conjunto.get(i))) {
                    solParcial.add(conjunto.get(i));
                    resolver(solParcial);
                    solParcial.remove(solParcial.size() - 1);
                }
            }
        }
    }

}
