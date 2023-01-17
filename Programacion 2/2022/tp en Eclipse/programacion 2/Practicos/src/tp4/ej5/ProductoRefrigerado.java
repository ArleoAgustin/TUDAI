package tp4.ej5;

import java.time.LocalDate;

public class ProductoRefrigerado extends ProductoFresco {
	
	private int codigoOSA;
	private double tempMatenimiento;
	
	public ProductoRefrigerado(LocalDate fechaVencimiento, int nroLote, String info, LocalDate fechaEnvasado,
			String granjaOrigen, int codigoOSA, double tempMatenimiento) {
		
		super(fechaVencimiento, nroLote, info, fechaEnvasado, granjaOrigen);
		this.codigoOSA = codigoOSA;
		this.tempMatenimiento = tempMatenimiento;
	}
	
	
	public int getCodigoOSA() {
		return codigoOSA;
	}
	
	public void setCodigoOSA(int codigoOSA) {
		this.codigoOSA = codigoOSA;
	}
	
	public double getTempMatenimiento() {
		return tempMatenimiento;
	}
	
	public void setTempMatenimiento(double tempMatenimiento) {
		this.tempMatenimiento = tempMatenimiento;
	}


	@Override
	public String toString() {
		return super.toString() + "[codigoOSA=" + codigoOSA + ", tempMatenimiento=" + tempMatenimiento + "]";
	} 

	
	
}
