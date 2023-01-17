package tpe.comparadores;

import tpe.Alumno;

public class ComparadorApellido extends ComparadorAlumno{
	
	

	public ComparadorApellido(ComparadorAlumno sig) {
		super(sig); 
		
	}

	@Override
	public int comparar(Alumno a1, Alumno a2) {
		
		return a1.getApellido().compareTo(a2.getApellido());
		
	}

}
