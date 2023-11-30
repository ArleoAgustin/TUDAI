package tp5.ej3;

public class Actividad {

    private String nombre;
    private int inicio, fin;

    public Actividad(String nombre, int inicio, int fin) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

