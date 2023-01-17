package Jugadores;

import java.util.ArrayList;
import java.util.Random;

import ElementosDeJuego.Atributo;
import ElementosDeJuego.Carta;

public class Jugador {
	
	private String nombre;
	private ArrayList<Carta> cartasJugador = new ArrayList<Carta>();
	private String rondasGanadas;
	
	public Jugador(String nombre) {	
		this.nombre = nombre;
	}
	
//el jugador agarra la carta que le dieron
	
	public void agarrarCartaRepartida(Carta c) {
		this.cartasJugador.add(c);
		
	}
	
	public Carta tomarPrimeraCartaMonton() {
		Carta c = this.cartasJugador.get(this.cartasJugador.size()-1);
		this.eliminarCartaRetirada();
		return c;
	}
	
	public void eliminarCartaRetirada() {
		this.cartasJugador.remove(this.cartasJugador.size()-1);
	}
	
	public Atributo seleccionarAtributo(Carta c) {
		
		Random r = new Random();
		int i = r.nextInt(c.cantidadAtributos());
		return c.getAtributos().get(i);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Carta> getCartas() {
		
		ArrayList<Carta> c = this.cartasJugador;
		
		return c;
	}
	


	public String getRondasGanadas() {
		return rondasGanadas;
	}

	public void setRondasGanadas(String rondasGanadas) {
		this.rondasGanadas = rondasGanadas;
	}


//pregunta si el jugador se quedo sin cartas o todavia no le repartieron
	
	public boolean tieneCartas() {
		
		return !this.cartasJugador.isEmpty();
	}
	
	// Agregar una carta en el final mazo
	public void agregarCartaAlfondo(Carta carta) {
		cartasJugador.add(0, carta);
	}
	
	
// Obtener la ultima carta del mazo y eliminarla de su array interno
	public Carta sacarPrimeraCarta() {
		Carta c = this.cartasJugador.get(this.cartasJugador.size()-1);
		this.cartasJugador.remove(this.cartasJugador.size()-1);
		return c;
	}
	
}
