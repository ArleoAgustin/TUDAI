package tp4.ej5;

import java.time.LocalDate;

public class ProductoFresco extends Producto {
	
	private LocalDate fechaEnvasado;
	private String granjaOrigen;
	
	public ProductoFresco(LocalDate fechaVencimiento, int nroLote, String info, LocalDate fechaEnvasado,
			String granjaOrigen) {
	
		super(fechaVencimiento, nroLote, info);
		this.fechaEnvasado = fechaEnvasado;
		this.granjaOrigen = granjaOrigen;
	}

	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getGranjaOrigen() {
		return granjaOrigen;
	}

	public void setGranjaOrigen(String granjaOrigen) {
		this.granjaOrigen = granjaOrigen;
	}

	
	@Override
	public String toString() {
		
		return super.toString() + "[fechaEnvasado=" + fechaEnvasado + ", granjaOrigen=" + granjaOrigen + "]";
	}
	
	
	
}
