package ej1.grafos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class GrafoDirigido<T> implements Grafo<T> {

	private LinkedHashMap<Integer, ArrayList<Arco<T>>> vertices;
	private int cantArcos, cantVertices;

	public GrafoDirigido() {
		this.vertices = new LinkedHashMap<>();
		this.cantArcos = 0;
		this.cantVertices = 0;
	}

	@Override
	public void agregarVertice(int verticeId) {

		if (!this.contieneVertice(verticeId)) {
			vertices.put(verticeId, new ArrayList<>());
			this.cantVertices++;
		}
	}

	@Override
	public void borrarVertice(int verticeId) {

		if (contieneVertice(verticeId)){

			ArrayList adyacentesAVerticeId = new ArrayList();

				vertices.forEach( (key, value) ->{		//recorro el grafo

					if (this.soyAdyacenteA(key, verticeId))	//obtengo los que apuntan a mi al vertice a eliminar
						adyacentesAVerticeId.add(key);
				});

				adyacentesAVerticeId.forEach( index ->{		//recorro los vertices a los que soy adyacente

					borrarArco((Integer) index, verticeId);	//borra los arcos

				});

				for (int i = 0; i < vertices.get(verticeId).size(); i++){	//recorro mis arcos

					Arco<T> aux = vertices.get(verticeId).get(i);

					borrarArco(verticeId, aux.getVerticeDestino());		//borra los arcos
			}
			this.vertices.remove(verticeId);		//remuevo el vertice
			this.cantVertices--;
		}
	}

	@Override
	public void agregarArco(int verticeId1, int verticeId2, T etiqueta) {

		if (this.contieneVertice(verticeId1) && this.contieneVertice(verticeId2)) {
			if (!this.existeArco(verticeId1, verticeId2)) {
				vertices.get(verticeId1).add(new Arco<>(verticeId1, verticeId2, etiqueta));
				this.cantArcos++;

			}
		}
	}

	@Override
	public void borrarArco(int verticeId1, int verticeId2) {

		for (int i=0; i < vertices.get(verticeId1).size(); i++){

			if(vertices.get(verticeId1).get(i).getVerticeDestino() == verticeId2) {
				vertices.get(verticeId1).remove(vertices.get(verticeId1).get(i));
				cantArcos--;
			}
		}

	}

	@Override
	public boolean contieneVertice(int verticeId) {

		return vertices.containsKey(verticeId);
	}

	@Override
	public boolean existeArco(int verticeId1, int verticeId2) {

		if (contieneVertice(verticeId1) && contieneVertice(verticeId2))
			return vertices.get(verticeId1).stream().anyMatch(arco -> arco.getVerticeDestino() == verticeId2);

		return false;
	}

	@Override
	public Arco<T> obtenerArco(int verticeId1, int verticeId2) {

		if (existeArco(verticeId1, verticeId2)) {
			return vertices.get(verticeId1).stream()
					.filter(arco -> arco.getVerticeOrigen() == verticeId1 && arco.getVerticeDestino() == verticeId2)
					.findAny()
					.orElse(null); // Devuelve null si no se encuentra el arco
		} else {
			return null; // Devuelve null si no existe el arco entre los vértices
		}
	}

	@Override
	public int cantidadVertices() {
		return this.cantVertices;
	}

	public boolean soyAdyacenteA(int vertice1, int vertice2){

		return vertices.get(vertice1).stream().anyMatch(arco -> arco.getVerticeDestino() == vertice2);



	}

	@Override
	public int cantidadArcos() {
		return this.cantArcos;
	}

	@Override
	public Iterator<Integer> obtenerVertices() {

		return vertices.keySet().iterator();
	}

	@Override
	public Iterator<Integer> obtenerAdyacentes(int verticeId) {

		ArrayList<Integer> adyacentes = new ArrayList<>();

		if (contieneVertice(verticeId)){

			Iterator<Arco<T>> iterable = this.obtenerArcos(verticeId);

			while (iterable.hasNext()){
				adyacentes.add(iterable.next().getVerticeDestino());
			}
			return adyacentes.iterator();
		}
		else return null;
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos() {

		ArrayList<Arco<T>> arcos = new ArrayList<>();

		vertices.forEach( (key, value) ->{

			arcos.addAll(value);
		});

		return arcos.iterator();

	}

	@Override
	public Iterator<Arco<T>> obtenerArcos(int verticeId) {

		if (contieneVertice(verticeId)){

			return vertices.get(verticeId).iterator();
		}
		else return null;
	}

}
