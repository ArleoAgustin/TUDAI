package tp3;

import TPE_Programacion3.Arco;
import TPE_Programacion3.GrafoDirigido;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        GrafoDirigido gDirigido = new GrafoDirigido();  //instancia el grafo dirigido

//carga los vertices
        gDirigido.agregarVertice(1);
        gDirigido.agregarVertice(2);
        gDirigido.agregarVertice(7);
        gDirigido.agregarVertice(6);
        gDirigido.agregarVertice(3);
        gDirigido.agregarVertice(5);
        gDirigido.agregarVertice(8);
        gDirigido.agregarVertice(4);

//carga los arcos
        gDirigido.agregarArco(1, 2, 1);
        gDirigido.agregarArco(1, 3, 1);
        gDirigido.agregarArco(2, 4, 1);
        gDirigido.agregarArco(3, 4, 1);
        gDirigido.agregarArco(3, 5, 1);
        gDirigido.agregarArco(4, 6, 1);
        gDirigido.agregarArco(5, 7, 1);
        gDirigido.agregarArco(6, 7, 1);
        gDirigido.agregarArco(6, 8, 1);



        System.out.println(" ");
        System.out.println("cantidad de vertices " + gDirigido.cantidadVertices());  //cantidad de vertices
        System.out.println("cantidad de arcos: " + gDirigido.cantidadArcos());       //cantidad de arcos

        System.out.println(" ");
        //    gDirigido.borrarVertice(52);                          //elimina un vertice
        //    System.out.println(gDirigido.contieneVertice(1));     //verifica si contien el vertice
        //    System.out.println(gDirigido.existeArco(4,3));        //verifica si existe el arco
        //    System.out.println(gDirigido.obtenerArco(1,4));       //obtiene el arco

        System.out.println(" ");

////////////////////////////////////////////////////////iteradores/////////////////////////////////////////////////////

        Iterator<Integer> vertices = gDirigido.obtenerVertices();   //iterador de vertices

        if (vertices != null) {
            System.out.println("vertices: ");
            while (vertices.hasNext()) {
                System.out.print(vertices.next() + " ");
            }
        }

        Iterator<TPE_Programacion3.Arco> arcos = gDirigido.obtenerArcos();    //iterador de arcos

        System.out.println(" ");
        System.out.println(" ");
        if (arcos != null) {
            System.out.println("Arcos:");
            while (arcos.hasNext()) {
                TPE_Programacion3.Arco arco = arcos.next();
                System.out.println(arco.getVerticeOrigen() + " --> " + arco.getVerticeDestino());
            }
        }

//muestra todos los arcos de un determinado vertice
/*
        Iterator<Arco> arcosPorVertice = gDirigido.obtenerArcos(4); //iterador de arcos de un determinado vertice

        System.out.println(" ");
        if (arcosPorVertice != null) {
            System.out.println("Arcos por vertice:");
            while (arcosPorVertice.hasNext()) {
                Arco arco = arcosPorVertice.next();
                System.out.println(arco.getVerticeOrigen() + " --> " + arco.getVerticeDestino());
            }
        }*/



        /////////////////////////////////////////GRAFO NO DIRIGIDO/////////////////////////////////////////////////////////////////

        System.out.println("");
        System.out.println("");
        System.out.println("Grafo no dirigido");

        GrafoNoDirigido gNoDirigido = new GrafoNoDirigido();   //instancia el grafo no dirigido

        gNoDirigido.agregarVertice(1);
        gNoDirigido.agregarVertice(2);
        gNoDirigido.agregarVertice(3);
        gNoDirigido.agregarVertice(4);

        gNoDirigido.agregarArco(1,2, 10);
        gNoDirigido.agregarArco(1,4,15);
        gNoDirigido.agregarArco(1,3,12);
        gNoDirigido.agregarArco(4,3,55);
        gNoDirigido.agregarArco(2,4,22);
        gNoDirigido.agregarArco(4,1,445);

        Iterator<TPE_Programacion3.Arco> arcosGnd = gNoDirigido.obtenerArcos();    //iterador de arcos



        System.out.println(" ");
        if (arcosGnd != null) {
            System.out.println("Arcos:");
            while (arcosGnd.hasNext()) {
                TPE_Programacion3.Arco arco = arcosGnd.next();
                System.out.println(arco.getVerticeOrigen() + " --> " + arco.getVerticeDestino());
            }
        }

        System.out.println("cantidad de arcos: "+gNoDirigido.cantidadArcos());
        System.out.println("cantidad de vertices: "+gNoDirigido.cantidadVertices());

        gNoDirigido.borrarVertice(4);

        Iterator<TPE_Programacion3.Arco> arcosGnd2 = gNoDirigido.obtenerArcos();    //iterador de arcos

        System.out.println(" ");
        System.out.println(" ");
        if (arcosGnd2 != null) {
            System.out.println("Arcos:");
            while (arcosGnd2.hasNext()) {
                TPE_Programacion3.Arco arco = arcosGnd2.next();
                System.out.println(arco.getVerticeOrigen() + " --> " + arco.getVerticeDestino());
            }
        }
        System.out.println("cantidad de arcos: "+gNoDirigido.cantidadArcos());
        System.out.println("cantidad de vertices: "+gNoDirigido.cantidadVertices());


        Iterator<TPE_Programacion3.Arco> arcosPorVerticeGnd = gNoDirigido.obtenerArcos(4); //iterador de arcos de un determinado vertice

        System.out.println(" ");
        if (arcosPorVerticeGnd != null) {
            System.out.println("Arcos por vertice:");
            while (arcosPorVerticeGnd.hasNext()) {
                Arco arco = arcosPorVerticeGnd.next();
                System.out.println(arco.getVerticeOrigen() + " --> " + arco.getVerticeDestino());
            }
        }
    }
}