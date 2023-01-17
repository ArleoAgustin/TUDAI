package parcial2021;

import java.time.LocalDate;

public abstract class PaqueteViaje {
	
	private int id, cantPersonas;

	public PaqueteViaje(int id, int cantPersonas) {
		super();
		this.id = id;
		this.cantPersonas = cantPersonas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantPersonas() {
		return cantPersonas;
	}

	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
	}
	
	public abstract double getCosto();
	public abstract LocalDate getFechaPago();
	public abstract String getOrigen();
	public abstract String getDestino();
	
	
}
