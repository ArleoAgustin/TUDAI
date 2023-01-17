import java.util.ArrayList;

public class LugarParaCochera extends Estacionamiento{
	private ArrayList<Estacionamiento> estacionamiestos;
	
	public LugarParaCochera() {
		this.estacionamiestos = new  ArrayList<Estacionamiento>();
	}
	
	@Override
	public ArrayList<Cochera> buscarCocheras(Automovil automovil) {
		ArrayList<Cochera> aux = new  ArrayList<Cochera>();
		for (Estacionamiento estacionamiento : estacionamiestos) {
			aux.addAll(estacionamiento.buscarCocheras(automovil));
		}
		return aux;
	}

	@Override
	public Estacionamiento copiarEstacionamiento(Filtro filtro) {
		LugarParaCochera aux = null;
		boolean estacionamientoEncontrado = false;
		for (Estacionamiento estacionamiento : estacionamiestos) {
			if (estacionamiento.copiarEstacionamiento(filtro) != null){
				estacionamientoEncontrado = true;
				if (estacionamientoEncontrado){
					aux = new LugarParaCochera();
					aux.addEstacionamiebnto(estacionamiento.copiarEstacionamiento(filtro));
				}
			}
		}
		return aux;
	}
	
	@Override
	public int cantidadDeCocheras() {
		int aux = 0;
		for (Estacionamiento estacionamiento : estacionamiestos) {
			aux += estacionamiento.cantidadDeCocheras();
		}
		return aux;
	}
	
	public void addEstacionamiebnto(Estacionamiento estacionamiesto) {
		this.estacionamiestos.add(estacionamiesto);
	}
	
}
