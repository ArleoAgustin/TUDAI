package tp4.ej10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List conjunto = new ArrayList();
        conjunto.add(-7);
        conjunto.add(-3);
        conjunto.add(-2);
        conjunto.add(-1);
        conjunto.add(5);
        conjunto.add(8);


        Ej10 ej10 = new Ej10(conjunto);

        System.out.println(ej10.resolver(3));
    }
}