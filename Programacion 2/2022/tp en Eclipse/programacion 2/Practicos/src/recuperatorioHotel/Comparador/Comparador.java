package recuperatorioHotel.Comparador;

import java.util.Comparator;

import recuperatorioHotel.Habitacion;

public abstract class Comparador implements Comparator<Habitacion>{
	
	public abstract int compare(Habitacion h1, Habitacion h2);
}
