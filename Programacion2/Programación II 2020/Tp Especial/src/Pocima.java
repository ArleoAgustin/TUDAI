
public abstract class Pocima {
	private String nombre;

	public Pocima(String name) {
		this.nombre = name;
	}


	public Atributo encantarAtributo(Atributo a1) {
		Atributo a2 = new Atributo(a1.getNombre(), a1.getValor());
		a2.setValor(this.aumentarAtributo(a2.getNombre(), a2.getValor()));
		return a2;
	}
	public abstract double aumentarAtributo(String nombre, double valor);
	
	@Override
	public String toString() {
		return nombre;
	}
	
	public String getName() {
		return nombre;
	}
}
