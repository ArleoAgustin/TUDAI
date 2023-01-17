package recuperatorio2020.Comparador;

import recuperatorio2020.Empleado;

public class ComparadorApellido extends Comparador {
	
	
	public ComparadorApellido() {}



	@Override
	public int compare(Empleado e1, Empleado e2) {
		
		return e1.getApellido().compareTo(e2.getApellido());
	}

}
