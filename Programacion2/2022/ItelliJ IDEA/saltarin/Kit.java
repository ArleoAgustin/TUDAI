package saltarin;

import java.util.ArrayList;

import saltarin.filtros.Filtro;

public class Kit extends Elemento {

	private ArrayList<Elemento> elementos;	
	
	public Kit(String nombre) {
		super(nombre);
		this.elementos = new ArrayList<>();
	}

	public void add(Elemento elemento) {
		this.elementos.add(elemento);
	}
	
	@Override
	public int getVolumen() {
		int maximo = 0;
		
		for (int index = 0; index < this.elementos.size(); index++) {
			Elemento elemHijo = this.elementos.get(index);
			int volHijo = elemHijo.getVolumen();
			if (volHijo > maximo)
				maximo = volHijo;
		}
		
		return maximo;
	}

	@Override
	public String getMarca() {
		if (this.elementos.isEmpty())
			return null;
		else
			return this.elementos.get(0).getMarca();
	}

	@Override
	public int getPrecio() {
		int total = 0;
		
		for (int index = 0; index < this.elementos.size(); index++) {
			Elemento elemHijo = this.elementos.get(index);
			total += elemHijo.getPrecio();
		}
		
		return total;
	}

	@Override
	public int getCantidadProductos() {
		int cantidad = 0;
		
		for (int index = 0; index < this.elementos.size(); index++) {
			Elemento elemHijo = this.elementos.get(index);
			cantidad += elemHijo.getCantidadProductos();
		}		
		
		return cantidad;
	}

	@Override
	public ArrayList<Elemento> buscar(Filtro filtro) {
		ArrayList<Elemento> resultado = new ArrayList<>();
		
		for (Elemento e: elementos) {
			ArrayList<Elemento> resultadoHijo = e.buscar(filtro);
			resultado.addAll(resultadoHijo);
		}
		
		if (filtro.cumple(this)) {
			resultado.add(this);
		}
		
		return resultado;
	}

	public Elemento copiar() {
		
		Kit kitNuevo = new Kit(this.getNombre());
		
		for (int index = 0; index < this.elementos.size(); index++) {

			Elemento elemHijo = this.elementos.get(index);
			
			Elemento copiaHijo = elemHijo.copiar();
			kitNuevo.add(copiaHijo);
		}
		
		return kitNuevo;
	}
	
	private boolean estaVacio() {
		return this.elementos.isEmpty();
	}

	@Override
	public Elemento copiar(Filtro filtroTematica) {
		
		Kit kitNuevo = new Kit(this.getNombre());
		
		for (int index = 0; index < this.elementos.size(); index++) {

			Elemento elemHijo = this.elementos.get(index);
			Elemento copiaHijo = elemHijo.copiar(filtroTematica);

			if (copiaHijo != null) {
				kitNuevo.add(copiaHijo);
			}
		}
		
		if (kitNuevo.estaVacio())
			return null;
		else
			return kitNuevo;
	}


}
