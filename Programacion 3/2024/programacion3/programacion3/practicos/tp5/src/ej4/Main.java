package ej4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList conjunto = new ArrayList();


/*
        conjunto.add(-9);
        conjunto.add(1);
        conjunto.add(3);
        conjunto.add(18);
        conjunto.add(5);
*/


        conjunto.add(19);
        conjunto.add(2);
        conjunto.add(21);



        Ej4 ej4 = new Ej4(conjunto);

        System.out.println(ej4.buscarSolucion());


    }
}
