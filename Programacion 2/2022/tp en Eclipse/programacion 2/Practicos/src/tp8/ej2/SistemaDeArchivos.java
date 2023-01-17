package tp8.ej2;

import java.util.ArrayList;
import java.util.Collections;

import tp8.ej2.Comparadores.ComparadorElemento;
import tp8.ej2.Filtros.Filtro;

public class SistemaDeArchivos {
	
	private ArrayList<Elemento> elementos;
	
	public SistemaDeArchivos() {
		super();
	
	}

	public ArrayList<Elemento> getElementos() {
		return elementos;
	}

	public void addElementos(Elemento e) {
		this.elementos.add(e);
	}
	
	public ArrayList<Elemento> buscarOrdenado(Filtro f, ComparadorElemento formaDeOrdenar){
		
		ArrayList<Elemento> res = new ArrayList<>();
		
		for(Elemento e: elementos) {
			ArrayList<Elemento> resBusueda = e.buscar(f);
			res.addAll(resBusueda);
		}
		
		Collections.sort(res, formaDeOrdenar);
		return res;
	}

	/*
	public ComparadorElemento getFormaDeOrdenar() {
		return formaDeOrdenar;
	}

	public void setFormaDeOrdenar(ComparadorElemento formaDeOrdenar) {
		this.formaDeOrdenar = formaDeOrdenar;
	}
	*/
	
}
