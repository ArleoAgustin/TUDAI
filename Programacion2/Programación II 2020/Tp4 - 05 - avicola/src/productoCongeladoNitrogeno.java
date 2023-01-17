
public class productoCongeladoNitrogeno  extends productoRefrigerado{
	
	private String metodoCongelacion;
	private int tiempoExposicionNitrogeno;
	
	public productoCongeladoNitrogeno(String fechaVencimiento, int numeroLote) {
		super(fechaVencimiento, numeroLote);
	}
	
	public productoCongeladoNitrogeno(String fechaVencimiento, int numeroLote, String metodoCongelacion, int tiempoExposicionNitrogeno) {
		super(fechaVencimiento, numeroLote);
		this.metodoCongelacion = metodoCongelacion;
		this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
	}
	
	public void imprimirDatos() {
		System.out.println("Producto Avicola\nFecha de vencimiento: "
				+ getFechaVencimiento() + "\nNumero de lote: "
				+ getNumeroLote() + "\nFecha de envasado: "
				+ getFechaEnvasado() + "\nGranja de orígen: "
				+ getGranjaOrigen() + "\nCódigo de oirganismo upervisor: "
				+ getCodigodeOrganismoSupervisionAlimentaria()
				+ "\nTemperatura de mantenmimiento: "
				+ getTemperaturaMantenimientoRecomendada()
				+ "\nMetodo de congelación: " + getMetodoCongelacion()
				+ "\nTiempo de exposición al nitróeno"
				+ getTiempoExposicionNitrogeno() );
	}

	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}

	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}

	public int getTiempoExposicionNitrogeno() {
		return tiempoExposicionNitrogeno;
	}

	public void setTiempoExposicionNitrogeno(int tiempoExposicionNitrogeno) {
		this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
	}
}
