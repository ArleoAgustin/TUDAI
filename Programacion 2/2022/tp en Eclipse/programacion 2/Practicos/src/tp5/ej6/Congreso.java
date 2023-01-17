package tp5.ej6;

import java.util.ArrayList;

public class Congreso {
	
	private ArrayList<Evaluador> evaluadores = new ArrayList<Evaluador>();
	private ArrayList<Trabajo> trabajos = new ArrayList<Trabajo>();
	private ArrayList<String> temasEspecificos = new ArrayList<String>();

	public Congreso() {
		
	}

	
	public Evaluador puedeSerAsignado(Trabajo t) {
		
		for(Evaluador e: this.evaluadores) {
			if(t.esApto(e))
				return e;
		}
		return null;
	}
	
	public ArrayList<Trabajo> cualCumple(Evaluador e) {
		
		ArrayList<Trabajo> trabajosQadmite = new ArrayList<>();
		
		for(Trabajo t: this.trabajos) {
			if(e.admitoTrabajo(t))
				trabajosQadmite.add(t);
		}
		return trabajosQadmite;
	}
	
	
	public String esExperto(Evaluador e) {
		
		for(String tema: this.temasEspecificos) {
			if (e.getTemasConocidos().contains(tema))
				return "Experto";
		}
		return "General";
	}
	
	
	
	
	public void addEvaluador(Evaluador e) {
		this.evaluadores.add(e);
	}

	public ArrayList<Evaluador> getEvaluadores() {
		return new ArrayList<>(evaluadores);
	}

	public ArrayList<Trabajo> getTrabajos() {
		return new ArrayList<>(trabajos);
	}

	public void addTrabajo(Trabajo t) {
		this.trabajos.add(t);
	}


	
	public ArrayList<String> getTemasEspecificos() {
		return temasEspecificos;
	}


	public void addTemaEspecifico(String t) {
		this.temasEspecificos.add(t);
	}
	
	
	
	
}
