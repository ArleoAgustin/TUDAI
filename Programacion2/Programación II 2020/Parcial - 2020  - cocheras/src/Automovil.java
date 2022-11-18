import java.util.ArrayList;


public class Automovil {
	private String marca;
	private int modelo;
	private ArrayList<Caracteristica> caracteristicas;
	
	public Automovil(String marca, int modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.caracteristicas = new  ArrayList<Caracteristica>();
	}

	public String getMarca() {
		return marca;
	}

	public int getModelo() {
		return modelo;
	}
	
	public boolean containsCaracteristica(Caracteristica caracteristica) {
		return this.caracteristicas.contains(caracteristica);
	}
	
	public boolean addCaracteristica(Caracteristica caracteristica) {
		return this.caracteristicas.add(caracteristica);
	}
	
}
