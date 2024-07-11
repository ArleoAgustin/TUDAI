package ej1;


import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class MySimpleLinkedList<T> implements Iterable<T> {
	
	private Node<T> first;
	private int sizeList;
	private Comparator<Integer> comparator;
	
	public MySimpleLinkedList() {
		this.sizeList = 0;
		this.first = null;
	}

	public MySimpleLinkedList(Comparator<Integer> comp) {

		this.first = null;
		this.sizeList = 0;
		this.comparator = comp;
	}
	public Node<T> getFirst(){
		return new Node<T>(first);
	}

	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.sizeList++;
	}
	
	public T extractFront() {
		return this.first.getInfo();
	}

	public boolean isEmpty() {return first != null;}
	
	public T get(int index) {

		T value = null;

		if (index < size()){
			Node<T> aux = this.first;

			for (int i = 1; i <= index; i++)
				aux = aux.getNext();

			value = aux.getInfo();
		}

		return value;
	}

	public int indexOf(T value) {

		Node<T> aux = first;
		int cont = 0;

		while(aux != null) {

			if (aux.getInfo().equals(value)) {
				return cont;
			}
			cont++;
			aux = aux.getNext();
		}
		return -1;
	}
	
	public int size() {return this.sizeList;}

/*
	Ejercicio 4
	A partir de la clase Lista implementada en el ejercicio 1, implemente el patrón
	iterator-iterable, para que la lista sea iterable. ¿Existe alguna ventaja computacional a la hora
	de recorrer la lista de principio a fin si se cuenta con un iterador?
*/

	public void printList(){

		Iterator<T> aux = iterator();
		while (aux.hasNext()){
			System.out.print(aux.next() +" --> ");
		}

	}


/*
	Ejercicio 5
	Escriba un procedimiento que dadas dos listas construya otra con los elementos comunes,
	suponiendo que: a) Las listas están desordenadas y la lista resultante debe quedar ordenada. b)
	Las listas están ordenadas y la lista resultante debe mantenerse o
*/

	public void insertarOrdenado(T n) {

		Node<T> nuevoNodo = new Node<T>(n, null);

		if (this.first == null || ((int)n <= (int) this.first.getInfo())) {
			nuevoNodo.setNext(this.first);
			this.first = nuevoNodo;
		} else {
			Node<T> actual = this.first;
			while (actual.getNext() != null && (int) n > (int) actual.getNext().getInfo()) {
				actual = actual.getNext();
			}
			nuevoNodo.setNext(actual.getNext());
			actual.setNext(nuevoNodo);
		}
	}

	public MySimpleLinkedList<T> listaComun(MySimpleLinkedList<T> l1) {

		MySimpleLinkedList<T> res = new MySimpleLinkedList<>();	//lista a devolver

		Node<T> aux1 = this.first;	//aux que se convierte en first
		Node<T> aux2;				//aux null

		while (aux1 != null) {		//mientras que aux1 no sea nulo
			aux2 = l1.first;		//aux2 se vulve el primero de la lista por parametro
			while (aux2 != null) {	//se itera esa lista
				if (aux1.getInfo().equals(aux2.getInfo())) {
					res.insertarOrdenado(aux1.getInfo());
					break;
				}
				aux2 = aux2.getNext();
			}
			aux1 = aux1.getNext();
		}

		return res;
	}


/*
	Ejercicio 6
	Escriba una función que dadas dos listas construya otra con los elementos que están en la
	primera pero no en la segunda.
*/
	public MySimpleLinkedList<T> elementosNoComunes(MySimpleLinkedList l2){

		Node<T> aux = first;
		MySimpleLinkedList<T> result = new MySimpleLinkedList<>();
		while (aux != null){

			Node<T> aux2 = l2.getFirst();
			while (aux2 != null){
				if (aux.getInfo().equals(aux2.getInfo())){
					break;
				}
				aux2 = aux2.getNext();
			}
			if (aux2 == null)
				result.insertFront(aux.getInfo());
			aux = aux.getNext();
		}

		return result;

	}






	@Override
	public String toString() {
		Node<T> aux = this.first;
		String list = "";
		while (aux!= null){
			list = list + aux.getInfo() +" --> ";
			aux = aux.getNext();
		}

		return list;
	}


//--------------------------------iterable-------------------------------------//


	@Override
	public Iterator<T> iterator() {
		return new IterableList();
	}


	private class IterableList implements Iterator<T>{

		Node<T> cursor;

		public IterableList(){
			cursor = first;
		}

		@Override
		public boolean hasNext() {
			return cursor != null;
		}

		@Override
		public T next() {

			T value = cursor.getInfo();
			cursor = cursor.getNext();
			return value;
		}
	}
}
