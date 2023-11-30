package recuperatorio2023.ej4;

import tp4.Grafo;
import tp4.GrafoDirigido;

public class Main {

    public static void main(String[] args) {

        GrafoDirigido grafo = new GrafoDirigido();

        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
     /*   grafo.agregarVertice(4);
        grafo.agregarVertice(5);*/

        grafo.agregarArco(1,2,11);
        grafo.agregarArco(2,3,11);
        grafo.agregarArco(3,1,11);
        /*
        grafo.agregarArco(4,2,11);
        grafo.agregarArco(5,4,11);
        */

        Ej4 ej4 = new Ej4(grafo);

        System.out.println(ej4.conectado());
    }
}
