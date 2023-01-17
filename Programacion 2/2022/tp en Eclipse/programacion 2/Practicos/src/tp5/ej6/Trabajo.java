package tp5.ej6;

import java.util.ArrayList;

public class Trabajo {
	
	private String categoria;
	private ArrayList<String> palabrasClaves = new ArrayList<String>();
	
	
	
	public Trabajo(String categoria) {
		this.categoria = categoria;
	}

	public void addPalabra(String p) {
		
		palabrasClaves.add(p);
	}
	
	
	public ArrayList<String> getPalabrasClaves() {
		return new ArrayList<>(palabrasClaves);
	}

	public boolean esApto(Evaluador e) {
		
		for(String p: this.palabrasClaves) {
			if(!e.getPalabrasClaves().contains(p))
				return false;
		}
		return true;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
