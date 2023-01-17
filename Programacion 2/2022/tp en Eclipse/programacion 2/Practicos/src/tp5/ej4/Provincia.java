package tp5.ej4;

import java.util.ArrayList;

public class Provincia {
	
	private ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
	
	
	public boolean mitadDeCiudadesEnDeficit() {
		
		int cantCiudades =0;
		
		for(Ciudad c: ciudades) {
			
			if(c.gastaMasqueRecauda())
				cantCiudades++;
			}
		
		if(cantCiudades > this.ciudades.size()/2)
			return true;
		else
			return false;
	}
}
