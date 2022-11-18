import java.util.ArrayList;


public class Lote {
	
	static int contadorDeLotes;
	private int numeroDeLote;
	private ArrayList<String> minerales;
	private int cantidadHecatreas;
	
	public Lote(int  cantidadHecatreas) {
		minerales = new ArrayList<String>();
		this.numeroDeLote = contadorDeLotes;
		this.cantidadHecatreas = cantidadHecatreas;
		contadorDeLotes++;
	}
	
	public boolean cerelesSirvenParaLote(Cereal cereal) {
		return cereal.sirveLote(this);
	}
	
	public boolean sosEspecial(ArrayList<String> mineralesNormales) {
		for (String mineral : mineralesNormales) {
			if (!minerales.contains(mineral)) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<String> getMinerales() {
		return minerales;
	}
	
	public void setMinerales(ArrayList<String> minerales) {
		this.minerales = minerales;
	}
	

	public int getCantidadHecatreas() {
		return cantidadHecatreas;
	}

	public void setCantidadHecatreas(int cantidadHecatreas) {
		this.cantidadHecatreas = cantidadHecatreas;
	}

	public int getNumeroDeLote() {
		return numeroDeLote;
	}

	public void setNumeroDeLote(int numeroDeLote) {
		this.numeroDeLote = numeroDeLote;
	}
}
