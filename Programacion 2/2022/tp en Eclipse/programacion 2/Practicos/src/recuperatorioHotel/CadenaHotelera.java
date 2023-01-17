package recuperatorioHotel;

import java.util.ArrayList;
import java.util.Collections;

import recuperatorioHotel.Comparador.Comparador;
import recuperatorioHotel.Criterio.Criterio;

public class CadenaHotelera extends ElementoHotel{
	
	private ArrayList<ElementoHotel> elementos;

	
	public CadenaHotelera() {
		super();
		this.elementos = new ArrayList<>();
	}



	@Override
	public double getMetrosCuadrados() {
		
		double aux = 0;
		
		for(ElementoHotel e: this.elementos) {
			aux+= e.getMetrosCuadrados();
		}
		return aux;
	}
	
	
	public ArrayList<Habitacion> buscarHabitaciones(Criterio c, Comparador comp){
		
		ArrayList<Habitacion> res = new ArrayList<>();
	
		for(ElementoHotel e: this.elementos) {
			ArrayList<Habitacion> aux = e.buscarHabitaciones(c, comp);
			res.addAll(aux);
		}
		
		Collections.sort(res, comp);
		return res;
	}
	
	


	public int contarHabitaciones(Criterio c) {
		
		int contador = 0;
		
		for(ElementoHotel e: this.elementos) {
			contador += e.contarHabitaciones(c);
		}
		return contador;
	}


	@Override
	public ArrayList<Habitacion> habitacionesLibres() {

		ArrayList<Habitacion> res = new ArrayList<>();
		
		for(ElementoHotel e: this.elementos) {
			ArrayList<Habitacion> aux = e.habitacionesLibres();
			res.addAll(aux);
		}
		return res;
	}
}
