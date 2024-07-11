package ej3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList conjunto = new ArrayList();

        conjunto.add(10);
        conjunto.add(8);
        conjunto.add(7);
        conjunto.add(4);
        conjunto.add(2);
        conjunto.add(9);
        conjunto.add(14);
        conjunto.add(13);
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(6);

        Ej3 ej3 = new Ej3(conjunto);

        System.out.println(ej3.posibles_conjuntos(14));
    }
}
