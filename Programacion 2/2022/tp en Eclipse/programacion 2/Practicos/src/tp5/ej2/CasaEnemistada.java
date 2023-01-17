package tp5.ej2;

public class CasaEnemistada extends Casa {
	
	private Casa casaEmemiga;

	public CasaEnemistada(int cantMaxAlumnos, String nombreCasa, Casa casaEmemiga) {
		super(cantMaxAlumnos, nombreCasa);
		this.casaEmemiga = casaEmemiga;
	}
	
	
	//alumno no puede ser aceptado por la casa enemiga
	
	public void addAlumno(Alumno a) {
		
		if(!a.tieneCualidades(casaEmemiga)) {
			super.addAlumno(a);
		}
		else {
			System.out.println("El alumno "+ a.getNombre()+ " tiene las cualidades de la casa enemiga");
		}
		
	}
	
}
