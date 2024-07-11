package ej9;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int fila = 4;
        int columna = 4;
        Celda[][] matriz = new Celda[fila][columna];

        ArrayList celdas = new ArrayList<>();

        Celda c1 = new Celda(false,true,true,false,10,0,0);

        Celda c2 = new Celda(true,true,true,false,14,0,1);

        Celda c3 = new Celda(true,true,true,false,7,0,2);

        Celda c4 = new Celda(true,false,true,false,9,0,3);

        Celda c5 = new Celda(false,true,true,true,2,1,0);

        Celda c6 = new Celda(true,true,true,true,0,1,1);

        Celda c7 = new Celda(true,true,true,true,1,1,2);

        Celda c8 = new Celda(true,false,true,true,12,1,3);

        Celda c9 = new Celda(false,true,true,true,3,2,0);

        Celda c10 = new Celda(true,true,true,true,13,2,1);

        Celda c11 = new Celda(true,true,true,true,10,2,2);

        Celda c12 = new Celda(true,false,true,true,11,2,3);

        Celda c13 = new Celda(false,true,false,true,6,3,0);

        Celda c14 = new Celda(true,true,false,true,4,3,1);

        Celda c15 = new Celda(true,true,false,true,5,3,2);

        Celda c16 = new Celda(true,false,false,true,8,3,3);


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

        Ej9 ej9 = new Ej9(matriz);

        Celda[][] res = ej9.ordenarMatriz();

        System.out.println("");
        System.out.println("");

        for (int f = 0; f < fila; f++){
            System.out.print("|");
            for (int c = 0; c < columna; c++){
                System.out.print(" "+res[f][c]+" | ");
            }
            System.out.println("");
        }
    }
}
