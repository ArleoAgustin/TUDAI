package Juego;

import ElementosDeJuego.Atributo;
import ElementosDeJuego.Carta;
import ElementosDeJuego.Mazo;
import Jugadores.Jugador;
public class Juego {
	
	private Mazo mazo;
	private Jugador j1;
	private Jugador j2;
	private Jugador jugadorConTurno;
	private Jugador jugadorEnEspera;
	private int cantRondas;
	
//hay dos constructores, uno para cuando se quiere jugar por rondas y otro para jugar hasta que uno de los dos jugadores pierda
	
	public Juego(Jugador j1, Jugador j2, Mazo mazo, int cantRondas) {
		this.j1 = j1;
		this.j2 = j2;
		this.jugadorConTurno = j1;
		this.jugadorEnEspera = j2;
		this.cantRondas = cantRondas;
		this.mazo = mazo;
	}
	
	public Juego(Jugador j1, Jugador j2, Mazo mazo) {
		this.j1 = j1;
		this.j2 = j2;
		this.jugadorConTurno = j1;
		this.jugadorEnEspera = j2;
		this.cantRondas = 0;
		this.mazo = mazo;
		
	}
	

//se inicia el juego
	
	public void iniciarJuego() {
		
		this.mazo.mezclarCartas();
		this.repartirCartas();
		
		System.out.println(" ");
		System.out.println(j1.getNombre() +" tiene "+j1.getCartas().size() + " cartas");
		System.out.println(j2.getNombre() + " tiene "+j2.getCartas().size() + " cartas");
		
		System.out.println(" ");
		
		if(this.cantRondas > 0) {	//si se quiere jugar por rondas
			
			System.out.println("El modo de juego: Por rondas");
			for(int i =0; i<=this.cantRondas;i++) {
				jugar(i);	
			}
			
		}
		else {
			System.out.println("El modo de juego: El que llega a 0 cartas pierde");
			int i = 0;
			while(j1.tieneCartas() && j2.tieneCartas()) {
				jugar(i);
				i++;
			}
		}
		
		System.out.println(" ");
		System.out.println("FIN DEL JUEGO");
		System.out.println(" ");
		System.out.println("------------------------------------- ");
		if (j1.getCartas().size() > j2.getCartas().size()) 
			System.out.println(j1.getNombre()+" gano la partida");
		else if (j2.getCartas().size() > j1.getCartas().size()) 
			System.out.println(j2.getNombre()+" gano la partida");
		 else 
			System.out.println("El juego termino en empate");
		System.out.println("------------------------------------- ");
		
		pedirCartas(j1);
		pedirCartas(j2);
		
	
	}
	

	public void jugar(int i) {
		
		if(j1.tieneCartas() && j2.tieneCartas()) {
			
			System.out.print("-----------------------------------------------------\n");
			System.out.print("Nro de ronda: " + i);
			System.out.println(" ");
			System.out.print("\nEl turno lo tiene "+jugadorConTurno.getNombre()+"\n");
			Carta c1 = jugadorConTurno.tomarPrimeraCartaMonton();
			Carta c2 = jugadorEnEspera.tomarPrimeraCartaMonton();
			Atributo atributoAcompetir = jugadorConTurno.seleccionarAtributo(c1);
			System.out.print("La carta que eligio "+jugadorConTurno.getNombre()+ " es "+ c1.getNombre()+"\n");
			System.out.print("La carta que eligio "+jugadorEnEspera.getNombre()+ " es "+ c2.getNombre()+"\n");
			System.out.println("Atributo seleccionado: "+atributoAcompetir.getNombreAtributo());
			System.out.println("El atributo de "+ jugadorConTurno.getNombre()+ " tiene un valor de " +c1.encontrarAtributo(atributoAcompetir.getNombreAtributo()).getPoderAtributo());
			System.out.println("El atributo de "+ jugadorEnEspera.getNombre()+ " tiene un valor de " +c2.encontrarAtributo(atributoAcompetir.getNombreAtributo()).getPoderAtributo());

			if (c1.enfrentarCartas(c2, atributoAcompetir.getNombreAtributo()) != 0) {

				if (c1.enfrentarCartas(c2, atributoAcompetir.getNombreAtributo()) < 0) {
				
					System.out.println(jugadorEnEspera.getNombre()+ " gano la ronda");
					Jugador aux = jugadorConTurno;
					jugadorConTurno = jugadorEnEspera;
					jugadorEnEspera = aux;
					
				}
				else if(c1.enfrentarCartas(c2, atributoAcompetir.getNombreAtributo()) > 0) {

					System.out.println(jugadorConTurno.getNombre()+ " gano la ronda");
				}
				jugadorConTurno.agregarCartaAlfondo(c1);
				jugadorConTurno.agregarCartaAlfondo(c2);
			}
			else {
				jugadorConTurno.agregarCartaAlfondo(c1);
				jugadorEnEspera.agregarCartaAlfondo(c2);
				System.out.println("La ronda termino en empate");
			}
			System.out.println(" ");
			System.out.println(j1.getNombre() +" tiene "+j1.getCartas().size() + " cartas");
			System.out.println(j2.getNombre() + " tiene "+j2.getCartas().size() + " cartas");
			
			
		}

	}
	
// Pedir las cartas a los jugadores
	
private void pedirCartas(Jugador j) {
	
	while(!j.getCartas().isEmpty()) {
		Carta carta = j.sacarPrimeraCarta();
		mazo.agregarCarta(carta);
	}
}

//reparte las cartas entre los jugadores
	
	public void repartirCartas() {	

		if(this.mazo.esImpar()) {
			System.out.println("Se repartio la misma cantidad de cartas para ambos jugadores");
			mazo.getCartas().remove(0);
		}
		
		while (!mazo.estaVacio()) {
			this.darCarta(j1);
			if(!mazo.estaVacio()) {
				this.darCarta(j2);
			}
		}

		System.out.println("Se repartieron las cartas");
		
	}
	
	
//el jugador agarra la carta	
	
	public void darCarta(Jugador j) {
		
		j.agarrarCartaRepartida(mazo.obtenerPrimerCarta());
		mazo.quitarPrimeraCarta();
		
	}
	
}
