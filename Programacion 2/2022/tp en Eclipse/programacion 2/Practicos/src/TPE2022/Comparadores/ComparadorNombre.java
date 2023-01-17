package TPE2022.Comparadores;

import TPE2022.ej2.Alumno;

public class ComparadorNombre extends ComparadorAlumno {



	public ComparadorNombre(ComparadorAlumno sig) {
		super(sig);
		
	}

	@Override
	public int comparar(Alumno a1, Alumno a2) {
		return a1.getNombre().compareTo(a2.getNombre());
	}

}