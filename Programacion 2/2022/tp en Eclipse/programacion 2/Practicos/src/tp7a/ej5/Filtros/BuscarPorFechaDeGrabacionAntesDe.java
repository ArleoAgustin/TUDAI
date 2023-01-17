package tp7a.ej5.Filtros;

import java.time.LocalDate;

import tp7a.ej5.Pelicula;

public class BuscarPorFechaDeGrabacionAntesDe extends Filtro {

	private LocalDate fechaIngresada;
	
	public BuscarPorFechaDeGrabacionAntesDe(LocalDate fecha) {
	
		this.fechaIngresada = fecha;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		
		return this.fechaIngresada.isBefore(p.getFechaDeEstreno());
	}
	
}
