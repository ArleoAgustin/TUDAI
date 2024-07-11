package ej2;

import java.util.ArrayList;

@SuppressWarnings("SpellCheckingInspection")
public class Ej2 {

    private Celda[][] matriz;
    private final int Maxfila, Maxcolumna;
    private ArrayList<Celda> visitados;
    private int sumaMejorCamino;

    public Ej2(Celda[][] matriz) {
        this.matriz = matriz;
        this.Maxfila = matriz.length;
        this.Maxcolumna = matriz[0].length;
        this.visitados = new ArrayList();
        this.sumaMejorCamino = 9999;
    }

    public ArrayList buscarCaminoMasCorto(Celda inicio, Celda fin){

        ArrayList caminoActual = new ArrayList();
        caminoActual.add(inicio);           //agrega la celda de inicio

        return buscarCaminoMasCorto(inicio, fin, caminoActual, new ArrayList<>(), 0);
    }

    private ArrayList buscarCaminoMasCorto(Celda actual, Celda fin, ArrayList caminoActual, ArrayList mejorCamino, int sumaCaminoActual) {

        if (llego(actual,fin)){
            if(sumaCaminoActual < sumaMejorCamino){
                mejorCamino = new ArrayList<>(caminoActual);
                sumaMejorCamino = sumaCaminoActual;
            }
        }
        else{
            if (!visitados.contains(actual)) {  //si el actual no esta contenido
                visitados.add(actual);
                int columnaActual = actual.getColumna();
                int filaActual = actual.getFila();

                //izquierda
                if (columnaActual > 0 && !visitados.contains(matriz[filaActual][columnaActual - 1])) {       //si no contiene el vecino izquierdo

                    Celda sigCelda = matriz[filaActual][columnaActual - 1];
                    caminoActual.add(sigCelda);
                    mejorCamino = buscarCaminoMasCorto(sigCelda,fin,caminoActual,mejorCamino, sigCelda.getValor() + sumaCaminoActual);
                    caminoActual.remove(caminoActual.size()-1);
                }
                //derecha
                if (columnaActual < Maxcolumna-1 && !visitados.contains(matriz[filaActual][columnaActual + 1])) {//si no contiene el vecino derecho

                    Celda sigCelda = matriz[filaActual][columnaActual + 1];
                    caminoActual.add(sigCelda);
                    mejorCamino = buscarCaminoMasCorto(sigCelda,fin,caminoActual,mejorCamino,sigCelda.getValor() + sumaCaminoActual);
                    caminoActual.remove(caminoActual.size()-1);
                }

                //abajo
                if (filaActual < Maxfila-1 && !visitados.contains(matriz[filaActual+1][columnaActual])) {    //si no contiene el vecino de abajo

                    Celda sigCelda = matriz[filaActual+1][columnaActual];
                    caminoActual.add(sigCelda);
                    mejorCamino = buscarCaminoMasCorto(sigCelda,fin,caminoActual,mejorCamino,sigCelda.getValor() + sumaCaminoActual);
                    caminoActual.remove(caminoActual.size()-1);
                }

                //arriba
                if (filaActual > 0 && !visitados.contains(matriz[filaActual-1][columnaActual])) {       //si no contiene el vecino de arriba

                    Celda sigCelda = matriz[filaActual-1][columnaActual];
                    caminoActual.add(sigCelda);
                    mejorCamino = buscarCaminoMasCorto(sigCelda,fin,caminoActual,mejorCamino,sigCelda.getValor() + sumaCaminoActual);
                    caminoActual.remove(caminoActual.size()-1);
                }
                visitados.remove(visitados.size()-1);
            }
        }

    return mejorCamino;
    }

    private boolean llego(Celda c1, Celda c2) {
        return ((c1.getColumna() == c2.getColumna()) && (c1.getFila() == c2.getFila()));
    }
}
