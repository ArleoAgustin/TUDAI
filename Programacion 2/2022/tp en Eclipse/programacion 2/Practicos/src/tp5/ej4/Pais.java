package tp5.ej4;

import java.util.ArrayList;

public class Pais {
	
	private ArrayList<Provincia> provincias = new ArrayList<Provincia>();
	private ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
	
	
	public ArrayList<Ciudad> ciudadesQueMasGastan(){
		
		ArrayList<Ciudad> ciudadesQueGastan = new ArrayList<Ciudad>();
		
		for(Ciudad c: ciudades) {
			if(!c.gastaMasqueRecauda())
				ciudadesQueGastan.add(c);
		}
		return ciudadesQueGastan;
	}
	
}
