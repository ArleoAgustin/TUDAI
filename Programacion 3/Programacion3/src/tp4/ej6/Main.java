package tp4.ej6;


import tp4.ej2.Ej2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int fila = 4;
        int columna = 4;
        Celda[][] laberinto = new Celda[fila][columna];

        ArrayList celdas = new ArrayList();

        Celda d1 = new Celda(true, true,12);
        Celda d2 = new Celda(true,false, 77);
        Celda d3 = new Celda(true,true, 98);
        Celda d4 = new Celda(false,false, 23);
        Celda d5 = new Celda(true, false, 44);
        Celda d6 = new Celda(true,true, 25);
        Celda d7 = new Celda(true,false, 79);
        Celda d8 = new Celda(false,false, 47);
        Celda d9 = new Celda(false,false, 27);
        Celda d10 = new Celda(true,false, 34);
        Celda d11 = new Celda(true,false, 92);
        Celda d12 = new Celda(false, false,10);
        Celda d13 = new Celda(false,false, 7);
        Celda d14 = new Celda(false, false,40);
        Celda d15 = new Celda(false, false,62);
        Celda d16 = new Celda(false, false,70);


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

        Ej6 ej6 = new Ej6(laberinto);
        System.out.println(ej6.buscarCamino(d2));
    }
}