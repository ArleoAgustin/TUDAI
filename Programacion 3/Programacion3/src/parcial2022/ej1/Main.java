package parcial2022.ej1;

import TPE_Programacion3.servicios.ServicioBFS;
import TPE_Programacion3.servicios.ServicioCaminos;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        GrafoDirigido<Integer> gDirigido = new GrafoDirigido<>();  //instancia el grafo dirigido

//carga los vertices
        gDirigido.agregarVertice(1);
        gDirigido.agregarVertice(2);
        gDirigido.agregarVertice(3);
        gDirigido.agregarVertice(4);
        gDirigido.agregarVertice(5);
        gDirigido.agregarVertice(6);

//carga los arcos
        gDirigido.agregarArco(1, 2, 7);
        gDirigido.agregarArco(2, 3, 1);
        gDirigido.agregarArco(1, 3, 3);
        gDirigido.agregarArco(2, 4, 6);
        gDirigido.agregarArco(3, 5, 8);
        gDirigido.agregarArco(5, 4, 2);
        gDirigido.agregarArco(4, 3, 3);
        gDirigido.agregarArco(4, 6, 2);
        gDirigido.agregarArco(5, 6, 8);


        Ej1 ej1 = new Ej1(gDirigido);
        ej1.dfsForest(13);
    }
}