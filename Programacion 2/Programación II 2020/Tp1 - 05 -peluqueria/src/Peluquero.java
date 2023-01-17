import java.util.ArrayList;

public class Peluquero {
	private String nombre;
	private ArrayList<Turno> turnos = new ArrayList<Turno>();
	
	public Peluquero() {
		this.nombre = "N n";
	}

	public Peluquero(String nombre, Peluqueria peluqueria) {
		this.nombre = nombre;
		peluqueria.contratarPeluquero(this);
	}
	
	public void pedirTurno(String nombreCliente, boolean tieneDescuento) {
		Turno nuevoTurno = new Turno(nombreCliente, getNombre(), encontrarHorarioDisponible(), 23.99, tieneDescuento);
		anadirTurno(nuevoTurno);
	}
	public void anadirTurno(Turno turno) {
		getTurnos().add(turno);
	}
	
	public double encontrarHorarioDisponible() {
		double horaInicioNuevoTurno = 0;
		 for (Turno turno : turnos) {
			double horaFinUltimoTurno = turno.calcularFinTurno();
			if (horaInicioNuevoTurno < horaFinUltimoTurno && horaFinUltimoTurno < 24.0) {
				horaInicioNuevoTurno = horaFinUltimoTurno;
			}
		}
		 return horaInicioNuevoTurno;
	}
	
	public String getNombre() {
		return nombre;
	}

	public ArrayList<Turno> getTurnos() {
		return new ArrayList<Turno>(turnos);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setTurnos(ArrayList<Turno> turnos) {
		this.turnos = turnos;
	}
}
