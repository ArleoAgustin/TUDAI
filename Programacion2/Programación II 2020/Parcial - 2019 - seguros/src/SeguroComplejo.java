import java.util.ArrayList;

public class SeguroComplejo extends Seguro{
	private ArrayList<Seguro> seguros;
	private double decuento;

	public SeguroComplejo(ArrayList<Seguro> seguros, double decuento) {
		this.seguros = seguros;
		this.decuento = decuento/100.0;
	}
	
	@Override
	public double getPrecio() {
		double aux = 0;
		for (Seguro seguro : seguros) {
			aux += seguro.getPrecio();
		}
		return aux*decuento;
	}
	@Override
	public ArrayList<Seguro> getSeguros(Filtro filtro) {
		ArrayList<Seguro> aux = new ArrayList<Seguro>();
		for (Seguro seguro : seguros) {
			aux.addAll(seguro.getSeguros(filtro));
		}
		return aux;
	}
}
