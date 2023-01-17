package recuperatorio2020.Comparador;

import recuperatorio2020.Empleado;

public class ComparadorCompuesto extends Comparador {
	
	private Comparador c1, c2;
	
	
	public ComparadorCompuesto(Comparador c1, Comparador c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}


    public int compare(Empleado e1, Empleado e2) {
        
    	int aux = c1.compare(e1,e2);
        
    	if (aux == 0)
            return c2.compare(e1,e2);
        else return aux;
    }
}
