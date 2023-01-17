
public class productoFresco extends productoAvicola{
	
	private String fechaEnvasado;
	private String granjaOrigen;
	
	public productoFresco (String fechaVencimiento,int  numeroLote) {
		super(fechaVencimiento, numeroLote);
	}
	
	public productoFresco (String fechaVencimiento,int  numeroLote, String fechaEnvasado, String granjaOrigen) {
		super(fechaVencimiento, numeroLote);
		this.fechaEnvasado = fechaEnvasado;
		this.granjaOrigen  = granjaOrigen;
	}
	
	public void imprimirDatos() {
		System.out.println("Producto Avicola\nFecha de vencimiento: "
				+ getFechaVencimiento() + "\nNumero de lote: "
				+ getNumeroLote() + "\nFecha de envasado: "
				+ getFechaEnvasado() + "\nGranja de orígen: "
				+ getGranjaOrigen());
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getGranjaOrigen() {
		return granjaOrigen;
	}

	public void setGranjaOrigen(String granjaOrigen) {
		this.granjaOrigen = granjaOrigen;
	}
}
