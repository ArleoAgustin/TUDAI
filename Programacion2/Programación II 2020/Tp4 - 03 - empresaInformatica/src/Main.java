
public class Main {

	public static void main(String[] args) {
		/*3 - Sueldos 
		 * Una empresa de inform�tica posee tres tipos de empleados.
		 * Los empleados contratados reciben un salario fijo semanal, sin
		 * importar la cantidad de horas trabajadas. Los empleados por horas
		 * extras reciben un monto fijo semanal m�s un monto extra por cada hora
		 * trabajada. Finalmente, los empleados por comisi�n reciben un sueldo
		 * fijo, m�s un porcentaje por la cantidad de ventas realizadas.
		 * Implementar un sistema que permita saber cu�nto se le debe pagar a un
		 * empleado al finalizar la semana.
		 */
		
		Empleado empleado1 = new Empleado("Juan");
		EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("Jose", 5);
		EmpleadoPorComision empleado3 = new EmpleadoPorComision("Bip bop bip soy humano", 3589.67);
		 
		empleado1.cuantoCobro();
		empleado2.cuantoCobro();
		empleado3.cuantoCobro();

	}

}
