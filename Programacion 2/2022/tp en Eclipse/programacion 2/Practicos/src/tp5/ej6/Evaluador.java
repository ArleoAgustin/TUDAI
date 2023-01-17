package tp5.ej6;

import java.util.ArrayList;

public class Evaluador {
	
	private ArrayList<String> palabrasClaves = new ArrayList<String>();
	private ArrayList<Trabajo> trabajos = new ArrayList<Trabajo>();
	private ArrayList<String> temasConocidos = new ArrayList<String>();
	
	public Evaluador() {
		
	}

	public ArrayList<String> getPalabrasClaves() {
		return new ArrayList<>(palabrasClaves);
	}

	public void addPalabra(String p) {
		this.palabrasClaves.add(p);
	}

	public ArrayList<Trabajo> getTrabajos() {
		return new ArrayList<>(trabajos);
	}

	public void addTrabajo(Trabajo t) {
		if(t.esApto(this))
			this.trabajos.add(t);
	}
	
	public int cuantosTrabajosTengo() {
		return this.trabajos.size();
	}
	
	public boolean admitoTrabajo(Trabajo trabajo) {
		return trabajo.esApto(this);
	}

	public ArrayList<String> getTemasConocidos() {
		return temasConocidos;
	}

	public void addTemaConocido(String t) {
		this.temasConocidos.add(t);
	}
	
	
	
}
