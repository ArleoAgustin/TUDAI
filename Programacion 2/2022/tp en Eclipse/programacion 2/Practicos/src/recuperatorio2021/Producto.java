package recuperatorio2021;

import java.util.ArrayList;

public class Producto extends Elemento {
	
	private ArrayList<String> categorias;
	private double precio, peso;

	
	public Producto(String nombre, ArrayList<String> categorias, double precio, double peso) {
		super(nombre);
		this.categorias = categorias;
		this.precio = precio;
		this.peso = peso;
	}
	
	@Override
	public double getPeso() {return this.peso;}
	
	@Override
	public double getPrecio() {return this.precio;}
	
	@Override
	public ArrayList<String> getCategorias() {return new ArrayList<String>(this.categorias);}
}
