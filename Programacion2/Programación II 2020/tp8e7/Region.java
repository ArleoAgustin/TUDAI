package tp8e7;

import java.util.ArrayList;

public class Region extends Empresa{
	private ArrayList<Empresa> hijos;
	
	public Region(String nombre) {
		super(nombre);
		hijos = new ArrayList<Empresa>();
	}
	
	@Override
	public ArrayList<String> getEspecialidades(){
		ArrayList<String> retorno = new ArrayList<String>();	
		for(Empresa e: hijos){
			ArrayList<String> aux = e.getEspecialidades();
			for(String s: aux){
				if(!aux.contains(s)){
					retorno.add(s);
				}
			}
		}
		return retorno;
	}

	@Override
	public int cantidadEmpleados(String especialidad){
		int total = 0;
		for(Empresa e: hijos){
			total+=e.cantidadEmpleados(especialidad);
		}
		return total;
	}

	@Override
	public ArrayList<Empleado> tienenEspecialidad(String especialidad) {
		ArrayList<Empleado> aux = new ArrayList<Empleado>();
		for(Empresa e: hijos){
			aux.addAll(e.tienenEspecialidad(especialidad));
		}
		return aux;
	}

	@Override
	public String especialidadMasElegida() {
		String masElegida = " ";
		for(Empresa e: hijos){
			
		}
		return null;
	}
}
