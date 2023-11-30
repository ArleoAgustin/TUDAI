package parcial2019.ej1;

import tp3.GrafoDirigido;
import tp3.GrafoNoDirigido;
import tp3.ej8.Ej8;

;

public class Main {
    public static void main(String[] args) {


        GrafoNoDirigido gd = new GrafoNoDirigido<>();

        gd.agregarVertice(1);
        gd.agregarVertice(2);
        gd.agregarVertice(3);
        gd.agregarVertice(4);
        gd.agregarVertice(5);
        gd.agregarVertice(6);

        gd.agregarArco(1, 3, "Blanco");
        gd.agregarArco(1, 2, "Blanco");
        gd.agregarArco(2, 3, "Rojo");
        gd.agregarArco(2, 4, "Blanco");
        gd.agregarArco(3, 5, "Blanco");
        gd.agregarArco(5, 4, "Rojo");
        gd.agregarArco(4, 3, "Blanco");
        gd.agregarArco(4, 6, "Blanco");
        gd.agregarArco(5, 6, "Blanco");

        Ej1 ej1 = new Ej1(gd);
        System.out.println(ej1.buscar(1,4,6));
    }
}
