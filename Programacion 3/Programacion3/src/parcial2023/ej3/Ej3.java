package parcial2023.ej3;

import java.util.ArrayList;
import java.util.List;

public class Ej3 {

    private List<Integer> conjunto;
    private List<List> solucion;

    public Ej3(List conjunto) {
        this.conjunto = conjunto;
        this.solucion = new ArrayList<>();
    }

    public List<List> resolver(int t){

        List solParcial = new ArrayList();
        back(0, solParcial, t);
        return solucion;
    }

    private void back(int suma, List solParcial, int t) {

        if (conjunto.isEmpty())
            return;

        if (solucion.size() <= 4 && suma == t) {
            //   if (!this.contieneValor(solParcial)){
            System.out.println("Agregue" + solParcial);
            solucion.add(new ArrayList<>(solParcial));
            return;
        }
        else {
/*
            for (int i = 0; i < conjunto.size(); i++){
                if (!solParcial.contains(conjunto.get(i))) {
                    solParcial.add(conjunto.get(i));
                    suma+= conjunto.get(i);
                    back(suma, solParcial, t);
                    solParcial.remove(solParcial.size() - 1);
                    suma -= conjunto.get(i);
                }
            }
            */


                int v = conjunto.get(0);
                conjunto.remove(0);
                solParcial.add(v);
                suma = suma + v;
                back(suma, solParcial, t);
                solParcial.remove(solParcial.size()-1);
                suma = suma - v;
                back(suma, solParcial, t);
                conjunto.add(0,v);

        }
    }

    private boolean contieneValor(List<Integer> c){

        for(List l: this.solucion){
            for (int v : c){
                if (l.contains(v))
                    return true;
            }

        }
        return false;
    }
}
