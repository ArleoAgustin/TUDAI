
public class CondicionParaEmplearPorHoras  extends  CondicionParaEmplear{
	
	private int cantidadDeHorasMaximas;
	
	public CondicionParaEmplearPorHoras() {
		super();
	}
	
	public CondicionParaEmplearPorHoras(int cantidadDeHorasMaximas) {
		super();
		this.cantidadDeHorasMaximas = cantidadDeHorasMaximas;
	}
	
	public boolean sePuedeContratarEmpleado(Empleado empleado, Contrato contrato) {
		return contrato.getHoraDeTrabajoSemanal() <= cantidadDeHorasMaximas;
	}

	public int getCantidadDeHorasMaximas() {
		return cantidadDeHorasMaximas;
	}

	public void setCantidadDeHorasMaximas(int cantidadDeHorasMaximas) {
		this.cantidadDeHorasMaximas = cantidadDeHorasMaximas;
	}
	
}
