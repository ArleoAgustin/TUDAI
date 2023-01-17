package recuperatorioHotel.Comparador;

import recuperatorioHotel.Habitacion;

public class CompararSuperficie extends Comparador {

	
	
	public CompararSuperficie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Habitacion h1, Habitacion h2) {
		
		double aux = h1.getMetrosCuadrados() - h2.getMetrosCuadrados();
		
		if(aux > 1)
			return 1;
		
		else if(aux < 0)
			return -1;
		
		else return 0;
				
	}

}
