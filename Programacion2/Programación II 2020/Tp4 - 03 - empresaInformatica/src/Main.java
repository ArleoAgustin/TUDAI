
public class Main {

	public static void main(String[] args) {
		/*3 - Sueldos 
		 * Una empresa de informática posee tres tipos de empleados.
		 * Los empleados contratados reciben un salario fijo semanal, sin
		 * importar la cantidad de horas trabajadas. Los empleados por horas
		 * extras reciben un monto fijo semanal más un monto extra por cada hora
		 * trabajada. Finalmente, los empleados por comisión reciben un sueldo
		 * fijo, más un porcentaje por la cantidad de ventas realizadas.
		 * Implementar un sistema que permita saber cuánto se le debe pagar a un
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
