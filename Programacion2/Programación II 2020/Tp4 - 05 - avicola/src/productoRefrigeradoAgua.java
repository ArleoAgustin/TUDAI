
public class productoRefrigeradoAgua  extends productoRefrigerado{
	
	public double salidadDeAguagramos;
	
	public productoRefrigeradoAgua(String fechaVencimiento, int numeroLote) {
		super(fechaVencimiento, numeroLote);
	}
	
	public productoRefrigeradoAgua(String fechaVencimiento, int numeroLote, double salidadDeAguagramos) {
		super(fechaVencimiento, numeroLote);
		this.salidadDeAguagramos = salidadDeAguagramos;
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
				+ "\nSalinidad de agua" + getSalidadDeAguagramos());
	}

	public double getSalidadDeAguagramos() {
		return salidadDeAguagramos;
	}

	public void setSalidadDeAguagramos(double salidadDeAguagramos) {
		this.salidadDeAguagramos = salidadDeAguagramos;
	}
	
	
}
