package recuperatorio2020.Comparador;

import java.util.Comparator;

import recuperatorio2020.Empleado;

public abstract class Comparador implements Comparator<Empleado>{
	
	public abstract int compare(Empleado e1, Empleado e2);
}
