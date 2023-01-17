package tp7a.ej3;

import java.util.ArrayList;

import tp7a.ej3.Filtro.Filtro;

public class Vivero {
	
	private ArrayList<Planta> plantas;

	public Vivero() {
		
		this.plantas = new ArrayList<>();
	}

	public ArrayList<Planta> getPlantas() {
		return new ArrayList<>(plantas);
	}

	public void addPlantas(Planta p) {
		this.plantas.add(p);
	}
	
	
	public ArrayList<Planta> buscarPlantas(Filtro f){
		
		ArrayList<Planta> plant = new ArrayList<>();
		
		for(Planta p: this.plantas) {
			if(f.cumple(p)) {
				plant.add(p);
			}
		}
		return plant;
	}
	
	
	
}
