package tp4.ej5;

import java.time.LocalDate;
import java.util.ArrayList;

public class CongeladoXaire extends ProductoRefrigerado {
	
	private ArrayList<String> compDelAire;

	public CongeladoXaire(LocalDate fechaVencimiento, int nroLote, String info, LocalDate fechaEnvasado,
			String granjaOrigen, int codigoOSA, double tempMatenimiento, ArrayList<String> compDelAire) {
		
		super(fechaVencimiento, nroLote, info, fechaEnvasado, granjaOrigen, codigoOSA, tempMatenimiento);
		this.compDelAire = compDelAire;
	}

	public ArrayList<String> getCompDelAire() {
		return compDelAire;
	}

	public void addComponente(String compDelAire) {
		this.compDelAire.add(compDelAire);
	}

	@Override
	public String toString() {
		return super.toString()+"CongeladoXaire [compDelAire=" + compDelAire + "]";
	}
	
	
}
