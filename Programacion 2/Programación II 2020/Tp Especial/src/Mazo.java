import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
	private ArrayList<Carta> cartas;
	
	public Mazo() {
		cartas = new ArrayList<Carta>();
	}
	
	// Verificar si las cartas ingresadas al mazo son del mismo tipo que als que ya hay
	private boolean verificarCarta(Carta c2) {
		Carta c1 = this.cartas.get(0);
		return c2.equals(c1);
	}
	
	// Mezclar cartas
	public void mezclarCartas() {
		Collections.shuffle(cartas);
	}
	
	// Eliminar la última carta del mazo
	public void pop() {
		cartas.remove(top());
	}
	
	// Agregar una nuev acarta al inicio del mazo
	public void push(Carta c) {
		if (cartas.size() == 0 || verificarCarta(c)) {
			cartas.add(0, c);
		}
	}

	// Obtener la primera carta del mazo
	public Carta peek() {
		return cartas.get(top());
	}
	
	// Obtener
	public int size() {
		return cartas.size();
	}
	
	// Saber si el amzo está vacio
	public boolean isEmpty() {
		return cartas.isEmpty();
	}

	// Obtener la primera carta del mazo
	private int top() {
		return cartas.size()-1;
	}
}
