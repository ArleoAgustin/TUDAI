package recuperatorio2021;

import java.util.ArrayList;

import recuperatorio2021.Filtros.Filtro;

public class Combo extends Elemento {

	private final double descuento = -1.4; 
	private ArrayList<Elemento> elementos;
	
	public Combo(String nombre) {super(nombre);}

	@Override
	public double getPeso() {
		
		double p =0; 
		for(Elemento e: this.elementos) {
			p = e.getPeso();
		}
		return p;
	}

	@Override
	public double getPrecio() {
		
		double aux =0;
		double llevarCuenta =0;
		for(Elemento e: this.elementos) {
			aux+= e.getPrecio();
			llevarCuenta = e.getPrecio() * descuento;
		}
		if(llevarCuenta < aux /2) {
			return llevarCuenta;
		}
		else
			return aux/2;
	}
	
	/*las categorías de un combo se determinan como la unión, sin 
	  repetidos, de todas las categorías de los elementos que contienen.*/
	
	@Override
	public ArrayList<String> getCategorias() {
		
		ArrayList<String> res = new ArrayList<>();
		
		for(Elemento e: this.elementos) {
			
			for(String cat: e.getCategorias()) {	
				if(!res.contains(cat))
					res.add(cat);
			}
		}
		return res;
	}

	public double getDescuento() {
		return descuento;
	}

	public ArrayList<Elemento> getElementos() {
		return elementos;
	}
	
	public boolean cumpleRequisito(Filtro f, Elemento e) {
		
		return f.cumple(e);
	}

	public void addElemento(Elemento e, Filtro f) {

		if(this.cumpleRequisito(f, e))
			elementos.add(e);
	}

}








