package tp8e7;

import java.util.ArrayList;

public class Grupo extends Empresa{
	private ArrayList<Empleado> empleados;
	
	public Grupo(String nombre){
		super(nombre);
		empleados = new ArrayList<Empleado>();
	}
	
	//Esto no lo pide, es un ejemplo de como se devuelve un array
	/*public ArrayList<Empleado> getEmpleados(){
		return new ArrayList<Empleado>(this.empleados);
	}*/
	
	@Override
	public ArrayList<String> getEspecialidades(){
		ArrayList<String> aux = new ArrayList<>();
		for(Empleado e: empleados){
			if(!aux.contains(e.getEspecialidad()))
				aux.add(e.getEspecialidad());
		}
		return aux;
	}
	
	@Override
	public int cantidadEmpleados(String especialidad){
		int total = 0; 
		for(Empleado e: empleados){
			if(e.tieneEspecialidad(especialidad)){ //Asi lo quiere Luis
				total++;
			}
		}
		return total;
	}

	@Override
	public ArrayList<Empleado> tienenEspecialidad(String especialidad) {
		ArrayList<Empleado> aux = new ArrayList<Empleado>();
		for(Empleado e: empleados){
			if(e.tieneEspecialidad(especialidad)){
				aux.add(e);
			}		
		}
		return aux;
	}

	@Override
	public String especialidadMasElegida(){
		ArrayList<String> aux = this.getEspecialidades();
		int mayor = 0;
		String mayorEspecialidad = " ";
		for(int i=0; i<aux.size();i++){
			int numero = this.cantidadEmpleados(aux.get(i));
			if(numero>mayor){
				mayor = numero;
				mayorEspecialidad = aux.get(i);
			}
		}
		return mayorEspecialidad;
	}
}
