package parcial2021;

import java.time.LocalDate;
import java.util.ArrayList;

public class PaqueteCompuesto extends PaqueteViaje {
	
	private ArrayList<PaqueteViaje> paquetes;

	public PaqueteCompuesto(int id, int cantPersonas) {
		super(id, cantPersonas);
		this.paquetes = new ArrayList<>();
		
	}

	@Override
	public double getCosto() {
		double aux = 0;
		for(PaqueteViaje p: this.paquetes) {
			aux+= p.getCosto();
		}
		return aux;
	}

	@Override
	public LocalDate getFechaPago() {
		
		LocalDate mayor = LocalDate.of(2000,1,15);
		
		for(PaqueteViaje p: this.paquetes) {
			if(p.getFechaPago() != null) {
				if(p.getFechaPago().compareTo(mayor) > 0)
					mayor = p.getFechaPago();
				}
			else
				return null;
		}
		return mayor;
	}

	@Override
	public String getOrigen() {
		
		return this.paquetes.get(0).getOrigen();
	}

	@Override
	public String getDestino() {
		return this.paquetes.get(paquetes.size()-1).getDestino();
	}
	
	public void addPaquete(PaqueteViaje p) {
		
		if(p.getCantPersonas() == this.getCantPersonas()) {
			if(p.getOrigen().equals(this.getDestino()))
				this.paquetes.add(p);
	
			if (this.paquetes.isEmpty())
				this.paquetes.add(p);
		}
	}
	
	
	
}
