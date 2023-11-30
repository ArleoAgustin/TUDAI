package tp3.ej9;
import tp3.*;

import java.util.*;

public class Ruta {

    /*
    Dado un grafo no orientado que modela las rutas de la provincia de Buenos Aires, devolver
    todos los caminos alternativos que se pueden tomar para ir desde la ciudad de Buenos
    Aires a la ciudad de Tandil, considerando que en el tramo Las Flores-Rauch está cortado al
    tránsito
    **/

    private GrafoNoDirigido grafo;
    private HashMap<Integer, String> ciudades;
    private List<List> caminos;

    public Ruta(GrafoNoDirigido grafo) {
        this.grafo = grafo;
        this.ciudades = new HashMap<>();
        this.caminos = new ArrayList<>();

        Iterator<Integer> ciu = grafo.obtenerVertices();
        while (ciu.hasNext()){
            ciudades.put(ciu.next(), "Blanco");
        }

    }

    public List<List> obtenerCaminos(int desde, int hasta){

        ArrayList camino = new ArrayList();
        List visitados = new ArrayList();
        camino.add(desde);
        visitados.add(desde);
        obtenerCaminos(desde,hasta, camino, visitados);

    return caminos;
    }

    private void obtenerCaminos(int actual, int destino, List camino, List visitados) {

        if (actual == destino) {
            caminos.add(new ArrayList(camino));
            return;
        }
        else {
            for (Iterator<Integer> it = grafo.obtenerAdyacentes(actual); it.hasNext(); ) {
                int ady = it.next();
                Arco arco = grafo.obtenerArco(actual, ady);
                if (arco.getVerticeDestino() != 4 && !visitados.contains(ady)){
                    camino.add(ady);
                    visitados.add(ady);
                    obtenerCaminos(ady,destino,camino, visitados);
                    camino.remove(camino.size()-1);
                    visitados.remove(visitados.size()-1);
                }
            }

        }
    }


}
