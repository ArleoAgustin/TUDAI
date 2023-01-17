package tp8.ej2.Filtros;

import java.time.LocalDate;

import tp8.ej2.Elemento;

public class FiltroFechaModificacion extends Filtro {
	
	private LocalDate fecha;
	
	public FiltroFechaModificacion(LocalDate fecha) {
		super();
		this.fecha = fecha;
	}

	@Override
	public boolean cumple(Elemento e) {
		
		return e.getFechaModificacion().isAfter(fecha);
	}

}
