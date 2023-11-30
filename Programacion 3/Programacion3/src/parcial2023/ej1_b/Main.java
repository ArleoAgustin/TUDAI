package parcial2023.ej1_b;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TreeNode arbol = new TreeNode();

        List D = new ArrayList();

        D.add(1);
        D.add(2);
        D.add(3);
        D.add(4);
        D.add(5);
        D.add(6);
        D.add(7);

        Ej2 ej2 = new Ej2(arbol);



        arbol.setRoot(ej2.crearArbol(D,0, D.size()-1));

        arbol.print();

    }

}
