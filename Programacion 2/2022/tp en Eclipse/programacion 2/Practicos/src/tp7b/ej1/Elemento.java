package tp7b.ej1;

import java.time.LocalDate;

public abstract class Elemento {
	
	private String nombre;
	private LocalDate fechaCreacion, fechaModificacion;
	
	
	
	public Elemento(String nombre) {
		
		this.nombre = nombre;
		this.setFechaCreacion(LocalDate.now());
		this.setFechaModificacion(LocalDate.now());
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}
	
	
	
	public void setFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
	public abstract double getTamanio();
	
	public abstract int cantElementos();
	
}
