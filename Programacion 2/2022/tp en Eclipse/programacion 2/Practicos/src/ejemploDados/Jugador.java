package ejemploDados;

public class Jugador {
	
	private String nombre;
	private int cantPuntos;
	
	public Jugador(String nombre) {
		
		this.nombre = nombre;
		this.cantPuntos = 0;
	}
	
	public void tirar(Cubilete c) {
		
		c.tirar();
	}
	
	public void incrementarPuntos() {
		
		this.cantPuntos++;
	}

	public int getCantPuntos() {
		return cantPuntos;
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
