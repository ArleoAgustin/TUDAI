import java.util.ArrayList;

public class EscuelaDeMagia {
	private String nombre;
	private ArrayList<CasaCualidades> casas;
	
	public EscuelaDeMagia() {
		this.nombre =  "Hogwarts";
		casas = new ArrayList<CasaCualidades>();
	}
	
	public void addCasa(CasaCualidades casa) {
		casas.add(casa);
	}
	
	public String toString(){
		return "La Escuela "+nombre+" de Magía y Hechicería";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
