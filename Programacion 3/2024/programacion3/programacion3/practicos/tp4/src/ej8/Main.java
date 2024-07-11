package ej8;

import ej7.Ejercicio7;
import grafos.Arco;
import grafos.GrafoDirigido;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {

        Tarea t0 = new Tarea("Tarea 0" ,"X", 0);
        Tarea t1 = new Tarea("Tarea 1" ,"X", 4);
        Tarea t2 = new Tarea("Tarea 2" ,"X", 18);
        Tarea t3 = new Tarea("Tarea 3" ,"X", 4);
        Tarea t4 = new Tarea("Tarea 4" ,"X", 13);
        Tarea t5 = new Tarea("Tarea 5" ,"X", 22);
        Tarea t6 = new Tarea("Tarea 6" ,"X", 18);
        Tarea t7 = new Tarea("Tarea 7" ,"X", 12);
        Tarea t8 = new Tarea("Tarea 8" ,"X", 3);
        Tarea t9 = new Tarea("Tarea 9" ,"X", 2);
        Tarea t10 = new Tarea("Tarea 10" ,"X", 3);
        Tarea t11 = new Tarea("Tarea 11" ,"X", 1);
        Tarea t12 = new Tarea("Tarea 12" ,"X", 5);

        GrafoDirigido tareas = new GrafoDirigido<>();

        tareas.agregarVertice(0);
        tareas.agregarVertice(1);
        tareas.agregarVertice(2);
        tareas.agregarVertice(3);
        tareas.agregarVertice(4);
        tareas.agregarVertice(5);
        tareas.agregarVertice(6);
        tareas.agregarVertice(7);
        tareas.agregarVertice(8);
        tareas.agregarVertice(9);
        tareas.agregarVertice(10);
        tareas.agregarVertice(11);
        tareas.agregarVertice(12);

        tareas.agregarArco(0,1,0);
        tareas.agregarArco(0,2,0);
        tareas.agregarArco(1,3,3);
        tareas.agregarArco(2,7,18);
        tareas.agregarArco(2,5,1);
        tareas.agregarArco(3,4,5);
        tareas.agregarArco(3,6,8);
        tareas.agregarArco(4,11,3);
        tareas.agregarArco(5,6,2);
        tareas.agregarArco(6,12,2);
        tareas.agregarArco(6,10,6);
        tareas.agregarArco(7,8,7);
        tareas.agregarArco(8,9,4);
        tareas.agregarArco(9,10,1);
        tareas.agregarArco(11,12,9);

        Iterator<Integer> itTareas = tareas.obtenerVertices();

        LinkedHashMap<Integer, Tarea> t = new LinkedHashMap<>();
        LinkedHashMap<Integer, Boolean> tv = new LinkedHashMap<>();

        while (itTareas.hasNext()){

            int aux = itTareas.next();

            switch (aux) {

                case 0:
                    t.put(aux, t0);
                    tv.put(aux, false);
                    break;
                case 1:
                    t.put(aux, t1);
                    tv.put(aux, false);
                    break;
                case 2:
                    t.put(aux, t2);
                    tv.put(aux, false);
                    break;
                case 3:
                    t.put(aux, t3);
                    tv.put(aux, false);
                    break;
                case 4:
                    t.put(aux, t4);
                    tv.put(aux, false);
                    break;
                case 5:
                    t.put(aux, t5);
                    tv.put(aux, false);
                    break;
                case 6:
                    t.put(aux, t6);
                    tv.put(aux, false);
                    break;
                case 7:
                    t.put(aux, t7);
                    tv.put(aux, false);
                    break;
                case 8:
                    t.put(aux, t8);
                    tv.put(aux, false);
                    break;
                case 9:
                    t.put(aux, t9);
                    tv.put(aux, false);
                    break;
                case 10:
                    t.put(aux, t10);
                    tv.put(aux, false);
                    break;
                case 11:
                    t.put(aux, t11);
                    tv.put(aux, false);
                    break;
                case 12:
                    t.put(aux, t12);
                    tv.put(aux, false);
                    break;
            }
            System.out.print(aux + " ");
        }

        System.out.println(" ");
        Iterator<Arco> itArcos = tareas.obtenerArcos();
        while (itArcos.hasNext()){
            Arco aux = itArcos.next();
            System.out.println( aux.getVerticeOrigen() + " -> " + aux.getVerticeDestino() + ": " + aux.getEtiqueta() + "hs");
        }




        Iterator itTa = tareas.obtenerVertices();

        Ejercicio8 ej8 = new Ejercicio8(t,tv,tareas);

        System.out.println(ej8.buscarTareasCriticas());
    }
}
