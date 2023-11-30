package tp5.ej1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList conjunto = new ArrayList();

        conjunto.add(100);
        conjunto.add(25);
        conjunto.add(10);
        conjunto.add(5);
        conjunto.add(1);

        Ej1 ej1 = new Ej1(conjunto);

        System.out.println(ej1.Greedy(new ArrayList(), 0, 289));
    }

}
