package parcial2023.ej2;

public class Celda {

    private int valor, fila, columna, asignatura;
    private boolean pisada, vecinoInicio;

    public Celda(int v) {
        this.pisada = false;
        valor = v;
    }

    public void setPisada(boolean pisada) {
        this.pisada = pisada;
    }

    public boolean isVecinoInicio() {
        return vecinoInicio;
    }

    public boolean isPisada() {
        return pisada;
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


    @Override
    public String toString() {
        return ""+valor;
    }
}
