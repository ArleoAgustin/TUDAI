
public class CriteroPorPalabraEnTitulo extends Criterio{
	private String palabraEnTitulo;
	public CriteroPorPalabraEnTitulo (String palabraEnTitulo) {
		this.palabraEnTitulo = palabraEnTitulo;
	}
 	public boolean cumple(Pelicula p) {
		return p.getTitulo().contains(palabraEnTitulo);
	}
	public String getPalabraEnTitulo() {
		return palabraEnTitulo;
	}
	public void setPalabraEnTitulo(String palabraEnTitulo) {
		this.palabraEnTitulo = palabraEnTitulo;
	}
}
