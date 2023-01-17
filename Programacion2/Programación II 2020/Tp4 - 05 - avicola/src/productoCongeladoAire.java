
public class productoCongeladoAire extends productoRefrigerado{
	
	private int porcentajeNitrogeno;
	private int porcentajeOxigeno;
	
	private int porcentajeDioxidocarbono;
	private int porcentajeVaporAgua; 
	
	public productoCongeladoAire(String fechaVencimiento, int numeroLote) {
		super(fechaVencimiento, numeroLote);
	}
	
	public productoCongeladoAire(String fechaVencimiento,int  numeroLote, int porcentajeNitrogeno, int porcentajeOxigeno, int porcentajeDioxidocarbono, int porcentajeVaporAgua) {
		super(fechaVencimiento, numeroLote);
		this.porcentajeNitrogeno = porcentajeNitrogeno;
		this.porcentajeOxigeno = porcentajeOxigeno;
		this.porcentajeDioxidocarbono = porcentajeDioxidocarbono;
		this.porcentajeVaporAgua = porcentajeVaporAgua;
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
				+ "\nPorcentaje de nitrogeno: " + getPorcentajeNitrogeno()
				+ "\nPorcentaje de O2: " + getPorcentajeNitrogeno()
				+ "\nPorcentaje de CO2: " + getPorcentajeDioxidocarbono()
				+ "\nPorcentaje de H2O: " + getPorcentajeVaporAgua());
	}

	public int getPorcentajeNitrogeno() {
		return porcentajeNitrogeno;
	}

	public void setPorcentajeNitrogeno(int porcentajeNitrogeno) {
		this.porcentajeNitrogeno = porcentajeNitrogeno;
	}

	public int getPorcentajeOxigeno() {
		return porcentajeOxigeno;
	}

	public void setPorcentajeOxigeno(int porcentajeOxigeno) {
		this.porcentajeOxigeno = porcentajeOxigeno;
	}

	public int getPorcentajeDioxidocarbono() {
		return porcentajeDioxidocarbono;
	}

	public void setPorcentajeDioxidocarbono(int porcentajeDioxidocarbono) {
		this.porcentajeDioxidocarbono = porcentajeDioxidocarbono;
	}

	public int getPorcentajeVaporAgua() {
		return porcentajeVaporAgua;
	}

	public void setPorcentajeVaporAgua(int porcentajeVaporAgua) {
		this.porcentajeVaporAgua = porcentajeVaporAgua;
	}
}
	
