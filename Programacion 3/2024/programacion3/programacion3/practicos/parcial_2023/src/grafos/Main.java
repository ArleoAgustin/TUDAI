package grafos;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		GrafoDirigido grafo = new GrafoDirigido<>();

		grafo.agregarVertice(1);
		grafo.agregarVertice(2);
		grafo.agregarVertice(3);
		grafo.agregarVertice(4);
		grafo.agregarVertice(5);

		grafo.agregarArco(1, 2, "");
		grafo.agregarArco(1, 1, "");
		grafo.agregarArco(1, 3, "");
		grafo.agregarArco(1, 4, "");

		grafo.agregarArco(3, 5, "");

		grafo.agregarArco(4, 3, "");

		System.out.print("cantidad de vertices: ");
		System.out.println(grafo.cantidadVertices());

		System.out.print("cantidad de arcos: ");
		System.out.println(grafo.cantidadArcos());

		System.out.print("Arco de ejemplo: ");
		System.out.println(grafo.obtenerArco(3, 5).getVerticeOrigen() + " -> " + grafo.obtenerArco(3, 5).getVerticeDestino());

		System.out.println("");
		System.out.print("Vertices: ");

		Iterator<Arco> vertices = grafo.obtenerVertices();
		while (vertices.hasNext()) {
			System.out.print(vertices.next() + " ");
		}

		System.out.println("");
		System.out.println("");
		System.out.print("Arcos: ");

		Iterator<Arco> arcos = grafo.obtenerArcos();
		while (arcos.hasNext()){
			Arco aux = arcos.next();
			System.out.print(aux.getVerticeOrigen() + " -> " + aux.getVerticeDestino() + " | ");
		}


		System.out.println("");
		System.out.println("");
		System.out.print("arcos por vertice: ");

		Iterator<Arco> arcosById = grafo.obtenerArcos(1);

		while (arcosById.hasNext()){
			Arco aux = arcosById.next();
			System.out.print(aux.getVerticeOrigen() + " -> " + aux.getVerticeDestino() + " | ");
		}

		System.out.println("");
		System.out.println("");
		System.out.print("arcos adyacentes a vertice: ");

		Iterator<Arco> ady = grafo.obtenerAdyacentes(1);

		while (ady.hasNext()){
			System.out.print(ady.next() + " ");
		}

		System.out.println("");
/*		grafo.borrarArco(1,1);

		System.out.println(grafo.cantidadArcos());
*/

		grafo.borrarVertice(1);


		System.out.print("cantidad de vertices: ");
		System.out.println(grafo.cantidadVertices());

		System.out.println("");
		System.out.print("Vertices: ");

		Iterator<Arco> vertices2 = grafo.obtenerVertices();
		while (vertices2.hasNext()) {
			System.out.print(vertices2.next() + " ");
		}


		System.out.println("");
		System.out.println("");
		System.out.print("Arcos: ");

		Iterator<Arco> arcos2 = grafo.obtenerArcos();
		while (arcos2.hasNext()){
			Arco aux = arcos2.next();
			System.out.print(aux.getVerticeOrigen() + " -> " + aux.getVerticeDestino() + " | ");
		}
	}

}
