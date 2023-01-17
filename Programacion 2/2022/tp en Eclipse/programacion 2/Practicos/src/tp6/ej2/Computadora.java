package tp6.ej2;

public class Computadora extends ElementoOrdenable{
    private String nombre;
    private double velocidad;

    public Computadora(String nombre, double velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public void ejecutarProceso(Proceso p){
        //el proceso se ejecuta
        System.out.println("Ejecutando "+p);
    }

    public String getNombre() {
        return nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "nombre='" + nombre + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }

    @Override
    public boolean esMayor(ElementoOrdenable otro) {
        return this.getVelocidad() > ((Computadora)otro).getVelocidad();
    }
}

