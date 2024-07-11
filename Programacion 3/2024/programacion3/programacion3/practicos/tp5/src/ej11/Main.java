package ej11;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    int fila = 4;
    int columna = 4;
    Celda[][] matriz = new Celda[fila][columna];

    ArrayList celdas = new ArrayList<>();

    Celda c1 = new Celda(false,true,true,false,1,0,0, "Cocina");

    Celda c2 = new Celda(true,true,true,false,0,0,1, "Baño");

    Celda c3 = new Celda(true,true,true,false,0,0,2,"Comedor");

    Celda c4 = new Celda(true,false,true,false,0,0,3, "Living");

    Celda c5 = new Celda(false,true,true,true,0,1,0, "Hole");

    Celda c6 = new Celda(true,true,true,true,0,1,1, "Escalera");

    Celda c7 = new Celda(true,true,true,true,1,1,2, "Garage");

    Celda c8 = new Celda(true,false,true,true,0,1,3, "Baño2");

    Celda c9 = new Celda(false,true,true,true,0,2,0, "Habitacion1");

    Celda c10 = new Celda(true,true,true,true,1,2,1, "Habitacion2");

    Celda c11 = new Celda(true,true,true,true,0,2,2, "Terraza");

    Celda c12 = new Celda(true,false,true,true,0,2,3, "Lavadero");

    Celda c13 = new Celda(false,true,false,true,0,3,0, "Patio");

    Celda c14 = new Celda(true,true,false,true,0,3,1, "Quincho");

    Celda c15 = new Celda(true,true,false,true,0,3,2, "Baño quincho");

    Celda c16 = new Celda(true,false,false,true,0,3,3, "Cocina Quincho");

        celdas.add(c1);celdas.add(c2);celdas.add(c3);celdas.add(c4);celdas.add(c5);
        celdas.add(c6);celdas.add(c7);celdas.add(c8);celdas.add(c9);celdas.add(c10);
        celdas.add(c11);celdas.add(c12);celdas.add(c13);celdas.add(c14);celdas.add(c15);
        celdas.add(c16);

        for (int i = 0; i < fila; i++) {
        for (int j = 0; j < columna; j++) {
            Celda c = (Celda) celdas.get(i * columna + j);
            c.setFila(i);
            c.setColumna(j);
            matriz[i][j] = c;
        }
    }


        for (int f = 0; f < fila; f++){
        System.out.print("|");
        for (int c = 0; c < columna; c++){
            System.out.print(" "+matriz[f][c]+" | ");
        }
        System.out.println("");
    }

        Ej11 ej11 = new Ej11(matriz);

        System.out.println("");
        System.out.println("Solucion:");

        System.out.println(ej11.volver(c5,c8));
    }
}
