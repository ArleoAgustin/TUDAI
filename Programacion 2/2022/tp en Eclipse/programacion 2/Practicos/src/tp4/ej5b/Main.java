package tp4.ej5b;

public class Main {

	public static void main(String[] args) {
		
		Empresa e = new Empresa();
		
		Persona p = new Persona("Agustin","Arleo","Programador",22);
		
		Empleado p2 = new Empleado("Gonzalo","Gaete","Conductor",22,2409);
		
		Empleado p5 = new Empleado("Lucas","Duana","inutil",20,5555);
		
		Usuario p3 = new Usuario("Bautista","Keegan","Leniador",22, "Agustin_Arleo", "123");
		
		Jerarquico p4 = new Jerarquico("Leandro","Pagano","Chacarero",22,2409);
	
		
		p4.addEmpleadoo(p2);
		p4.addEmpleadoo(p5);
		
		e.addEmpleado(p);
		e.addEmpleado(p2);
		e.addEmpleado(p3);
		e.addEmpleado(p5);
		e.addEmpleado(p4);
		
		
		e.imprimirAsociados();
	}

}
