package tp4.ej2;

import tp4.GrafoDirigido;
import tp4.ej1.Ej1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int fila = 4;
        int columna = 4;
        Celda [][] laberinto = new Celda[fila][columna];

        ArrayList celdas = new ArrayList();

        Celda d1 = new Celda(7,false,true,false,true);
        Celda d2 = new Celda(12,false,true,false,true);
        Celda d3 = new Celda(18,false,false,false,true);
        Celda d4 = new Celda(12,false,true,false,false);
        Celda d5 = new Celda(87,false,true,false,false);
        Celda d6 = new Celda(23,false,true,false,false);
        Celda d7 = new Celda(44,false,true,false,false);
        Celda d8 = new Celda(4,false,false,true,false);
        Celda d9 = new Celda(98,false,true,false,false);
        Celda d10 = new Celda(78,false,false,true,false);
        Celda d11 = new Celda(2,false,true,false,true);
        Celda d12 = new Celda(55,false,true,false,false);
        Celda d13 = new Celda(87,false,false,false,true);
        Celda d14 = new Celda(80,false,false,false,true);
        Celda d15 = new Celda(66,false,false,false,true);
        Celda d16 = new Celda(32,false,false,false,true);


        celdas.add(d1);celdas.add(d2);celdas.add(d3);celdas.add(d4);celdas.add(d5);
        celdas.add(d6);celdas.add(d7);celdas.add(d8);celdas.add(d9);celdas.add(d10);
        celdas.add(d11);celdas.add(d12);celdas.add(d13);celdas.add(d14);celdas.add(d15);
        celdas.add(d16);

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                Celda c = (Celda) celdas.get(i * columna + j);
                c.setFila(i);
                c.setColumna(j);
                laberinto[i][j] = c;
            }
        }
        for (int f = 0; f < fila; f++){
            System.out.print("|");
            for (int c = 0; c < columna; c++){
                System.out.print(" "+laberinto[f][c]+" | ");
            }
            System.out.println("");
        }


        Ej2 ej2 = new Ej2(laberinto);

        System.out.println(ej2.mejorCamino(d1,d16));
    }
}