import java.util.ArrayList;

public class Cereal {
	
	private String nombre;
	private ArrayList<String> mineralesNecesarios;
	
	public Cereal(){
		mineralesNecesarios = new ArrayList<String>();
		this.nombre = "N";
	}
	
	public Cereal(String nombre){
		mineralesNecesarios = new ArrayList<String>();
		this.nombre = nombre;
	}
	
	public void addMineral(String nuevoMineral) {
		mineralesNecesarios.add(nuevoMineral);
	}
	
	public boolean sirveLote(Lote lote) {
		for (String mineral : mineralesNecesarios) {
			if (!lote.getMinerales().contains(mineral)) {
				return false;
			}
		}
		return true;
	}

	public ArrayList<String> getMineralesNecesarios() {
		return mineralesNecesarios;
	}

	public void setMineralesNecesarios(ArrayList<String> mineralesNecesarios) {
		this.mineralesNecesarios = mineralesNecesarios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
