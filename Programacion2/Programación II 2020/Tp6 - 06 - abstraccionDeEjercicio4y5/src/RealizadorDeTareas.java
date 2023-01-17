
public class RealizadorDeTareas extends TareayRelizadorDeTareas{
	
	public RealizadorDeTareas() {
		super();
	}
	
	public RealizadorDeTareas(double valor, String nombre) {
		super(valor, nombre);
	}

	public boolean sosMayor(TareayRelizadorDeTareas p2) {
		RealizadorDeTareas p1 = this;
		return p1.getValor() > p2.getValor();
	}
}
