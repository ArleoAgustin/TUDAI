package tp4.ej2;

import java.util.ArrayList;
import java.util.List;

public class Ej2 {

    private int fila = 4;
    private int columna = 4;
    private Celda [][] laberinto = new Celda[fila][columna];
    private List mejorCamino;
    private int longitudMin = 9999;

    public Ej2(Celda[][] laberinto) {
        this.laberinto = laberinto;
        this.mejorCamino = new ArrayList();
    }

    public List mejorCamino(Celda inicio, Celda fin){

        List camino = new ArrayList();
        List visitados = new ArrayList();
        camino.add(inicio);
       // visitados.add(inicio);
        buscar(inicio, fin, camino, visitados, inicio.getValor());

        return mejorCamino;
    }

    private void buscar(Celda actual, Celda fin, List<Celda> caminoActual, List<Celda> visitados, int longitud) {

        if (actual.getFila() == fin.getFila() && actual.getColumna() == fin.getColumna()) {

            System.out.println("camino "+caminoActual);
            System.out.println("longitud "+longitud);
            System.out.println(" ");
            if (longitud < longitudMin) {
                this.mejorCamino = new ArrayList<>(caminoActual);
                longitudMin = longitud;
            }
            return;
        } else {
            if (!visitados.contains(actual)) {
                visitados.add(actual);

                if (actual.isIzquierda() && actual.getColumna() > 0) {
                    Celda sigCelda = laberinto[actual.getFila()][actual.getColumna() - 1];
                    caminoActual.add(sigCelda);
                    buscar(sigCelda, fin, caminoActual, visitados, longitud += sigCelda.getValor());
                    caminoActual.remove(caminoActual.size() - 1);
                }

                if (actual.isDerecha() && actual.getColumna() < columna - 1) {
                    Celda sigCelda = laberinto[actual.getFila()][actual.getColumna() + 1];
                    caminoActual.add(sigCelda);
                    buscar(sigCelda, fin, caminoActual, visitados, longitud += sigCelda.getValor());
                    caminoActual.remove(caminoActual.size() - 1);
                }

                if (actual.isAbajo() && actual.getFila() < fila - 1) {
                    Celda sigCelda = laberinto[actual.getFila() + 1][actual.getColumna()];
                    caminoActual.add(sigCelda);
                    buscar(sigCelda, fin, caminoActual, visitados, longitud += sigCelda.getValor());
                    caminoActual.remove(caminoActual.size() - 1);
                }

                if (actual.isArriba() && actual.getFila() > 0) {
                    Celda sigCelda = laberinto[actual.getFila() - 1][actual.getColumna()];
                    caminoActual.add(sigCelda);
                    buscar(sigCelda, fin, caminoActual, visitados, longitud += sigCelda.getValor());
                    caminoActual.remove(caminoActual.size() - 1);
                }
                visitados.remove(visitados.size()-1);
            }

        }
    }

}

