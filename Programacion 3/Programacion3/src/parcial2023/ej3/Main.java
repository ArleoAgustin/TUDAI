package parcial2023.ej3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List conjunto = new ArrayList<>();

        conjunto.add(5);
        conjunto.add(19);
        conjunto.add(3);
        conjunto.add(7);
        conjunto.add(9);
        conjunto.add(2);
        conjunto.add(1);
        conjunto.add(-10);

        Ej3 ej3 = new Ej3(conjunto);

        System.out.println(conjunto);
        System.out.println(ej3.resolver(9));
    }
}
