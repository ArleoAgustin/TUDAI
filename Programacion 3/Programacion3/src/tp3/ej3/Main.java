package tp3.ej3;

import TPE_Programacion3.GrafoDirigido;

public class Main {

    public static void main(String[] args) {

        GrafoDirigido gd = new GrafoDirigido();

        gd.agregarVertice(1);
        gd.agregarVertice(2);
        gd.agregarVertice(3);
        gd.agregarVertice(4);
        gd.agregarVertice(5);
        gd.agregarVertice(6);

        gd.agregarArco(1,3,3);
        gd.agregarArco(1,2,7);
        gd.agregarArco(2,3,1);
        gd.agregarArco(2,4,6);
        gd.agregarArco(3,5,8);
        gd.agregarArco(5,4,2);
        gd.agregarArco(4,3,3);
        gd.agregarArco(4,6,2);
        gd.agregarArco(5,6,8);

        Ciclo ciclo = new Ciclo(gd);

        System.out.println(ciclo.hayCiclo());

    }
}