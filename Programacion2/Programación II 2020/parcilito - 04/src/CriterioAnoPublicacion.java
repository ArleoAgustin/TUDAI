
public class CriterioAnoPublicacion extends Criterio{
	private int anoPublicacion;
	public CriterioAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}
	public boolean cumple(Pelicula p) {
		return p.getAnoEstreno() < anoPublicacion;
	}
	public int getAnoPublicacion() {
		return anoPublicacion;
	}
	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}
}
