package recuperatorioHotel.Comparador;

import recuperatorioHotel.Habitacion;

public class CompararCantCamas extends Comparador {

	@Override
	public int compare(Habitacion h1, Habitacion h2) {
		return h1.getCantCamas() - h2.getCantCamas();
	}

}
