package ej11;

import java.util.ArrayList;

public class Ej11 {

    private ArrayList solucion;
    private Celda[][] matriz;

    public Ej11(Celda[][] matriz) {
        this.matriz = matriz;
        this.solucion = new ArrayList();
    }

    public ArrayList volver(Celda inicio, Celda fin) {

        this.buscarCamino(new ArrayList<>(), inicio, fin);

        return solucion;
    }

    private void buscarCamino(ArrayList<Object> caminoActual, Celda actual, Celda fin) {

        if (caminoActual.isEmpty()){    //primera entrada
            caminoActual.add(actual);
        }

        if (actual == fin){
            if(caminoActual.size() < solucion.size() || solucion.isEmpty()){
                solucion = new ArrayList<>(caminoActual);
            }
            return;
        }


        else{

            int filaActual = actual.getFila();
            int columnaActual = actual.getColumna();

            //arriba
            if (actual.isArriba() && matriz[filaActual-1][columnaActual].getValue() != 1 && !caminoActual.contains(matriz[filaActual-1][columnaActual])){

                Celda sigCelda = matriz[filaActual-1][columnaActual];
                caminoActual.add(sigCelda);
                buscarCamino(caminoActual, sigCelda, fin);
                caminoActual.remove(caminoActual.size()-1);
            }

            //abajo
            if (actual.isAbajo() && matriz[filaActual+1][columnaActual].getValue() != 1 &&  !caminoActual.contains(matriz[filaActual+1][columnaActual])){

                Celda sigCelda = matriz[filaActual+1][columnaActual];
                caminoActual.add(sigCelda);
                buscarCamino(caminoActual, sigCelda, fin);
                caminoActual.remove(caminoActual.size()-1);
            }

            //izquierda
            if (actual.isIzquierda() && matriz[filaActual][columnaActual-1].getValue() != 1 && !caminoActual.contains(matriz[filaActual][columnaActual-1])){

                Celda sigCelda = matriz[filaActual][columnaActual-1];
                caminoActual.add(sigCelda);
                buscarCamino(caminoActual, sigCelda, fin);
                caminoActual.remove(caminoActual.size()-1);
            }

            //Derecha
            if (actual.isDerecha() && matriz[filaActual][columnaActual+1].getValue() != 1 && !caminoActual.contains(matriz[filaActual][columnaActual+1])){

                Celda sigCelda = matriz[filaActual][columnaActual+1];
                caminoActual.add(sigCelda);
                buscarCamino(caminoActual, sigCelda, fin);
                caminoActual.remove(caminoActual.size()-1);
            }
        }
    }
}
