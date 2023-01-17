package tp4.ej5;

import java.time.LocalDate;

public class CongeladoXAgua extends ProductoRefrigerado {
	
	private double gramosDeSalXlitroDeAgua;

	public CongeladoXAgua(LocalDate fechaVencimiento, int nroLote, String info, LocalDate fechaEnvasado,
			String granjaOrigen, int codigoOSA, double tempMatenimiento, double gramosDeSalXlitroDeAgua) {
		
		super(fechaVencimiento, nroLote, info, fechaEnvasado, granjaOrigen, codigoOSA, tempMatenimiento);
		this.gramosDeSalXlitroDeAgua = gramosDeSalXlitroDeAgua;
	}

	public double getGramosDeSalXlitroDeAgua() {
		return gramosDeSalXlitroDeAgua;
	}

	public void setGramosDeSalXlitroDeAgua(double gramosDeSalXlitroDeAgua) {
		this.gramosDeSalXlitroDeAgua = gramosDeSalXlitroDeAgua;
	}

	
	@Override
	public String toString() {
		return super.toString() + "CongeladoXAgua [gramosDeSalXlitroDeAgua=" + gramosDeSalXlitroDeAgua + "]";
	}
	
	
}
