package tp6.ej3;

public class Barco extends ElementoOrdenable {
	
	private double capacidadDeCarga;
	private String nombre;
	
	
	public Barco(String nombre,double capacidadDeCarga) {
		this.nombre = nombre;
		this.capacidadDeCarga = capacidadDeCarga;
	}

	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getCapacidadDeCarga() {
		return capacidadDeCarga;
	}



	public void setCapacidadDeCarga(double capacidadDeCarga) {
		this.capacidadDeCarga = capacidadDeCarga;
	}



	@Override
	public boolean esMayor(ElementoOrdenable otro) {

		return this.getCapacidadDeCarga() > ((Barco)otro).getCapacidadDeCarga();
		
	}



}
