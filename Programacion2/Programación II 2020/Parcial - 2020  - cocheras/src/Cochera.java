import java.util.ArrayList;

public class Cochera extends Estacionamiento{
	private Automovil automovil;
	private ArrayList<Caracteristica> facilidades;
	private Filtro condicion;
	
	public Cochera(Filtro condicion) {
		this.facilidades = new  ArrayList<Caracteristica>();
		this.condicion = condicion;
		// this.automovil = null;
	}

	@Override
	public ArrayList<Cochera> buscarCocheras(Automovil automovil) {
		ArrayList<Cochera> aux = new  ArrayList<Cochera>();
		if(this.automovil == null) {
			if(this.condicion.filtrar(automovil)) {
				aux.add(this);
			}
		}
		return aux;
	}

	@Override
	public Estacionamiento copiarEstacionamiento(Filtro filtro) {
		Cochera aux = null;
		if(this.automovil!=null&&filtro.filtrar(automovil)) {		
			aux = this;
		}
		return aux;
	}
	
	@Override
	public int cantidadDeCocheras() {
		return 1;
	}
	
	public void addFacilidades(Caracteristica facilidad) {
		this.facilidades.add(facilidad);
	}
	
	public void addEstacionamiebnto(Automovil automovil) {
		if(this.automovil == null) {
			System.out.println(this.condicion.filtrar(automovil));
			if(this.condicion.filtrar(automovil)) {
				this.automovil = automovil;
			}
		}
	}
}
