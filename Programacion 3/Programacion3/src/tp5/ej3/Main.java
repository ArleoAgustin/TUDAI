package tp5.ej3;

import tp5.ej1.Ej1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList actividades = new ArrayList();

        actividades.add(new Actividad("A1",10, 12));
        actividades.add(new Actividad("A2",11, 12));
        actividades.add(new Actividad("A3",10, 14));
        actividades.add(new Actividad("A4",13, 16));
        actividades.add(new Actividad("A5",15, 17));
        actividades.add(new Actividad("A6",11, 12));

        Ej3 ej3 = new Ej3(actividades);

        System.out.println(ej3.buscaractCompatibles());
    }

}
