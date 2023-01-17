package tp3.ej1;

import java.util.ArrayList;

public class Encuesta {
	
	private ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();
	private ArrayList<Encuestado> personasEncuestadas = new ArrayList<Encuestado>();
	private Encuestado personaEncuestada = null;
	private Empleado encuestador;
	
	public Encuesta(Empleado encuestador) {
	
		this.encuestador = encuestador;
	}
	
	
	public boolean encuestaValida() {
		return this.personaEncuestada != null;
	}

	public Encuestado getPersonaEncuestada() {
		return personaEncuestada;
	}

	public void setPersonaEncuestada(Encuestado personaEncuestada) {
		
		this.personaEncuestada = personaEncuestada;
		this.personasEncuestadas.add(personaEncuestada);
	}

	public Empleado getEncuestador() {
		return encuestador;
	}

	public void setEncuestador(Empleado encuestador) {
		this.encuestador = encuestador;
		
	}
	
	public void addEncuestaAencuestador() {
		this.encuestador.incrementarEncuestas();
		
	}
	 
	public void addPregunta(Pregunta p) {
		
		this.preguntas.add(p);
	}
	
	

	public ArrayList<Encuestado> getPersonasEncuestadas() {
		return personasEncuestadas;
	}


	public boolean llenoDosVeces(Encuestado pe) {

		for(Encuestado e: this.personasEncuestadas){
			if(e.getDni() == pe.getDni())
				return true;	
		}
		this.addEncuestaAencuestador();
		return false;
	}
	
}
