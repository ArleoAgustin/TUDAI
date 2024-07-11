package ej11;

public class Celda {

    private boolean izquierda, derecha, abajo, arriba;
    private int value, fila, columna;
    private String value2;

    public Celda(boolean izquierda, boolean derecha, boolean abajo, boolean arriba, int value, int fila, int columna , String value2) {
        this.izquierda = izquierda;
        this.derecha = derecha;
        this.abajo = abajo;
        this.arriba = arriba;
        this.value = value;
        this.fila = fila;
        this.columna = columna;
        this.value2 = value2;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public Celda() {
    }

    public boolean isIzquierda() {
        return izquierda;
    }

    public void setIzquierda(boolean izquierda) {
        this.izquierda = izquierda;
    }

    public boolean isDerecha() {
        return derecha;
    }

    public void setDerecha(boolean derecha) {
        this.derecha = derecha;
    }

    public boolean isAbajo() {
        return abajo;
    }

    public void setAbajo(boolean abajo) {
        this.abajo = abajo;
    }

    public boolean isArriba() {
        return arriba;
    }

    public void setArriba(boolean arriba) {
        this.arriba = arriba;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return value2;
    }
}
