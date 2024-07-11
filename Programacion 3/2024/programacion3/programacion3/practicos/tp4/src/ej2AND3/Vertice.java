package ej2AND3;

public class Vertice {

    private String color;
    private int tiempoDescubrimiento, tiempoFinalizacion;

    public int getTiempoDescubrimiento() {
        return tiempoDescubrimiento;
    }

    public void setTiempoDescubrimiento(int tiempoDescubrimiento) {
        this.tiempoDescubrimiento = tiempoDescubrimiento;
    }

    public int getTiempoFinalizacion() {
        return tiempoFinalizacion;
    }

    public void setTiempoFinalizacion(int tiempoFinalizacion) {
        this.tiempoFinalizacion = tiempoFinalizacion;
    }

    public Vertice() {
        this.color = "Blanco";
        this.tiempoDescubrimiento = 0;
        this.tiempoFinalizacion = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
