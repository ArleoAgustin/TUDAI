package tp3.ej1;

public class Encuestado {
	
	private int dni;
	
	public Encuestado(int dni) {

		this.dni = dni;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public void llenarEncuesta(Encuesta e) {
		
		if(!e.llenoDosVeces(this))
			e.setPersonaEncuestada(this);
	}
	
	
}
