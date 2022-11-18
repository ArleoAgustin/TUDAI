import java.util.ArrayList;

public class Peluqueria {
	private ArrayList<Peluquero> peluqueros = new ArrayList<Peluquero>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Turno> turnos = new ArrayList<Turno>();
	private Peluquero peluquero1 = new Peluquero("Robero", this);
	private Peluquero peluquero2 = new Peluquero("Jan", this);
	private Peluquero peluquero3 = new Peluquero("Bip bop Bip 3000", this);
	private Peluquero peluquero4 = new Peluquero("Jose", this);

	public void pedirTurno(String nombreCliente, boolean tieneDescuento) {
		peluqueros.get(encontrarPeluqueroDisponinle()).pedirTurno(nombreCliente, tieneDescuento);
	}

	public int encontrarPeluqueroDisponinle() {
		ArrayList<Peluquero> peluqueros = getPeluqueros();
		int numeroPeluquero = 0;
		double horaInicioNuevoTurno = 0;
		for (int i = 0; i < peluqueros.size(); i++) {
			double horaFinUltimoTurno = peluqueros.get(i).encontrarHorarioDisponible();
			if (horaInicioNuevoTurno < horaFinUltimoTurno){
				if (horaFinUltimoTurno < horaInicioNuevoTurno && horaFinUltimoTurno < 24.0) {
					horaInicioNuevoTurno = horaFinUltimoTurno;
					numeroPeluquero = i;
				}
			}
		}
		return numeroPeluquero;
	}

	public int encontrarPeluqueroSeleccionado(String nombrePeluquero) {
		ArrayList<Peluquero> peluqueros = getPeluqueros();
		int numeroPeluquero = -1;
		boolean encontrarPeluquero = false;
		for (Peluquero peluquero : peluqueros) {
			if (encontrarPeluquero == false) {
				if (peluquero.getNombre().equals(nombrePeluquero)) {
					encontrarPeluquero = true;
					numeroPeluquero++;
				}
			}
		}
		return numeroPeluquero;
	}
	
	public ArrayList<Peluquero> getPeluqueros() {
		return new ArrayList<Peluquero>(peluqueros);
	}

	public ArrayList<Cliente> getClientes() {
		return new ArrayList<Cliente>(clientes);
	}

	public ArrayList<Turno> getTurnos() {
		return new ArrayList<Turno>(turnos);
	}

	public void contratarPeluquero(Peluquero nuevoPeluquero) {
		peluqueros.add(nuevoPeluquero);
	}

	public Peluquero getPeluquero1() {
		return peluquero1;
	}

	public void setPeluquero1(Peluquero peluquero1) {
		this.peluquero1 = peluquero1;
	}

	public Peluquero getPeluquero2() {
		return peluquero2;
	}

	public void setPeluquero2(Peluquero peluquero2) {
		this.peluquero2 = peluquero2;
	}

	public Peluquero getPeluquero3() {
		return peluquero3;
	}

	public void setPeluquero3(Peluquero peluquero3) {
		this.peluquero3 = peluquero3;
	}

	public Peluquero getPeluquero4() {
		return peluquero4;
	}

	public void setPeluquero4(Peluquero peluquero4) {
		this.peluquero4 = peluquero4;
	}

	public void setPeluqueros(ArrayList<Peluquero> peluqueros) {
		this.peluqueros = peluqueros;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void setTurnos(ArrayList<Turno> turnos) {
		this.turnos = turnos;
	}
	
	
}
