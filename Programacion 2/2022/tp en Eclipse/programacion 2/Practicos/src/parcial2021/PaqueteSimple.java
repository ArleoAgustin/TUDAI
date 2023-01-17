package parcial2021;

import java.time.LocalDate;

public class PaqueteSimple extends PaqueteViaje {
	
	private String datos, origen, destino;
	private double costo;
	private LocalDate fechaPago;
	
	public PaqueteSimple(int id, int cantPersonas, String datos, String origen, String destino, double costo,
			LocalDate fechaPago) {
		
		super(id, cantPersonas);
		this.datos = datos;
		this.origen = origen;
		this.destino = destino;
		this.costo = costo;
		this.fechaPago = fechaPago;
	}

	@Override
	public double getCosto() {return this.costo;}

	@Override
	public LocalDate getFechaPago() {return this.fechaPago;}

	@Override
	public String getOrigen() {return this.origen;}

	@Override
	public String getDestino() {return this.destino;}
	
	
	
	
}
