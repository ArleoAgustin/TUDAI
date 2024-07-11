package ej2;

public class Actividad {

    private String nombre;
    private int tc, tf;

    public Actividad(String nombre, int tc, int tf) {
        this.nombre = nombre;
        this.tc = tc;
        this.tf = tf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public int getTf() {
        return tf;
    }

    public void setTf(int tf) {
        this.tf = tf;
    }

    @Override
    public String toString() {
        return "Actividad{" +
                "nombre='" + nombre + '\'' +
                ", tc=" + tc +
                ", tf=" + tf +
                '}';
    }
}
