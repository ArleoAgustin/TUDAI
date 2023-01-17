package recuperatorioHotel;

import java.util.ArrayList;

import recuperatorioHotel.Comparador.Comparador;
import recuperatorioHotel.Criterio.Criterio;

public abstract class ElementoHotel {
	
	public abstract double getMetrosCuadrados();
	
	public abstract ArrayList<Habitacion> buscarHabitaciones(Criterio c, Comparador h);
	
	public abstract ArrayList<Habitacion> habitacionesLibres();

	public abstract int contarHabitaciones(Criterio c);
}
