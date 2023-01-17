package recuperatorio2020.Comparador;

import recuperatorio2020.Empleado;

public class ComparadorNombre extends Comparador {

	
	
	public ComparadorNombre() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Empleado e1, Empleado e2) {
	
		return e1.getNombre().compareTo(e2.getNombre());
	}

}
