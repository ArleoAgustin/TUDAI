
public class productoAvicola {
	
	private String fechaVencimiento;
	private int numeroLote;
	
	public productoAvicola(String fechaVencimiento,int  numeroLote) {
		this.fechaVencimiento = fechaVencimiento;
		this.numeroLote = numeroLote;
	}
	
	public void imprimirDatos() {
		System.out.println("Producto Avicola\nFecha de vencimiento: "
				+ getFechaVencimiento() + "\nNumero de lote: "
				+ getNumeroLote());
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
}
