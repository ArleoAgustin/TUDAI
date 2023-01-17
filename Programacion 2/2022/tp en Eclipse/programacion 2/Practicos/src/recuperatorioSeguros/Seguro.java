package recuperatorioSeguros;

import java.util.ArrayList;

import recuperatorioSeguros.Filtros.Filtro;

public abstract class Seguro {
	
	private String nombre;
	private int dni;
	
	
	public Seguro(int dni) {
		super();
		this.setDni(dni);
	}
	
	
	
	public abstract double getValorAsegurado();
	public abstract int getNroPoliza();
	public abstract double getMonto();



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getDni() {
		return dni;
	}



	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public abstract ArrayList<Seguro> buscar(Filtro f);

}
