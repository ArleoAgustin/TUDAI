package tp4.ej11;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int fila = 4;
        int columna = 4;
        Celda[][] casa = new Celda[fila][columna];

        ArrayList celdas = new ArrayList();

        Celda d1 = new Celda(0, 11);
        Celda d2 = new Celda(0, 5);
        Celda d3 = new Celda(0, 78);
        Celda d4 = new Celda(0, 56);
        Celda d5 = new Celda(0, 22);
        Celda d6 = new Celda(1, 64);
        Celda d7 = new Celda(0, 52);
        Celda d8 = new Celda(1, 44);
        Celda d9 = new Celda(0, 87);
        Celda d10 = new Celda(0, 40);
        Celda d11 = new Celda(0, 33);
        Celda d12 = new Celda(0, 65);
        Celda d13 = new Celda(0, 77);
        Celda d14 = new Celda(0, 99);
        Celda d15 = new Celda(1, 112);
        Celda d16 = new Celda(0, 1);


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

        Ej11 ej11 = new Ej11(casa);
        System.out.println(ej11.resolver(d1,d16));
    }
}