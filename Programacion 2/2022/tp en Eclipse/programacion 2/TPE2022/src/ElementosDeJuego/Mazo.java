package ElementosDeJuego;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Mazo implements Comparator<Carta>{
	
	private ArrayList<Carta> cartas;

	public Mazo(){
		
		this.cartas = new ArrayList<Carta>();

	}
	

// Agregar una nueva carta al inicio del mazo
	
	public void agregarCarta(Carta c) {
		
		if(!c.getAtributos().isEmpty()) {
			if (cartas.size() == 0 || (mismoTipo(c))) {
				cartas.add(0, c);
			}
		}
	}
	


//verifica si las cartas son del mismo tipo
	
	private boolean mismoTipo(Carta c1) {
		
		Carta c = this.obtenerPrimerCarta();
		
		if(c.cantidadAtributos() == c1.cantidadAtributos() && !c.equals(c1)) {
			return compare(c, c1) == 0;
		}
		else
			return false;
		
	}


	public ArrayList<Carta> getCartas() {
		ArrayList<Carta> c = this.cartas;
		
		return c;
	}

	
//compara si los atributos de las cartas son iguales
	
	@Override
	public int compare(Carta c1, Carta c2) {
		
		int aux2 = 0;
		ArrayList<Atributo> a1 = c1.getAtributos();
		ArrayList<Atributo> a2 = c2.getAtributos();
		
		for(int i=0; i<a1.size();i++){ 
			
			for(int j=0; j<a2.size();j++){
				if(a1.get(i).getNombreAtributo().equals(a2.get(j).getNombreAtributo())){
					aux2++;
				}
			}
			if (aux2 == 0)
				return 1;
		}

		return 0;
	}
	
	
	public void mezclarCartas() {
		Collections.shuffle(cartas);
	}
	
	
//determina si el mazo es impar
	
	public boolean esImpar() {
		if(this.getCartas().size() %2 == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
// Saber si el mazo esta vacio
	
	public boolean estaVacio() {
		return cartas.isEmpty();
	}
	
	
// Obtener la primera carta del mazo
	
	public Carta obtenerPrimerCarta() {
		return cartas.get(cartas.size()-1);
	}
	
	
// Elimina la última carta del mazo
	
	public void quitarPrimeraCarta() {
		cartas.remove(cartas.size()-1);
	}

	
}