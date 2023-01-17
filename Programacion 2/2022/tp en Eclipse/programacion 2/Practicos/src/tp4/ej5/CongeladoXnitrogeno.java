package tp4.ej5;

import java.time.LocalDate;

public class CongeladoXnitrogeno extends ProductoRefrigerado {
	
	private String infoMetodoCongelacion;
	private double tiempoExposicion;

	public CongeladoXnitrogeno(LocalDate fechaVencimiento, int nroLote, String info, LocalDate fechaEnvasado,
			String granjaOrigen, int codigoOSA, double tempMatenimiento, String infoMetodoCongelacion,
			double tiempoExposicion) {
		
		super(fechaVencimiento, nroLote, info, fechaEnvasado, granjaOrigen, codigoOSA, tempMatenimiento);
		this.infoMetodoCongelacion = infoMetodoCongelacion;
		this.tiempoExposicion = tiempoExposicion;
	}

	public String getInfoMetodoCongelacion() {
		return infoMetodoCongelacion;
	}

	public void setInfoMetodoCongelacion(String infoMetodoCongelacion) {
		this.infoMetodoCongelacion = infoMetodoCongelacion;
	}

	public double getTiempoExposicion() {
		return tiempoExposicion;
	}

	public void setTiempoExposicion(double tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}

	
	@Override
	public String toString() {
		return super.toString() +
				"CongeladoXnitrogeno [infoMetodoCongelacion=" + infoMetodoCongelacion + ", tiempoExposicion="
				+ tiempoExposicion + "]";
	}
	
	
}
