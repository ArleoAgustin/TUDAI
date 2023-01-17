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

	public Automovil(Automovil automovil) {
		this.marca = new String (automovil.getMarca());
		this.modelo = new Integer (automovil.getModelo());
		this.caracteristicas = automovil.copiarCaracteristicas();  
	}
	
	public ArrayList<Caracteristica> copiarCaracteristicas() {
		ArrayList<Caracteristica> arrAux = new  ArrayList<Caracteristica>();
		for (Caracteristica caracteristica : caracteristicas) {
			arrAux.add(new Caracteristica(caracteristica));
		}
		return arrAux;
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
