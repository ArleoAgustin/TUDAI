package tp3.ej1;

import java.util.ArrayList;

public class Compania {
	
	private ArrayList<Encuesta> encuestas = new ArrayList<Encuesta>();

	public Compania() {
	
	}
	
	public int numeroDeEncuestasXEmpleado(Empleado emp) {
		
		return emp.getCantEncuestasRealizadas();
	}
	
	public void addEncuesta(Encuesta e) {
		
		if(e.encuestaValida())
			this.encuestas.add(e);
	}

	
	public ArrayList<Encuesta> getEncuestas() {
		return encuestas;
	}

	@Override
	public String toString() {
		return "Compania [encuestas=" + encuestas + "]";
	}
	
	
	
	
	
}
