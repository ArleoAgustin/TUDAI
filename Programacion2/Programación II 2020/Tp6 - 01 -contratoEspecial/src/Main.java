
public class Main {
	public static void main(String[] args) {
		Consultora consultora = new Consultora();
		
		Empleado empleado = new Empleado("Juan", "EmpresaMAX", 24000);
		Contrato contrato = new Contrato("EmpresaMax", 8, 24000);
		
		CondicionParaEmplear condicion1 = new CondicionParaEmplearMatieneSueldo();
		CondicionParaEmplear condicion2 = new CondicionParaEmplearPorHoras(8);
		CondicionParaEmplear condicion3 = new CondicionParaEmplearExclusivo();
		CondicionParaEmplear condicion4 = new CondicionParaEmplearCambiaEmpresas();
		
		empleado.cambiarCondicion(condicion1);
		System.out.println("El "+empleado+" acepta el "+contrato+" : "+empleado.sePuedeContratarEmpleado(contrato));
		empleado.cambiarCondicion(condicion2);
		System.out.println("El "+empleado+" acepta el "+contrato+" : "+empleado.sePuedeContratarEmpleado(contrato));
		empleado.cambiarCondicion(condicion3);
		System.out.println("El "+empleado+" acepta el "+contrato+" : "+empleado.sePuedeContratarEmpleado(contrato));
		empleado.cambiarCondicion(condicion4);
		System.out.println("El "+empleado+" acepta el "+contrato+" : "+empleado.sePuedeContratarEmpleado(contrato));
		
		empleado.cambiarCondicion(condicion4);
		
		consultora.addContrato(contrato);
		consultora.addEmpleado(empleado);
		
		System.out.println(consultora.obtenerEmpleadosParaContrato(contrato));
	}
}
