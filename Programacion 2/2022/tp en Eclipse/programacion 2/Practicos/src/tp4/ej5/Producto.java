package tp4.ej5;

import java.time.LocalDate;

public class Producto {
	
	private LocalDate fechaVencimiento;
	private int nroLote;
	private String info;
	
	public Producto(LocalDate fechaVencimiento, int nroLote, String info) {
	
		this.fechaVencimiento = fechaVencimiento;
		this.nroLote = nroLote;
		this.info = info;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getNroLote() {
		return nroLote;
	}

	public void setNroLote(int nroLote) {
		this.nroLote = nroLote;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}


	@Override
	public String toString() {
		
		return "Producto [fechaVencimiento=" + fechaVencimiento + ", nroLote=" + nroLote + ", info=" + info + "]";
	}
	
	
	
}
