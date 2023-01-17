
public class Turno {
	
	private String nombreCliente;
	private String nombrePeluquero;
	private double turnoInicio;
	private double turnoFin;
	private double turnoDuracion;
	private boolean descuento;

	public Turno(String nombreCliente, String nombrePeluquero, double turnoInicio, double turnoDuracion, boolean descuento) {
		this.nombreCliente = nombreCliente;
		this.nombrePeluquero = nombrePeluquero;
		this.turnoInicio = turnoInicio;
		this.turnoDuracion = turnoDuracion;
		this.descuento = descuento;
		//this.turnoFin = calcularFinTurno();
	}

	public double calcularFinTurno() {
		return getTurnoInicio() + getTurnoDuracion();
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNombrePeluquero() {
		return nombrePeluquero;
	}

	public void setNombrePeluquero(String nombrePeluquero) {
		this.nombrePeluquero = nombrePeluquero;
	}

	public double getTurnoInicio() {
		return turnoInicio;
	}

	public void setTurnoInicio(double turnoInicio) {
		this.turnoInicio = turnoInicio;
	}

	public double getTurnoFin() {
		return turnoFin;
	}

	public void setTurnoFin(double turnoFin) {
		this.turnoFin = turnoFin;
	}

	public double getTurnoDuracion() {
		return turnoDuracion;
	}

	public void setTurnoDuracion(double turnoDuracion) {
		this.turnoDuracion = turnoDuracion;
	}

	public boolean isDescuento() {
		return descuento;
	}

	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}

}
