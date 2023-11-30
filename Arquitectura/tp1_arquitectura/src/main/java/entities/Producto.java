package entities;

public class Producto {

    private int id;
    private String nombre;
    private double valor;

    public Producto(int id, String nombre, double valor) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
    }
    public Producto() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Producto {" +
                "id = " + id +
                ", nombre = '" + nombre + '\'' +
                ", valor = " + valor +
                '}' + "\n";
    }
}
