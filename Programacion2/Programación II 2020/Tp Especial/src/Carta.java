import java.util.ArrayList;

public class Carta {
	private ArrayList<Atributo> atributos;
	private String nombre;
	private Pocima pocion;
	
	// Constructor
	public Carta(String nombre) {
		atributos = new ArrayList<Atributo>();
		this.nombre = nombre;
		this.pocion =  null;
	}
	
	// Enfrentar una carta con otra, decidiendo competir por un atributo pasado por parametro,
	// y preguntandole al atributo de la carta si le puede gana, o no
	public int enfrentarCartas(Carta c, String a) {
		Atributo a1 = encontrarAtributo(a);
		Atributo a2 = c.encontrarAtributo(a);
		return a1.enfrentarAtributo(a2);
	}
	
	// Encontrar un atributo pasado por parametro
	public Atributo encontrarAtributo(String a2) {
		for (Atributo atributo : atributos) {
			if(atributo.getNombre().equals(a2)) {
				return atributo;
			}
		}
		return null;
	}	
	
	// Pedirle a la carta el atributo con mayor valor
	public ArrayList<String> obtenerNombreDeAtributos() {
		ArrayList<String> aux = new ArrayList<String>();
		for (Atributo a : atributos) {
			aux.add(a.getNombre());
		}
		return aux;
	}
	
	// Añadir un nuevo atributo a la carta
	public void addAtributo(Atributo atributo) {
		atributos.add(atributo);
	}
	
	// Preguntarle a la carta si tiene un atributo
	public boolean tenesAtributo(Atributo a2) {
		return atributos.contains(a2);
	}
	
	// Reecribiendo el método equals, preguntando si tiene los mismos atributos
	@Override
	public boolean equals(Object o) {
		try {
			Carta c = (Carta) o;
			for (Atributo a : atributos) {
				if (!c.tenesAtributo(a)){
					return false;
				}
			}
			return true;
		}catch (Exception e){
			return false;
		}
	}
	
	
	// Reecribiendo el método toString
	@Override
	public String toString() {
		return this.nombre;
	}

	
	// Obtener el nombre de la carta
	public String getNombre() {
		return nombre;
	}
	
	//  Obtener la poción
	public Pocima getPosion() {
		return pocion;
	}

	// Setear el atributo pocion la poción
	public void setPocion(Pocima pocion) {
		this.pocion = pocion;
	}
}
