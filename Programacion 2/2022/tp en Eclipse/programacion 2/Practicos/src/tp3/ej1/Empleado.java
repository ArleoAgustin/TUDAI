package tp3.ej1;

public class Empleado {
	
	private String nombre;
	private int cantEncuestasRealizadas;
	
	
	public Empleado(String nombre) {	
		this.nombre = nombre;
		this.cantEncuestasRealizadas = 0;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void incrementarEncuestas() {
		
		this.cantEncuestasRealizadas++;
	}


	public int getCantEncuestasRealizadas() {
		return cantEncuestasRealizadas;
	}
	
	
	
	
}
