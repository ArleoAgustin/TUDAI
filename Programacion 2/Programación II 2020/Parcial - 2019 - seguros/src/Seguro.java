import java.util.ArrayList;

public abstract class Seguro {
	public abstract double getPrecio();
	public abstract ArrayList<Seguro> getSeguros(Filtro filtro);
}
