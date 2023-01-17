package tp7a.ej5.Filtros;

import tp7a.ej5.Pelicula;

public class BuscarPorDuracionMayorQue extends Filtro {
	
	private int duracionIngresada;
	
	
	
	public BuscarPorDuracionMayorQue(int duracionIngresada) {
		
		this.duracionIngresada = duracionIngresada;
	}



	@Override
	public boolean cumple(Pelicula p) {
		return this.duracionIngresada > p.getDuracion(); 
	}

}
