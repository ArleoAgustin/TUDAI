package Juego;

import java.util.ArrayList;

import ElementosDeJuego.Carta;
import ElementosDeJuego.Mazo;
import Filtros.Filtro;

public class OrganizadorDeJuego {
	
	private Mazo mazo;

	public OrganizadorDeJuego(Mazo mazo) {
		this.mazo = mazo;
	}
	
//busqueda de cartas simples
	
	public ArrayList<Carta> cartasQueBusco(Filtro f, String nombreAtributo){
		
		ArrayList<Carta> cartas = new ArrayList<>();
		
		for(Carta c: mazo.getCartas()) {
			cartas.addAll(c.cumpleBusqueda(f, nombreAtributo));
		}
		return cartas;
	}
	
//busqueda de cartas compuesta (2 atributos)
	
	public ArrayList<Carta> cartasQueBuscoCompuesta(Filtro f, String nombreAtributo1, String nombreAtributo2){
	
		ArrayList<Carta> cartas = new ArrayList<>();
		for(Carta c: mazo.getCartas()) {
			cartas.addAll(c.cumpleBusquedaCompuesta(f, nombreAtributo1, nombreAtributo2));
		}
		return cartas;
	}
	
	
	
}
