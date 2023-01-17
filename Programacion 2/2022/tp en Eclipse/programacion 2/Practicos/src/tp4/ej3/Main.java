package tp4.ej3;



public class Main {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado(10000);
		Empleado e2 = new EmpleadoXhorasExtas(10000,3);
		Empleado e3 = new EmpleadoXComision(5000, 5);
		
		Empresa emp = new Empresa();
		emp.addEmpleado(e1);
		emp.addEmpleado(e2);
		emp.addEmpleado(e3);
		
		System.out.println(e3);
		System.out.println(emp.sueldoPorEmpleado(e3));
	}

}
