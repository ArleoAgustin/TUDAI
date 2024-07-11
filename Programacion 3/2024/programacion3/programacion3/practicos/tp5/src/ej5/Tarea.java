package ej5;

public class Tarea {

    private String id;
    private int tiempoDeEjecucion;
    private Procesador procesadorAsignado;

    public Tarea(int tiempoDeEjecucion, String id) {

        this.id = id;
        this.procesadorAsignado = null;
        this.tiempoDeEjecucion = tiempoDeEjecucion;
    }

    public int getTiempoDeEjecucion() {
        return tiempoDeEjecucion;
    }

    public String getId() {
        return id;
    }
}
