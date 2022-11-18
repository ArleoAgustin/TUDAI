import java.util.ArrayList;


public abstract class Estacionamiento {
	public abstract ArrayList<Cochera> buscarCocheras(Automovil automovil);
	public abstract Estacionamiento copiarEstacionamiento(Filtro filtro);
	public abstract int cantidadDeCocheras();
}
