
public class CriterioDuracion extends Criterio{
	private int duracion;
	public CriterioDuracion(int duracion) {
		this.duracion = duracion;
	}
	public boolean cumple(Pelicula p) {
		return p.getDuracion() < 95;
	}
 	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
}
