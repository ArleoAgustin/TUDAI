package tp5.ej3;

import java.util.ArrayList;

public class Cooperativa {
	
	private ArrayList<Lote> lotes = new ArrayList<Lote>();
	private ArrayList<Cereal> cereales = new ArrayList<Cereal>();
	private ArrayList<String> mineralesDeInteres = new ArrayList<String>();
	
	public Cooperativa() {
	
	}

	public ArrayList<Lote> getLotes() {
		return lotes;
	}

	public ArrayList<Cereal> getCereales() {
		return cereales;
	}
	
	public void addLote(Lote l) {
		lotes.add(l);
	}
	
	public void addCereal(Cereal c) {
		cereales.add(c);
	}

	public ArrayList<String> getMineralesDeInteres() {
		return mineralesDeInteres;
	}

	public void addMineralDeInteres(String m) {
		this.mineralesDeInteres.add(m);
	}

	public String loteEspecial(Lote l1) {
		
		for(String m: this.mineralesDeInteres) {
			if(!l1.tieneMineral(m))
				return "El lote es Comun";
		}
		return "El lote es especial";
	}
	
	
	public ArrayList<Cereal> cerealesQuePuedenSembrarseEnLote(Lote l) {
		
		ArrayList<Cereal> salida = new ArrayList<Cereal>();
		for(Cereal c: this.cereales) {
			
			if(c.esAdecuado(l)) {
				salida.add(c);
			}
		}
		return salida;
	}
	
	public ArrayList<Lote> lotesEnLosQueSePuedeSembrar(Cereal c) {
		
		ArrayList<Lote> salida = new ArrayList<Lote>();
		
		for(int i=0; i < lotes.size(); i++ ){
			
			if(lotes.get(i).esAdecuado(c)) {
				salida.add(lotes.get(i));
			}
		}
		
		return salida;
	}
	
	
}
