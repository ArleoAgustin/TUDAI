import java.util.ArrayList;

public class CasaCualidades{
	
	private String nombre;
	private ArrayList<String> conjuntoCualidades;
	protected ArrayList<Estudiante> conjuntoEstudiantes;
	private EscuelaDeMagia escuelaMagicaDeCasa;
	
	public CasaCualidades(String nombre){
		this.nombre = nombre;
	}
	
	public void addEstudiante(Estudiante est){
		if(cumpleCondiciones(est)){
			conjuntoEstudiantes.add(est);
			est.setCasa(this);
		}
	}
	
	public boolean verificarCualidadesEstudiante(ArrayList<String> estudianteCualidades){
		for (String cualidadesDeCasa : conjuntoCualidades) {
			if(!estudianteCualidades.contains(cualidadesDeCasa)){
				return false;
			}
		}
		return true;
	}
	
	public String toString(){
		return "La Casa de "+nombre+" que pertenece a la escuela"+(escuelaMagicaDeCasa.getNombre())+" requiere las cualidades de: "+ (conjuntoCualidades)+" y tinene los siguientes estudiantes: "+imprimirEstudiantes();
	}
	
	public String imprimirEstudiantes() {
		String estudiantes = "";
		for (Estudiante estudiante : conjuntoEstudiantes) {
			estudiantes += estudiante.getNombre()+", ";
		}
		return estudiantes;
	}
	
	public boolean cumpleCondiciones(Estudiante est) {
		return verificarCualidadesEstudiante(est.getConjuntoCualidades());
	}

	public void addEscuelaMagicaDeCasa(EscuelaDeMagia escuela) {
		escuelaMagicaDeCasa = escuela;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEscuelaMagicaDeCasa() {
		return escuelaMagicaDeCasa.toString();
	}

	public ArrayList<String> getConjuntoCualidades() {
		return conjuntoCualidades;
	}

	public void setConjuntoCualidades(ArrayList<String> conjuntoCualidades) {
		this.conjuntoCualidades = conjuntoCualidades;
	}

	public ArrayList<Estudiante> getConjuntoEstudiantes() {
		return conjuntoEstudiantes;
	}

	public void setConjuntoEstudiantes(ArrayList<Estudiante> conjuntoEstudiantes) {
		this.conjuntoEstudiantes = conjuntoEstudiantes;
	}

	public void setEscuelaMagicaDeCasa(EscuelaDeMagia escuelaMagicaDeCasa) {
		this.escuelaMagicaDeCasa = escuelaMagicaDeCasa;
	}
}
