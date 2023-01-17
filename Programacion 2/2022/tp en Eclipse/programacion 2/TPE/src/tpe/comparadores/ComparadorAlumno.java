package tpe.comparadores;

import java.util.Comparator;

import tpe.Alumno;



public abstract class ComparadorAlumno implements Comparator<Alumno>{

private ComparadorAlumno siguiente;
	
	public ComparadorAlumno() { 
		this.siguiente = null;
		
	}
	
	public ComparadorAlumno(ComparadorAlumno sig) {
		this.siguiente = sig;
	}
	
	public abstract int comparar(Alumno a1, Alumno a2);
	
	
	@Override
	public int compare(Alumno a1, Alumno a2) {
		
		int res = this.comparar(a1, a2);
		if(res == 0) {
			if(siguiente!=null) 
				return siguiente.compare(a1, a2);
			else
				return 0;
		}
		return res;
	}
}
