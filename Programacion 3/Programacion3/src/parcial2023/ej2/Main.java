package parcial2023.ej2;


import parcial2023.ej3.Ej3;
import tp4.ej11.Ej11;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int fila = 4;
        int columna = 4;
        Celda[][] casa = new Celda[fila][columna];

        ArrayList celdas = new ArrayList();

        Celda d1 = new Celda(0);
        Celda d2 = new Celda(3);
        Celda d3 = new Celda(7);
        Celda d4 = new Celda(9);
        Celda d5 = new Celda(2);
        Celda d6 = new Celda(4);
        Celda d7 = new Celda(1);
        Celda d8 = new Celda(12);
        Celda d9 = new Celda(9);
        Celda d10 = new Celda(8);
        Celda d11 = new Celda(10);
        Celda d12 = new Celda(17);
        Celda d13 = new Celda(13);
        Celda d14 = new Celda(14);
        Celda d15 = new Celda(16);
        Celda d16 = new Celda(100);


        celdas.add(d1);celdas.add(d2);celdas.add(d3);celdas.add(d4);celdas.add(d5);
        celdas.add(d6);celdas.add(d7);celdas.add(d8);celdas.add(d9);celdas.add(d10);
        celdas.add(d11);celdas.add(d12);celdas.add(d13);celdas.add(d14);celdas.add(d15);
        celdas.add(d16);

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                Celda c = (Celda) celdas.get(i * columna + j);
                c.setFila(i);
                c.setColumna(j);
                casa[i][j] = c;
            }
        }
        for (int f = 0; f < fila; f++){
            System.out.print("|");
            for (int c = 0; c < columna; c++){
                System.out.print(" "+casa[f][c]+" | ");
            }
            System.out.println("");
        }

        Ej2 ej2 = new Ej2(casa);

        System.out.println(ej2.Greedy(d1, d16, new ArrayList<>()));
    }
}