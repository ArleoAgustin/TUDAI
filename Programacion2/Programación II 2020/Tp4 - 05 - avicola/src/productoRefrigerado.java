
public class productoRefrigerado extends productoFresco {
	
	private int codigodeOrganismoSupervisionAlimentaria;
	private double temperaturaMantenimientoRecomendada;
	
	public productoRefrigerado (String fechaVencimiento,int  numeroLote) {
		super(fechaVencimiento, numeroLote);
	}
	
	public void imprimirDatos() {
		System.out.println("Producto Avicola\nFecha de vencimiento: "
				+ getFechaVencimiento() + "\nNumero de lote: "
				+ getNumeroLote() + "\nFecha de envasado: "
				+ getFechaEnvasado() + "\nGranja de orígen: "
				+ getGranjaOrigen() + "\nCódigo de oirganismo upervisor: "
				+ getCodigodeOrganismoSupervisionAlimentaria()
				+ "\nTemperatura de mantenmimiento: "
				+ getTemperaturaMantenimientoRecomendada());
	}

	public int getCodigodeOrganismoSupervisionAlimentaria() {
		return codigodeOrganismoSupervisionAlimentaria;
	}

	public void setCodigodeOrganismoSupervisionAlimentaria(
			int codigodeOrganismoSupervisionAlimentaria) {
		this.codigodeOrganismoSupervisionAlimentaria = codigodeOrganismoSupervisionAlimentaria;
	}

	public double getTemperaturaMantenimientoRecomendada() {
		return temperaturaMantenimientoRecomendada;
	}

	public void setTemperaturaMantenimientoRecomendada(
			double temperaturaMantenimientoRecomendada) {
		this.temperaturaMantenimientoRecomendada = temperaturaMantenimientoRecomendada;
	}
	
}
