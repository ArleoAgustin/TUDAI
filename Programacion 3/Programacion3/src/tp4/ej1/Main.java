
import tp4.ej1.Ej1;
import  tp4.*;

public class Main {

    public static void main(String[] args) {

        GrafoDirigido gDirigido = new GrafoDirigido();  //instancia el grafo dirigido

        gDirigido.agregarVertice(1);
        gDirigido.agregarVertice(2);
        gDirigido.agregarVertice(3);
        gDirigido.agregarVertice(4);
        gDirigido.agregarVertice(5);
        gDirigido.agregarVertice(6);

        gDirigido.agregarArco(1,3,"Blanco");
        gDirigido.agregarArco(1,2,"Blanco");
        gDirigido.agregarArco(2,3,"Rojo");
        gDirigido.agregarArco(2,4,"Blanco");
        gDirigido.agregarArco(3,5,"Blanco");
        gDirigido.agregarArco(5,4,"Rojo");
        gDirigido.agregarArco(4,3,"Blanco");
        gDirigido.agregarArco(4,6,"Blanco");
        gDirigido.agregarArco(5,6,"Blanco");

        Ej1 ej1 = new Ej1(gDirigido);

        System.out.println(ej1.buscarCamino(1,6));
    }
}