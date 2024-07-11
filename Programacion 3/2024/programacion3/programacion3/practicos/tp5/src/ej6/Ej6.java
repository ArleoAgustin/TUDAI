package ej6;

import java.util.ArrayList;
import java.util.List;

public class Ej6 {

    private Celda[][] matriz;
    private ArrayList solucion;
    private ArrayList pisadas;
    private Celda inicio;
    private final int columna, fila;

    public Ej6(Celda[][] matriz, ArrayList pisadas) {
        this.matriz = matriz;
        this.solucion = new ArrayList();
        this.pisadas = pisadas;
        this.columna = 4;
        this.fila = 4;
        inicio = (Celda) pisadas.get(0);
    }

    public ArrayList caminoRecorrido(Celda inicio){

        ArrayList caminoActual = new ArrayList();
        caminoActual.add(inicio);
        pisadas.remove(inicio);

        this.buscarRecorridoBack(caminoActual, new ArrayList(),inicio);
        return solucion;
    }

    private void buscarRecorridoBack(ArrayList caminoActual, List celdasVisitadas, Celda cActual) {


        if (this.isVecinaDeEntrada(cActual) && pisadas.isEmpty()){
            solucion.clear();
            solucion.add(new ArrayList<>(caminoActual));
            return;
        }

        if (caminoActual.isEmpty() ) {
            caminoActual.add(cActual);
        }


        if (!celdasVisitadas.contains(cActual)) {



            celdasVisitadas.add(cActual);

            int filaActual = cActual.getFila();
            int columnaActual = cActual.getColumna();

            // Movimiento hacia la izquierda
            if (columnaActual > 0 && matriz[filaActual][columnaActual - 1].isPisado() &&
                    !celdasVisitadas.contains(matriz[filaActual][columnaActual - 1])) {

                Celda sigCelda = matriz[filaActual][columnaActual - 1];
                pisadas.remove(sigCelda);
                caminoActual.add(sigCelda);
                buscarRecorridoBack(caminoActual, celdasVisitadas, sigCelda);
                pisadas.add(sigCelda);
                caminoActual.remove(caminoActual.size() - 1);
            }

            // Movimiento hacia la derecha
            if (columnaActual < columna - 1 && matriz[filaActual][columnaActual + 1].isPisado() &&
                    !celdasVisitadas.contains(matriz[filaActual][columnaActual + 1])) {

                Celda sigCelda = matriz[filaActual][columnaActual + 1];
                pisadas.remove(sigCelda);
                caminoActual.add(sigCelda);
                buscarRecorridoBack(caminoActual, celdasVisitadas, sigCelda);
                caminoActual.remove(caminoActual.size() - 1);
                pisadas.add(sigCelda);
            }

            // Movimiento hacia abajo
            if (filaActual < fila - 1 && matriz[filaActual + 1][columnaActual].isPisado() &&
                    !celdasVisitadas.contains(matriz[filaActual + 1][columnaActual])) {

                Celda sigCelda = matriz[filaActual + 1][columnaActual];
                caminoActual.add(sigCelda);
                pisadas.remove(sigCelda);
                buscarRecorridoBack(caminoActual, celdasVisitadas, sigCelda);
                caminoActual.remove(caminoActual.size() - 1);
                pisadas.add(sigCelda);
            }

            // Movimiento hacia arriba
            if (filaActual > 0 && matriz[filaActual - 1][columnaActual].isPisado() &&
                    !celdasVisitadas.contains(matriz[filaActual - 1][columnaActual])) {

                Celda sigCelda = matriz[filaActual - 1][columnaActual];
                caminoActual.add(sigCelda);
                pisadas.remove(sigCelda);
                buscarRecorridoBack(caminoActual, celdasVisitadas, sigCelda);
                caminoActual.remove(caminoActual.size() - 1);
                pisadas.add(sigCelda);
            }
        }
        celdasVisitadas.remove(celdasVisitadas.size()-1);
    }


    private boolean isVecinaDeEntrada(Celda c){

        if (c.getColumna() < columna - 1 && matriz[c.getFila()][c.getColumna()+1].isInicio()){ //si uno de los vecinos es mi inicio
            return true;
        }

        if (c.getColumna() > 0 && matriz[c.getFila()][c.getColumna()-1].isInicio()){
            return true;
        }

        if (c.getFila() < fila - 1 && matriz[c.getFila() +1][c.getColumna()].isInicio()){
            return true;
        }

        if (c.getFila() > 0 && matriz[c.getFila() -1][c.getColumna()].isInicio()){
            return true;
        }

        return false;
    }

    private boolean existeMov(Celda c){

        if (c.getColumna() +1 < columna && matriz[c.getFila()][c.getColumna()+1].isPisado()){ //si uno de los vecinos es mi inicio
            return true;
        }

        if (c.getColumna()-1 > 0 && matriz[c.getFila()][c.getColumna()-1].isPisado()){
            return true;
        }

        if (c.getFila() +1 < fila && matriz[c.getFila() +1][c.getColumna()].isPisado()){
            return true;
        }

        if (c.getFila() -1 > 0 && matriz[c.getFila() -1][c.getColumna()].isPisado()){
            return true;
        }

        return false;
    }

}
