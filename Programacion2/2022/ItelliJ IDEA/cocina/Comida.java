package clase20211109.cocina;

public class Comida {
    private String nombre;
    private String tipo;
    private String modoPreparacion;
    private int tiempoCoccion;

    public Comida(String nombre, String tipo, String modoPreparacion, int tiempoCoccion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modoPreparacion = modoPreparacion;
        this.tiempoCoccion = tiempoCoccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModoPreparacion() {
        return modoPreparacion;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }
}
