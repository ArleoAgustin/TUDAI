package recuperatorioHotel.Criterio;

import recuperatorioHotel.Habitacion;

public class CriterioHabitacionLibre extends Criterio {

	@Override
	public boolean cumple(Habitacion h) {
		
		return h.estaLibre();

	}

}
