
public abstract class TareayRelizadorDeTareas  {
	
	private double valor;
	private String nombre;
	
	public TareayRelizadorDeTareas() {
		this.nombre = "N";
		this.valor = 0;
	}
	
	public TareayRelizadorDeTareas(double valor, String nombre) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	public abstract boolean sosMayor(TareayRelizadorDeTareas p2);
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getNobre() {
		return nombre;
	}
	public void setNobre(String nobre) {
		this.nombre = nobre;
	}
}
