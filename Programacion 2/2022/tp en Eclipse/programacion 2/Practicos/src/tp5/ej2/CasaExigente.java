package tp5.ej2;

import java.util.ArrayList;

public class CasaExigente extends Casa {
	
	
	public CasaExigente(int cantMaxAlumnos, String nombreCasa) {
		super(cantMaxAlumnos, nombreCasa);
	}
	
	public void addAlumno(Alumno a) {
		

		if(!alumnos.isEmpty()) {
			
			for(Alumno familiar: a.getFamiliares()) {
			
				if(familiar.getCasaPertenece().equals(this)) {
					System.out.println("Es aceptado, "+ familiar.getNombre()+" es familiar");
					super.addAlumno(a);
				}
			}
		}
		else {		
			
			System.out.println("No hay alumnos en la casa, es aceptado");
			super.addAlumno(a);
		}
	}
}
