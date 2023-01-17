package tp6.ej3;

import java.time.LocalDate;

public class Camion extends ElementoOrdenable {

	private LocalDate fechaDeCarga;
	private String marca;
	
	
	public Camion(String marca, LocalDate fechaDeCarga) {
		this.marca = marca;
		this.fechaDeCarga = fechaDeCarga;
	}

	

	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public LocalDate getFechaDeCarga() {
		return fechaDeCarga;
	}



	public void setFechaDeCarga(LocalDate fechaDeCarga) {
		this.fechaDeCarga = fechaDeCarga;
	}



	@Override
	public boolean esMayor(ElementoOrdenable otro) {
		
		return this.getFechaDeCarga().isBefore(((Camion)otro).getFechaDeCarga());
		
	}

}
