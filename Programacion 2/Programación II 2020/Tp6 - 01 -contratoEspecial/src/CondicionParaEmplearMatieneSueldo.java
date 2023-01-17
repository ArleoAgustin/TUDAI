
public class CondicionParaEmplearMatieneSueldo extends CondicionParaEmplear{
	
	public CondicionParaEmplearMatieneSueldo() {
		super();
	}
	
	public boolean sePuedeContratarEmpleado(Empleado empleado, Contrato contrato) {
		return contrato.getSueldo() >= empleado.getSueldo();
	}
}