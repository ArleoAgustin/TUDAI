package tp4.ej6;

public class Celda {

    private int valor, fila, columna;
    private boolean pisada, vecinoInicio;

    public Celda(boolean pisada, boolean vecinoDeInicio, int v) {
        this.pisada = pisada;
        this.vecinoInicio = vecinoDeInicio;
        valor = v;
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
