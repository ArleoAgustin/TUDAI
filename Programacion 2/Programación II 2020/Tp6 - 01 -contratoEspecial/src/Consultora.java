import java.util.ArrayList;

public class Consultora {
	
	private ArrayList<Empleado> empleados;
	private ArrayList<Contrato> contratos;
	
	public Consultora() {
		empleados = new ArrayList<Empleado>();
		contratos = new ArrayList<Contrato>();
	}
	
	public void addEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public void addContrato(Contrato contrato) {
		contratos.add(contrato);
	}
	
	public String obtenerEmpleadosParaContrato(Contrato contrato) {
		for (Empleado empleado : empleados) {
			if(empleado.sePuedeContratarEmpleado(contrato)) {
				return (empleado.toString());
			}
		}
		return empleados.get(0).toString();
	}
}
