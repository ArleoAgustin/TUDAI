package recuperatorio2020;

import java.util.ArrayList;

import recuperatorio2020.Comparador.Comparador;
import recuperatorio2020.ComportamientoSueldo.CalcularSueldo;

public class Programador extends Empleado {

	private ArrayList<String> especialidades;

	public Programador(String nombre, String apellido, int edad, CalcularSueldo calculador) {
		super(nombre, apellido, edad, calculador);
		this.especialidades = new ArrayList<>();
		
	}
	
	public double getSueldo() {
		
		return super.getCalculador().getSueldo();
	}

	@Override
	public ArrayList<String> getEspecialidad() {
		return new ArrayList<>(especialidades);
	}

	public void addEspecialidad(String e) {
		this.especialidades.add(e.toLowerCase());
	}

	@Override
	public ArrayList<Empleado> empleadoOrdenado(Comparador c) {
		ArrayList<Empleado> res = new ArrayList<>();
		res.add(this);
		
		return res;
	}

	@Override
	public int cantEmpleadosAcargo() {
		return 0;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
	

}
