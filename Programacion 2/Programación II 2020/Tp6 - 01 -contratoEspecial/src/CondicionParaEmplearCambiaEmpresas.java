
public class CondicionParaEmplearCambiaEmpresas extends CondicionParaEmplear{
	
	public CondicionParaEmplearCambiaEmpresas() {
		super();
	}
	
	@Override
	public boolean sePuedeContratarEmpleado(Empleado empleado, Contrato contrato) {
		return empleado.getEmpresa() == contrato.getEmpresa();
	}
}
