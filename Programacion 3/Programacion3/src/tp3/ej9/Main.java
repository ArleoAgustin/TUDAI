package tp3.ej9;

import tp3.GrafoNoDirigido;

public class Main {

    public static void main(String[] args) {

        GrafoNoDirigido gNoDirigido = new GrafoNoDirigido();  //instancia el grafo dirigido

//carga los vertices
        gNoDirigido.agregarVertice(1);
        gNoDirigido.agregarVertice(2);
        gNoDirigido.agregarVertice(3);
        gNoDirigido.agregarVertice(4);
        gNoDirigido.agregarVertice(5);
        gNoDirigido.agregarVertice(6);

//carga los arcos
        gNoDirigido.agregarArco(1, 2, "BsAs - Madariaga");
        gNoDirigido.agregarArco(2, 6, "Madariaga - Tandil");
        gNoDirigido.agregarArco(1, 3, "BsAs - Las Flores");
        gNoDirigido.agregarArco(3, 5, "Las Flores - Azul");
        gNoDirigido.agregarArco(3, 4, "Las Flores - Rauch");
        gNoDirigido.agregarArco(5, 6, "Azul - Tandil");
        gNoDirigido.agregarArco(4, 6, "Rauch - Tandil");


        Ruta caminos = new Ruta(gNoDirigido);
        System.out.println(caminos.obtenerCaminos(1,6));
    }
}

