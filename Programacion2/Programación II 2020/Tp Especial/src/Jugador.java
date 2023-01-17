
public class Jugador {
	private String nombre;
	private EstrategiaDeJuego estrategia; 
	private Mazo mazo;
	
	// Constructores
	// En caso de que no se le pase una estrategia de juego por parametro,
	// se selecciona una estrategia de timbeo por defecto
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.mazo = new Mazo();
		this.estrategia = new Timbero();
	}
	
	public Jugador(String nombre, EstrategiaDeJuego estrategia) {
		this.nombre = nombre;
		mazo = new Mazo();
		this.estrategia = estrategia;
	}	
	
	// Obtener la ultima carta del mazo y eliminarla de su array interno
	public Carta sacarPrimeraCarta() {
		Carta c = mazo.peek();
		mazo.pop();
		return c;
	}
	
	// Agregar una carta en el final mazo
	public void agregarCartaAlfondo(Carta carta) {
		mazo.push(carta);	
	}
	
	// Preguntar si se quedo sin caras
	public boolean sinCartas() {
		return mazo.isEmpty();
	}
	
	// Obtener la cantidad de cartas
	public int getCantCartas() {
		return mazo.size();
	}
	
	// Usar la estrategia del jugador para que eliga un atributo
	public Atributo decidirAtributo(Carta c) {
		return this.estrategia.usarEstrategia(c);
	}
	
	// Cambiar la estrategia de juego del juagador
	public void cambiarEstrategia(EstrategiaDeJuego estrategia) {
		this.estrategia = estrategia;
	}

	// Getter y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Reescribiendo el toString
	public String toString() {
		return nombre;
	}
}
