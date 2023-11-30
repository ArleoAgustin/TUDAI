package tp4.ej3;

import tp4.GrafoDirigido;
import tp4.ej1.Ej1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List conjunto = new ArrayList();
        conjunto.add(4);
        conjunto.add(-10);
        conjunto.add(1);
        conjunto.add(7);
        conjunto.add(10);
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(22);


        Ej3 ej3 = new Ej3(conjunto);

        System.out.println(ej3.buscarCombinaciones(12));
        System.out.println(ej3.getIteraciones());
    }
}