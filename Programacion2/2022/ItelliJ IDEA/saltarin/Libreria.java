package saltarin;

import java.util.ArrayList;

import saltarin.filtros.Filtro;

public class Libreria {

	private String nombre;
	private ArrayList<Elemento> elementos;
	private Filtro politica;
	
	public Libreria(String nombre, Filtro politica) {
		this.nombre = nombre;
		this.elementos = new ArrayList<>();
		this.politica = politica;
	}
	
	public void add(Elemento elemento) {
		this.elementos.add(elemento);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPolitica(Filtro politica) {
		this.politica = politica;
	}
	
	public boolean sePublica(Elemento elem) {
		return this.politica.cumple(elem);
	}
	
	public ArrayList<Elemento> buscar(Filtro filtro) {

		ArrayList<Elemento> resultado = new ArrayList<>();
		
		for (Elemento e: elementos) {
			ArrayList<Elemento> resultadoElem = e.buscar(filtro);
			resultado.addAll(resultadoElem);
		}
		
		return resultado;
	}
	
	public ArrayList<Elemento> copiar(Filtro filtro) {
		
		ArrayList<Elemento> resultado = new ArrayList<>();
		
		for (int index = 0; index < this.elementos.size(); index++) {
			Elemento elem = this.elementos.get(index);
			Elemento elemCopia = elem.copiar(filtro);
			if (elemCopia != null)
				resultado.add(elemCopia);
		}
		
		return resultado;
		
	}
 	
}
