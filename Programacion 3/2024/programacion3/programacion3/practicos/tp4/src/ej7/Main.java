package ej7;

import grafos.Arco;
import grafos.GrafoNoDirigido;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        GrafoNoDirigido rutas = new GrafoNoDirigido();

        rutas.agregarVertice(1);
        rutas.agregarVertice(2);
        rutas.agregarVertice(3);
        rutas.agregarVertice(4);
        rutas.agregarVertice(5);
        rutas.agregarVertice(6);

        rutas.agregarArco(1,2, "Bs.As - Madariaga");
        rutas.agregarArco(1,3,"Bs.As - Las Flores");
        rutas.agregarArco(3,4,"Las flores - Rauch");
        rutas.agregarArco(3,5,"Las flores - Azul");
        rutas.agregarArco(4,6,"Rauch - Tandil");
        rutas.agregarArco(2,6,"Madariaga - Tandil");
        rutas.agregarArco(5,6,"Azul - Tandil");


        Iterator<Integer> ciudades  = rutas.obtenerVertices();

        while (ciudades.hasNext()){
            System.out.print(ciudades.next() + " ");
        }

        System.out.println("");

        Iterator<Arco> conexiones = rutas.obtenerArcos();

        while (conexiones.hasNext()){
            Arco aux = conexiones.next();
            System.out.println(aux.getVerticeOrigen() + " - " + aux.getVerticeDestino() + " (" + aux.getEtiqueta() + ")");
        }

        Ejercicio7 ej7 = new Ejercicio7(rutas);
        System.out.println(ej7.buscarCaminos(1, 6, new Arco<>(3,4, "Las flores - Rauch")));

    }
}
