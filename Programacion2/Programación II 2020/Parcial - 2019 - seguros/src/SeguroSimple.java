import java.util.ArrayList;


public class SeguroSimple extends Seguro{
	private double precio;

	public SeguroSimple(double precio) {
		super();
		this.precio = precio;
	}

	@Override
	public double getPrecio() {
		return this.precio;
	}

	@Override
	public ArrayList<Seguro> getSeguros(Filtro filtro) {
		ArrayList<Seguro> yop = new ArrayList<Seguro>();
		if(filtro.filtrar(this)) {
			yop.add(this);
		}
		return yop;
	}
}
