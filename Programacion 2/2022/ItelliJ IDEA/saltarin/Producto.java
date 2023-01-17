package saltarin;

import java.util.ArrayList;

import saltarin.filtros.Filtro;

public class Producto extends Elemento {

	private String marca;
	private int volumen;
	private int precio;
	private int peso;
	
	public Producto(String nombre, String marca, int volumen, int precio, int peso) {
		super(nombre);
		this.marca = marca;
		this.precio = precio;
		this.peso = peso;
		this.volumen = volumen;
	}

	@Override
	public int getVolumen() {
		return this.volumen;
	}

	@Override
	public String getMarca() {
		return this.marca;
	}

	@Override
	public int getPrecio() {
		return this.precio;
	}

	public int getPeso() {
		return peso;
	}

	@Override
	public int getCantidadProductos() {
		return 1;
	}

	@Override
	public ArrayList<Elemento> buscar(Filtro filtro) {
		ArrayList<Elemento> resultado = new ArrayList<>();
		
		if (filtro.cumple(this))
			resultado.add(this);
		
		return resultado;
	}
	
	public Elemento copiar() {
		return new Producto(this.getNombre(), this.getMarca(), this.getVolumen(), this.getPrecio(), this.getPeso());
	}

	@Override
	public Elemento copiar(Filtro filtroTematica) {
		
		if (filtroTematica.cumple(this)) {
			return this.copiar();
		} else {
			return null;
		}

	}

	
}
