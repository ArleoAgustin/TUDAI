package tp5.ej1;

import java.util.ArrayList;

public class PilaElementos {
	
	ArrayList pila = new ArrayList<>();

	public void push(Object o) {
		
		this.pila.add(0,o);
	}
	
	public Object pop() {
		
		Object aux = this.pila.get(0);
		this.pila.remove(0);
		return aux;
	}
	
	public Object top() {
		return this.pila.get(0);
		
	}
	
	public int size() {
		return this.pila.size();
	}
	
	public ArrayList<Object> copy() {
		
		return new ArrayList<Object>(pila);
		
	}
	
	public ArrayList<Object> reverse(){
		
		ArrayList<Object> aux = new ArrayList<Object>();
		
		for(int i= pila.size()-1; i >= 0; i--) {
			
			aux.add(pila.get(i));
		}
		return aux;
	}
}
