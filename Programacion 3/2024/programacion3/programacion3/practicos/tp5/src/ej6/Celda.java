package ej6;

public class Celda {

    private boolean pisado, inicio;
    private int valor, fila, columna;

    public Celda(boolean pisado, boolean inicio,  int valor) {
        this.pisado = pisado;
        this.valor = valor;
        this.inicio = inicio;

    }

    public boolean isInicio() {
        return inicio;
    }

    public boolean isPisado() {
        return pisado;
    }

    public int getValor() {
        return valor;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void setPisado(boolean pisado) {
        this.pisado = pisado;
    }

    @Override
    public String toString() {
        return "" +valor;
    }
}
