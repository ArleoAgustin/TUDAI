package tp4.ej4;

import tp4.ej3.Ej3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List conjunto = new ArrayList();
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(4);
        conjunto.add(5);
        conjunto.add(6);
        conjunto.add(7);



        Ej4 ej4 = new Ej4(conjunto);

        System.out.println(ej4.buscarCombinaciones());

    }
}