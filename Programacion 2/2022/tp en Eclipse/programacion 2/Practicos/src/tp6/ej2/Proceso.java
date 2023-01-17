package tp6.ej2;

public class Proceso extends ElementoOrdenable{

    private String nombre;
    private double reqMemoria;

    public Proceso(String nombre, double reqMemoria) {
        this.nombre = nombre;
        this.reqMemoria = reqMemoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getReqMemoria() {
        return reqMemoria;
    }

    @Override
    public String toString() {
        return "Proceso{" +
                "nombre='" + nombre + '\'' +
                ", reqMemoria=" + reqMemoria +
                '}';
    }

    @Override
    public boolean esMayor(ElementoOrdenable otro) {
        return this.getReqMemoria() > ((Proceso)otro).getReqMemoria();
    }
}
