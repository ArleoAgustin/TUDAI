package ej6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int fila = 4;
        int columna = 4;
        Celda[][] matriz = new Celda[fila][columna];

        ArrayList celdas = new ArrayList();

        Celda c1 = new ej6.Celda(true, false,0);
        Celda c2 = new ej6.Celda(true, true,3);
        Celda c3 = new ej6.Celda(true, false,7);
        Celda c4 = new ej6.Celda(false, false,9);
        Celda c5 = new ej6.Celda(true, false,2);
        Celda c6 = new ej6.Celda(true, false,4);
        Celda c7 = new ej6.Celda(true, false,1);
        Celda c8 = new ej6.Celda(false, false,12);
        Celda c9 = new ej6.Celda(false, false,9);
        Celda c10 = new ej6.Celda(true, false,8);
        Celda c11 = new ej6.Celda(true, false,10);
        Celda c12 = new ej6.Celda(false, false,17);
        Celda c13 = new ej6.Celda(false, false,13);
        Celda c14 = new ej6.Celda(false, false,14);
        Celda c15 = new ej6.Celda(false, false,16);
        Celda c16 = new ej6.Celda(false, false,100);

        ArrayList pisadas = new ArrayList();

        pisadas.add(c1);
        pisadas.add(c2);
        pisadas.add(c3);
        pisadas.add(c5);
        pisadas.add(c6);
        pisadas.add(c7);
        pisadas.add(c10);
        pisadas.add(c11);


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

        Ej6 ej6 = new Ej6(matriz,pisadas);

        System.out.println(ej6.caminoRecorrido(c2));

    }
}
