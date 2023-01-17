package recuperatorioHotel.Comparador;

import recuperatorioHotel.Habitacion;

public class ComparadorFechas extends Comparador {

	@Override
	public int compare(Habitacion h1, Habitacion h2) {
		
		return h1.getUltimaFechaOcupada().compareTo(h2.getUltimaFechaOcupada());
	}

}
