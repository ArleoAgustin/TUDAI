package tp5.ej3;

import java.util.ArrayList;
import java.util.List;

public class Ej3 {

    private List<Actividad> actividades;
    private List actividadesComp;

    public Ej3(List actividades) {
        this.actividades = actividades;
        this.actividadesComp = new ArrayList<>();
    }

    public List buscaractCompatibles(){

        List aCompatibles = new ArrayList();

        buscar(aCompatibles);
        return actividadesComp;
    }

    private void buscar(List aCompatibles){

        for (int i = 0; i < actividades.size(); i++){
            Actividad a1 = actividades.get(i);
            if (i+1 < actividades.size())
            for (int j = 0; j < actividades.size(); j++){
                Actividad a2 = actividades.get(j);
                if (a1.getInicio() > a2.getFin() || a2.getInicio() > a1.getFin()){
                    if (!aCompatibles.contains(a1))
                        aCompatibles.add(a1);
                    if (!aCompatibles.contains(a2))
                        aCompatibles.add(a2);
                }
            }

        }
        actividadesComp = new ArrayList(aCompatibles);
    }
}
