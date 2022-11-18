
public class Atributo implements Comparable<Atributo>{
	private String nombre;
	private double valor; 
	
	// Constructor
	public Atributo(String nombre, double valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	// Preguntarle al atributo si le puede ganar a otro
	public int enfrentarAtributo(Atributo a2) {
		Atributo a1 = this;
		return a1.compareTo(a2);
	}
	
	// Reescribiendo el método equals comparando solo el nombre de los atributos
	@Override
	public boolean equals(Object o) {
		try {
			Atributo a1 = (Atributo) o;
			return a1.getNombre().equals(nombre);
		} catch(Exception e) {
			return false;
		}
	}

	// Reescribiendo el método toString
	@Override
	public String toString() {
		return nombre;
	}

	// Reescribiendo el método compareTo
	@Override
	public int compareTo(Atributo a) {
		return (int) (this.valor - a.getValor());
	}
	
	// Getter y setters
	public String getNombre() {
		return nombre;
	}

	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
}
