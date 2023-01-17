package tp6.ej1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
	
	private String nombre;
	private ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();
	
	public Cliente(String nombre) {
		super();
		this.setNombre(nombre);
	}

	public ArrayList<Alquiler> getItemsAlquilados() {
		return new ArrayList<>(alquileres);
	}
	
	public boolean alquilerVencido() {
		
		for(Alquiler a: this.alquileres) {
			
			return !a.productoDevuelto();
		}
		return true;
	}


	public void addAlquiler(Alquiler a) {
		this.alquileres.add(a);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
