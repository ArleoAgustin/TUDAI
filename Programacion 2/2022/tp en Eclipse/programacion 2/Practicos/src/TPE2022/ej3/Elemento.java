package TPE2022.ej3;

public abstract class Elemento {

	 private String nombre;



	    public Elemento(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public abstract int getCantAlumnos();
}