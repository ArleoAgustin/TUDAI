package TPE2022.Comparadores;


import TPE2022.ej2.Alumno;

public class ComparadorDNI extends ComparadorAlumno{



	public ComparadorDNI() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int comparar(Alumno a1, Alumno a2) {
		return a1.getDni() - a2.getDni();
	}

}
