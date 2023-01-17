package tp5.ej3;

import java.util.ArrayList;

public class Cereal {
	
	private String nombre;
	protected ArrayList<String> minerales_necesarios = new ArrayList<String>();
	private ArrayList<String> granos = new ArrayList<String>();
	
	public Cereal(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getMinerales_necesarios() {
		return minerales_necesarios;
	}

	public void addMineral(String m) {
		this.minerales_necesarios.add(m);
	}
	
	
	public boolean esAdecuado(Lote l) {
		
		for(String m: minerales_necesarios) {
			if(!l.getMinerales().contains(m))
				return false;
		}
		return true;
		
	}

	@Override
	public String toString() {
		return "Granos de " + nombre;
	}
	
	
	
}
