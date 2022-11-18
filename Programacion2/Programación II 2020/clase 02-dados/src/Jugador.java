public class Jugador {

	private String nombre;
	private int puntos;
	
	public Jugador(String nn) {
		nombre = nn;
		puntos = 0;
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public int tirarDados(Cubilete vaso) {
		return vaso.tirar();
	}

	public void incrementarPuntos() {
		puntos ++;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	public boolean esIgual(Jugador jnuevo) {
		
		if (nombre.equals(jnuevo.getNombre())) {
			if (puntos == jnuevo.getPuntos()) {
				return true;
			}
			return false;
		} else {
			return false;
		}
		
	//	return (nombre.equals(jnuevo.getNombre()) && 
	//			(puntos == jnuevo.getPuntos()));
				
	}
	
	
	
}