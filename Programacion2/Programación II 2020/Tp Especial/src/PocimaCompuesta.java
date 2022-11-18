

public class PocimaCompuesta extends Pocima{
	private Pocima p1;
	private Pocima p2;
	
	public PocimaCompuesta() {
		super("Cocktail");
	}
	
	// Aumentar el valor del atributo con las pocimas solo si son distintas de null
	@Override
	public double aumentarAtributo(String nombre, double valor) {
		double a2 = valor;
		valor = (p1!=null) ? p1.aumentarAtributo(nombre, valor) : valor;
		valor = (p2!=null) ? p2.aumentarAtributo(nombre, valor) : valor;
		return a2;
	}
	
	// Añadir pocimas solo si no están seteadas
	public void addPocima(Pocima p) {
		if(p1==null){
			p1 = p;
		} else if(p2==null) {
			p2 = p;
		}
	}
}