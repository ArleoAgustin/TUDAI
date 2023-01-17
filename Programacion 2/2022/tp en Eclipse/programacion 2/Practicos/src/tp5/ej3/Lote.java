package tp5.ej3;

import java.util.ArrayList;

public class Lote {
	
	private int hectareas;
	private ArrayList<String> minerales = new ArrayList<String>();
	
	public Lote(int hectareas) {	
		this.hectareas = hectareas;
	}

	public int getHectareas() {
		return hectareas;
	}

	public void setHectareas(int hectareas) {
		this.hectareas = hectareas;
	}

	public ArrayList<String> getMinerales() {
		return minerales;
	}

	public void addMineral(String m) {
		this.minerales.add(m);
	}
	
	public boolean tieneMineral(String mineral) {
		return minerales.contains(mineral);
	}
	
	public boolean esAdecuado(Cereal c1) {
		
		for(String m: c1.minerales_necesarios) {
			if(!minerales.contains(m)) 
				return false;
		}
		return true;
	}
		
	
	
}
