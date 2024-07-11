package ej5;

import ej4.Ej4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Ej5 ej5 = new Ej5();

        ArrayList A = new ArrayList();

        A.add(-4);
        A.add(-1);
        A.add(0);
        A.add(3);
        A.add(12);
        A.add(22);
        A.add(54);
        A.add(98);

        System.out.println(ej5.contieneValorIgual(A));
    }
}
