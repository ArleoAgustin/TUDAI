import java.util.ArrayList;

public class CooperativaAgricola {
	
	private ArrayList<Cereal> cereales;
	private ArrayList<Lote> lotes;
	private ArrayList<String> mineralesNomales;
	
	public CooperativaAgricola() {
		cereales = new ArrayList<Cereal>();
		lotes = new ArrayList<Lote>();
		mineralesNomales = new ArrayList<String>();
	}
	
	public void addLote(Lote lote) {
		lotes.add(lote);
	}
	
	public void addLote(Cereal cereal) {
		cereales.add(cereal);
	}
	
	public void addMineralesNomales(String mineral) {
		mineralesNomales.add(mineral);
	}
}
