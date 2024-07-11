package ej2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Ej3 {

    private ArrayList actividades;

    public Ej3(ArrayList actividades) {
        this.actividades = actividades;
    }

    public ArrayList actividadesCompatibles(){

        ArrayList actividadesCompatibles = new ArrayList();

        Collections.sort(actividades, Comparator.comparingInt(Actividad::getTc));

        while (!actividades.isEmpty()){

            Actividad actividad = (Actividad) actividades.get(0);
            if (actividadesCompatibles.isEmpty()){
                actividadesCompatibles.add(actividad);
                actividades.remove(actividad);
            }

            else {
                Actividad temp = (Actividad) actividadesCompatibles.get(actividadesCompatibles.size()-1);

                if (actividad.getTc() > temp.getTf() || temp.getTc() > actividad.getTf()){
                    actividadesCompatibles.add(actividad);

                }
            }
            actividades.remove(actividad);
        }

        return actividadesCompatibles;
    }



    public ArrayList getActividades() {
        return actividades;
    }
}
