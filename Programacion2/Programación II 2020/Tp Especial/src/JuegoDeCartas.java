import java.util.ArrayList;

public class JuegoDeCartas {
	Mazo mazoDeCartas;
	private Jugador j1;
	private Jugador j2;
	public int maxRondas;
	
	public JuegoDeCartas(Jugador jugador1, Jugador jugador2, Mazo mazoDeCartas, int maxRondas) {
		this.j1 = jugador1;
		this.j2 = jugador2;
		this.maxRondas = maxRondas;
		this.mazoDeCartas = mazoDeCartas;
	}
	
	// Iniciar juego
	public void iniciarJuego() {
		mazoDeCartas.mezclarCartas();
		repartirCartas(j1, j2);
		Jugador jugadorConTurno = j1;
		Jugador jugadorEnEspera = j2;
		for (int i = 0; i < maxRondas; i++) {
			if (j1.getCantCartas() > 0 && j2.getCantCartas() > 0) {
				Carta c1 = jugadorConTurno.sacarPrimeraCarta();
				Carta c2 = jugadorEnEspera.sacarPrimeraCarta();
				Atributo atributo =  jugadorConTurno.decidirAtributo(c1);
				System.out.println("\n\n------- Ronda "+i+" -------"
						+ "\nEl jugador "+jugadorConTurno+ " seleciona competir por "+atributo);
				System.out.print("La carta de "+jugadorConTurno+ " es "+c1+" con "+atributo+" "+c1.encontrarAtributo(atributo.getNombre()).getValor());
				if (c1.getPosion()!=null)
					System.out.print(", se aplicó pócima\n"+c1.getPosion()+" con valor resultante "+c1.getPosion().encantarAtributo(c1.encontrarAtributo(atributo.getNombre())).getValor());
				if (c2.getPosion()!=null)
					System.out.print(", se aplicó pócima\n"+c2.getPosion()+" con valor resultante "+c2.getPosion().encantarAtributo(c2.encontrarAtributo(atributo.getNombre())).getValor());
				if (c1.enfrentarCartas(c2, atributo.getNombre()) != 0) {
					if (c1.enfrentarCartas(c2, atributo.getNombre()) < 0) {
						Jugador aux;
						aux = jugadorConTurno;
						jugadorConTurno = jugadorEnEspera;
						jugadorEnEspera = aux;
					}
					jugadorConTurno.agregarCartaAlfondo(c1);
					jugadorConTurno.agregarCartaAlfondo(c2);
					System.out.println("\nGana la ronda "+jugadorConTurno.getNombre() +"\n"
							+ jugadorConTurno.getNombre()+" posee "+jugadorConTurno.getCantCartas()+" y "
							+ jugadorEnEspera.getNombre()+" posee "+jugadorEnEspera.getCantCartas());
				} else {
					jugadorConTurno.agregarCartaAlfondo(c1);
					jugadorEnEspera.agregarCartaAlfondo(c2);
					System.out.println("La ronda termino en empate");
				}
			} else {
				break;
			}
		}
		System.out.println("------- Victoria -------");
		if (j1.getCantCartas() > j2.getCantCartas()) {
			System.out.println("El jugador "+j1.getNombre()+" gana con "+j1.getCantCartas()+" cartas");
		} else if (j2.getCantCartas() > j1.getCantCartas()) {
			System.out.println("El jugador "+j2.getNombre()+" gana con "+j2.getCantCartas()+" cartas");
		} else {
			System.out.println("El juego termino en empate");
		}
		pedirCartas(j1);
		pedirCartas(j2);
	}
	
	// Repartir las pocimas pasadas por parametro a las cartas mezcladas
	public void asignarPocimas(ArrayList<Pocima> pocimas) {
		mazoDeCartas.mezclarCartas();
		Mazo mazo = new Mazo();
		Carta carta;
		while (!mazoDeCartas.isEmpty()) {
			carta = this.mazoDeCartas.peek();
			this.mazoDeCartas.pop();
			if(!pocimas.isEmpty()) {
				carta.setPocion(pocimas.get(0));
				pocimas.remove(0);
			}
			mazo.push(carta);
		}
		this.mazoDeCartas = mazo;
	}
	
	// Repartir las cartas entre los jugadores
	private void repartirCartas(Jugador j1, Jugador j2) {
		while (!mazoDeCartas.isEmpty()) {
			this.darCarta(j1);
			if(!mazoDeCartas.isEmpty()) {
				this.darCarta(j2);
			}
		}
	}
	
	// Dar las cartas  alos jugadores
	private void darCarta(Jugador j) {
		j.agregarCartaAlfondo(mazoDeCartas.peek());
		mazoDeCartas.pop();
	}
	
	// Pedir las cartas a los jugadores
	private void pedirCartas(Jugador j) {
		while(!j.sinCartas()) {
			Carta carta = j.sacarPrimeraCarta();
			mazoDeCartas.push(carta);
		}
	}
	
	// Cambiar el mazo que se está utilizando, y devolverlo
	public Mazo cambiarMazo(Mazo mazoDeCartas) {
		Mazo aux = this.mazoDeCartas;
		this.mazoDeCartas = mazoDeCartas;
		return aux;
	}
}
