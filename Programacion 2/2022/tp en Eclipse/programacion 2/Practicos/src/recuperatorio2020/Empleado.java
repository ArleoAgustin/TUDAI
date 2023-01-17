package recuperatorio2020;

import java.util.ArrayList;

import recuperatorio2020.Comparador.Comparador;
import recuperatorio2020.ComportamientoSueldo.CalcularSueldo;

public abstract class Empleado {
	
	private String nombre, apellido;
	private int edad;
	
	private CalcularSueldo calculador;
	
	public Empleado(String nombre, String apellido, int edad, CalcularSueldo calculador) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.calculador = calculador;

	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getEdad() {return edad;}

	public void setEdad(int edad) {this.edad = edad;}
	
	
	public CalcularSueldo getCalculador() {return calculador;}

	public void setCalculador(CalcularSueldo calculador) {this.calculador = calculador;}

	public abstract double getSueldo();
	
	public abstract ArrayList<String> getEspecialidad();
	
	public abstract ArrayList<Empleado> empleadoOrdenado(Comparador c);
	
	public abstract int cantEmpleadosAcargo();


	
    @Override
	public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}'+"\n";
    }
	
}
