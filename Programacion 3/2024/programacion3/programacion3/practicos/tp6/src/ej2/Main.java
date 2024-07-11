package ej2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Actividad a1 = new Actividad("A1",7,10);
        Actividad a2 = new Actividad("A2",8,12);
        Actividad a3 = new Actividad("A3",14,17);
        Actividad a4 = new Actividad("A4",9,15);
        Actividad a5 = new Actividad("A5",11,13);
        Actividad a6 = new Actividad("A6",16,19);

        ArrayList<Actividad> actividades = new ArrayList<Actividad>();

        actividades.add(a1);
        actividades.add(a2);
        actividades.add(a3);
        actividades.add(a4);
        actividades.add(a5);
        actividades.add(a6);

        Ej3 ej3 = new Ej3(actividades);

        System.out.println(ej3.actividadesCompatibles());

    }
}
