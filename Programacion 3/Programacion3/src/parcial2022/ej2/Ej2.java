package parcial2022.ej2;

import java.util.ArrayList;
import java.util.List;

public class Ej2 {

    private LinkedList estaciones;

    public Ej2(LinkedList l) {
        this.estaciones = l;
    }

    public List greedy(TreeNode eInicio, TreeNode eFin, float k, TreeNode eActual){
        float kmsActual = 0;
        boolean cargo = true;
        List sol = new ArrayList();
        sol.add(eInicio.getInfo());
        eActual = eInicio.getNext();
        while (eActual != null){
            System.out.println(eActual.getKms());
            if (eActual.getKms() <= k && eActual.getNext() != null && eActual.getNext().getKms() <= k) {
                eActual = eActual.getNext();
            }
            else {
                k = k *2;
                System.out.println("Cargo" + eActual);
                sol.add(eActual);
                eActual = eActual.getNext();
            }
        }
        return sol;
    }

    private float distancia(TreeNode actual, TreeNode sig){

        if (actual.getKms() - sig.getKms() < 0) {

            return -1 * (actual.getKms() - sig.getKms());
        }

        return  actual.getKms() - sig.getKms();

    }
}
