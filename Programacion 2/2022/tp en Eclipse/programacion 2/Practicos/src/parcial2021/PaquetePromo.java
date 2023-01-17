package parcial2021;

import java.time.LocalDate;

public class PaquetePromo extends PaqueteSimple {
	
	private double porcentajeDesc;
	private LocalDate fFin, fInicio;
	
	public PaquetePromo(int id, int cantPersonas, String datos, String origen, String destino, double costo,
			LocalDate fechaPago, double porcentajeDesc, LocalDate fFin, LocalDate fInicio) {
		super(id, cantPersonas, datos, origen, destino, costo, fechaPago);
		this.porcentajeDesc = porcentajeDesc;
		this.fFin = fFin;
		this.fInicio = fInicio;
	}
	
	public double getCosto() {
		
		if(this.esVigente())
			return super.getCosto() /100 * this.porcentajeDesc;

		return super.getCosto();
	}
	
	public boolean esVigente() {
		
		if(this.getFechaPago().isAfter(fInicio) && this.getFechaPago().isBefore(fFin))
			return true;
		
		return false;
	}
}
