
public class CondicionParaEmplearExclusivo extends CondicionParaEmplear{
	
	public CondicionParaEmplearExclusivo() {
		super();
	}
	
	public boolean sePuedeContratarEmpleado(Empleado empleado, Contrato contrato) {
		return false;
	}
}
