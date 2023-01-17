package tp9_2020.ej1;

import java.util.ArrayList;

public class Territorio extends Elemento {
	
	private ArrayList<Elemento> regiones;

	public Territorio(String nombre) {
		super(nombre);
		this.regiones = new ArrayList<>();
	}

	public ArrayList<Elemento> getRegiones() {
		return new ArrayList<>(regiones);
	}

	public void setRegiones(Region r) {
		this.regiones.add(r);
	}

	@Override
	public int getCantHabitantes() {
		
		int aux=0;
		
		for(Elemento r: this.regiones) {
			aux+= r.getCantHabitantes();
		}
		return aux;
	}

	@Override
	public double getSuperficie() {

		int aux = 0;
		for(Elemento r: this.regiones) {
			aux+= r.getSuperficie();
		}
		
		return aux;
	}

	@Override
	public double getIngresos() { //total de ingresos / total de habitantes
		
		double aux = 0;
		for(Elemento r: this.regiones) {
			aux+= r.getIngresos();
			}
		return aux / this.getCantHabitantes();
	}


	
}
