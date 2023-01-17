import java.util.ArrayList;

public class Estudiante {
	
	private String nombre;
	private ArrayList<String> conjuntoCualidades;
	private ArrayList<String> conjuntoFamiliares;
	private CasaCualidades casa;
 	
	public Estudiante(String nombre){
		this.nombre = nombre;
		this.casa = null;
		conjuntoCualidades = new ArrayList<String>();
		conjuntoFamiliares = new ArrayList<String>();
	}
	
	public void addFamiliar(String familiar) {
		conjuntoFamiliares.add(familiar);
	}
	
	public void addCualidadr(String cualidad) {
		conjuntoCualidades.add(cualidad);
	}
	
	
	
	public ArrayList<String> getConjuntoCualidades() {
		return conjuntoCualidades;
	}

	public void setConjuntoCualidades(ArrayList<String> conjuntoCualidades) {
		this.conjuntoCualidades = conjuntoCualidades;
	}

	public ArrayList<String> getConjuntoFamiliares() {
		return conjuntoFamiliares;
	}

	public void setConjuntoFamiliares(ArrayList<String> conjuntoFamiliares) {
		this.conjuntoFamiliares = conjuntoFamiliares;
	}

	public void setCasa(CasaCualidades c1){
		casa = c1;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CasaCualidades getCasa() {
		return casa;
	}
}
