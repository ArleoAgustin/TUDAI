package tp4.ej11;

public class Celda {

    private int valor, fila, columna, asignatura;
    private boolean pisada, vecinoInicio;

    public Celda(int v, int asignatura) {
        this.pisada = pisada;
        valor = v;
        this.asignatura =asignatura;
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
        return ""+asignatura;
    }
}
