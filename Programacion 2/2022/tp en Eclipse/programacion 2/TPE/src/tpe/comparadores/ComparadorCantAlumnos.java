package tpe.comparadores;

import java.util.Comparator;

import tpe.Elemento;


public class ComparadorCantAlumnos implements Comparator<Elemento> {



	@Override
	public int compare(Elemento e1, Elemento e2) {
		
		return e1.getCantAlumnos() - e2.getCantAlumnos();
	}

}
