package recuperatorio2020;

import recuperatorio2020.Comparador.ComparadorApellido;
import recuperatorio2020.Comparador.ComparadorCompuesto;
import recuperatorio2020.Comparador.ComparadorNombre;
import recuperatorio2020.ComportamientoSueldo.CalcularSueldo;
import recuperatorio2020.ComportamientoSueldo.SueldoFijo;
import recuperatorio2020.ComportamientoSueldo.SueldoPorHora;

public class Main {

	public static void main(String[] args) {
		
		Empresa Empresa = new Empresa();

		CalcularSueldo c1 = new SueldoFijo(140000);
		CalcularSueldo c2 = new SueldoPorHora(2000, 5);
		
		Programador Agustin = new Programador("Agustin", "Arleo", 22, c2);
		
		Agustin.addEspecialidad("GO");
		Agustin.addEspecialidad("JS");
		Agustin.addEspecialidad("JAVA");
		
		Programador Gonzalo = new Programador("Gonzalo","Gaete", 22, c1);
		
		Gonzalo.addEspecialidad("Phyton");
		Gonzalo.addEspecialidad("GO");
		Gonzalo.addEspecialidad("Angular");
		
		Programador Kako = new Programador("Kako","Chirolita", 18, c2);
		
		Kako.addEspecialidad("PHP");
		Kako.addEspecialidad("C++");
		
		
		EmpleadoACargo Bautista = new EmpleadoACargo("Bautista", "Keegan", 22, c1);
		
		Bautista.addPersonalAcargo(Gonzalo);
		Bautista.addPersonalAcargo(Agustin);
		
		EmpleadoACargo Leandro = new EmpleadoACargo("Leandro", "Pagano", 23, c1);
		
		Leandro.addPersonalAcargo(Bautista);
		
		EmpleadoACargo Lucas = new EmpleadoACargo("Lucas", "Duana", 22, c1);
		
		Lucas.addPersonalAcargo(Kako);
		Lucas.addPersonalAcargo(Leandro);
		
		
		EmpleadoACargoEspecial Duki = new EmpleadoACargoEspecial("Duki","PZK",24, c1);
		
		Duki.addPersonalAcargo(Lucas);
		
		
		System.out.println("Empleados a cargo: "+Duki.cantEmpleadosAcargo());
	
		System.out.println("Especialidades: "+Duki.getEspecialidad());
		
		System.out.println("Sueldo: "+Duki.getSueldo());
		
		Empresa.addEmpleado(Duki);
		Empresa.addEmpleado(Lucas);
		
		System.out.println(Duki.empleadoOrdenado(new ComparadorCompuesto(new ComparadorApellido(), new ComparadorNombre())));
	}

}
