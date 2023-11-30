package parcial2019.ej2;

import tp3.Arco;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList c = new ArrayList();

        c.add(1);
        c.add(2);
        c.add(3);

        Ej2 ej2 = new Ej2(c);

        System.out.println(ej2.resolver());
    }
}
