package tp3.ej8;

import tp3.ej4.GrafoDirigido;
import tp3.ej7.Ej7;

public class Main {

    public static void main(String[] args) {

        GrafoDirigido gd = new GrafoDirigido();

        gd.agregarVertice(1);
        gd.agregarVertice(2);
        gd.agregarVertice(3);
        gd.agregarVertice(4);
        gd.agregarVertice(5);
        gd.agregarVertice(6);

        gd.agregarArco(1,3,"Blanco");
        gd.agregarArco(1,2,"Blanco");
        gd.agregarArco(2,3,"Rojo");
        gd.agregarArco(2,4,"Blanco");
        gd.agregarArco(3,5,"Blanco");
        gd.agregarArco(5,4,"Rojo");
        gd.agregarArco(4,3,"Blanco");
        gd.agregarArco(4,6,"Blanco");
        gd.agregarArco(5,6,"Blanco");

        Ej8 ej = new Ej8(gd);
        System.out.println(ej.resolver(1,6));
    }
}