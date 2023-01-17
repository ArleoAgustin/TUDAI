package centroAnimales;

public class Caracteristica {
    private String nombre;
    private Object valor;

    public Caracteristica(String nombre, Object valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Caracteristica otra = (Caracteristica) obj;
            return this.getNombre().equals(otra.getNombre());
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "("+this.getNombre()+":"+this.getValor()+")";
    }
}
