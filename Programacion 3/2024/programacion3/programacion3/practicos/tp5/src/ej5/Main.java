package ej5;

import ej4.Ej4;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Procesador p1 = new Procesador("1");
        Procesador p2 = new Procesador("2");
        Procesador p3 = new Procesador("3");


        Tarea t1 = new Tarea(4,"1");
        Tarea t2 = new Tarea(5,"2");
        Tarea t3 = new Tarea(17,"3");
        Tarea t4 = new Tarea(7,"4");
        Tarea t5 = new Tarea(10,"5");
        Tarea t6 = new Tarea(55,"6");
        Tarea t7 = new Tarea(10,"7");
        Tarea t8 = new Tarea(11,"8");
        Tarea t9 = new Tarea(20,"9");
        Tarea t10 = new Tarea(13,"10");
        Tarea t11 = new Tarea(2,"11");
        Tarea t12 = new Tarea(15,"12");

        ArrayList tareas = new ArrayList();
        tareas.add(t1);
        tareas.add(t2);
        tareas.add(t3);
        tareas.add(t4);
        tareas.add(t5);
        tareas.add(t6);
        tareas.add(t7);
        tareas.add(t8);
        tareas.add(t9);
        tareas.add(t10);
        tareas.add(t11);
        tareas.add(t12);


        HashMap<Procesador, ArrayList<Tarea>> procesadores = new HashMap<>();

        procesadores.put(p1,new ArrayList<>());
        procesadores.put(p2,new ArrayList<>());
        procesadores.put(p3,new ArrayList<>());

        Ej5 ej5 = new Ej5(procesadores,tareas);

        ej5.asignarTareas();
    }
}
