package TPE2022.Comparadores;

import java.util.Comparator;

import TPE2022.ej3.Elemento;

public class ComparadorCantAlumnos implements Comparator<Elemento> {



	@Override
	public int compare(Elemento e1, Elemento e2) {
		
		return e1.getCantAlumnos() - e2.getCantAlumnos();
	}

}
