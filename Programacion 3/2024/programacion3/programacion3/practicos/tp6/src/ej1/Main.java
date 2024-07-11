package ej1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList c = new ArrayList();
        c.add(100);
        c.add(25);
        c.add(10);
        c.add(5);
        c.add(1);

        Ej1 ej1 = new Ej1(c);

        System.out.println(ej1.greedy(289));
    }
}
