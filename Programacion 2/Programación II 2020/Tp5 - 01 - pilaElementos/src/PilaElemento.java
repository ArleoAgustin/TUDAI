import java.util.ArrayList;

public class PilaElemento {
	
	private ArrayList<Object> pilaElmentos;
	
	public PilaElemento() {
		pilaElmentos = new ArrayList<Object>();
	}
	
	public void push(Object o) {
		getPilaElmentos().add(o);
	}

	public void pop() {
		getPilaElmentos().remove(size()-1);
	}
	
	public Object top() {
		return getPilaElmentos().get(size()-1);
	} 
	
	public int size() {
		return getPilaElmentos().size();
	}
	
	public void reverse() {
		for (int i = 0; i < size()/2; i++) {
			Object aux = getPilaElmentos().get(i);
			pilaElmentos.set(i,  getPilaElmentos().get(size()-1-i));
			pilaElmentos.set(size()-1-i,  aux);
		}
	}
	
	public  PilaElemento copy() {
		PilaElemento p =  new PilaElemento ();
		for (Object object : pilaElmentos) {
			p.push(object);
		}
		return p;
	}
	
	
	public void imprimir() {
		System.out.print("\nPila = [");
		for (Object object : pilaElmentos) {
			System.out.print(object+", ");
		}
		System.out.print("]");
	}
	
	private ArrayList<Object> getPilaElmentos() {
		return pilaElmentos;
	}
	
}
