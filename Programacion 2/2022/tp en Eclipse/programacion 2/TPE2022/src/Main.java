import java.util.ArrayList;
import ElementosDeJuego.Atributo;
import ElementosDeJuego.Carta;
import ElementosDeJuego.Mazo;
import Filtros.*;
import Juego.Juego;
import Juego.OrganizadorDeJuego;
import Jugadores.Jugador;

public class Main {

	public static void main(String[] args) {
		
//de esta forma se crean las cartas con los atributos predefinidos (5)
		
		//Carta c = new Carta("momo", crearAtributos());	
	
//Se crean las cartas pasando la cantidad de atributos por parametro		
		
		Carta c1 = new Carta("Samir", crearAtributos(), 10);		
		Carta c2 = new Carta("Coco", crearAtributos(), 10);
		Carta c3 = new Carta("Fercho", crearAtributos(), 10);
		Carta c4 = new Carta("Kun", crearAtributos(), 10);
		Carta c5 = new Carta("Pipi", crearAtributos(), 10);
		Carta c6 = new Carta("Amarillento", crearAtributos(), 10);
		Carta c7 = new Carta("Coker", crearAtributos(), 10);
		Carta c8 = new Carta("Bob", crearAtributos(), 10);
		Carta c9 = new Carta("Alf", crearAtributos(), 10);
		Carta c10 = new Carta("Jup", crearAtributos(), 10);
		Carta c11 = new Carta("Ask", crearAtributos(), 10);

//se crea el mazo
		
		Mazo m = new Mazo();
	
//se agregan las cartas al mazo
		
		//m.agregarCarta(c);
		m.agregarCarta(c1);
		m.agregarCarta(c2);
		m.agregarCarta(c3);
		m.agregarCarta(c4);
		m.agregarCarta(c5);
		m.agregarCarta(c6);
		m.agregarCarta(c7);
		m.agregarCarta(c8);
		m.agregarCarta(c9);
		m.agregarCarta(c10);
		m.agregarCarta(c11);
		
//si el mazo no esta vacio o tiene mas de una carta comienza el juego
		
		if(!m.estaVacio() && m.getCartas().size() >1) {
			
			System.out.println(" ");
			System.out.println("En el mazo hay " +m.getCartas().size() +" cartas");
			System.out.println(" ");
			System.out.println(m.getCartas());
			System.out.println(" ");
	
//se instancian los jugadores
			
			Jugador j1 = new Jugador("Agustin");
			Jugador j2 = new Jugador("Gonzalo");

//modos de juego
		
			Juego juego1 = new Juego(j1, j2, m);				/*modo de juego: el primero que queda sin cartas pierde*/
			juego1.iniciarJuego();
	
			//Juego juego2 = new Juego(j1, j2, m, 10);			/*modo de juego: por rondas, en este caso 10 rondas*/
			//juego2.iniciarJuego();
		
		}
		else
			System.out.println("El mazo esta vacio o hay una sola carta");
		
		
/////////////////////////////////////////////////////FILTROS//////////////////////////////////////////////////////////////////////////	
		
//SE CREA EL ORGANIZADOR DE JUEGO
		
		OrganizadorDeJuego oj = new OrganizadorDeJuego(m);
		
//Todas las cartas cuyo atributo fuerza sea mayor a 10
		
		Filtro fAtributoMayor1 = new FiltroAtributoMayor(10);
		ArrayList<Carta> cartasMayor1 = oj.cartasQueBusco(fAtributoMayor1, "Fuerza");
		
//Todas las cartas cuyo atributo Liderazgo sea mayor a 30
		
		Filtro fAtributoMayor2 = new FiltroAtributoMayor(30);
		ArrayList<Carta> cartasMayor2 = oj.cartasQueBusco(fAtributoMayor2, "Liderazgo");
		
//Todas las cartas cuyo atributo “Astucia” sea menor a 10
		
		Filtro fAtributoMenor1 = new FiltroNot(new FiltroAtributoMayor(10));
		ArrayList<Carta> cartasMenor1 = oj.cartasQueBusco(fAtributoMenor1, "Astucia");
		
//Todas las cartas cuyo atributo velocidad sea igual a 35
		
		Filtro fAtributoIgual1 = new FiltroAnd(new FiltroAtributoMayor(35), new FiltroNot(new FiltroAtributoMayor(35)));
		ArrayList<Carta> cartasIguales = oj.cartasQueBusco(fAtributoIgual1, "Velocidad");
		
//Todas las cartas cuyo atributo Valentia sea menor a 29
		
		Filtro fAtributoMenor2 = new FiltroNot(new FiltroAtributoMayor(29));
		ArrayList<Carta> cartasMenor2 = oj.cartasQueBusco(fAtributoMenor2, "Valentia");
		
//Todas las cartas cuyo valor de fuerza sea mayor a 15 y tengan altura menor a 10
		
		Filtro fMayorYmenor =  new FiltroCompuesto(15,10);
		ArrayList<Carta> cartasMayoresYmenores = oj.cartasQueBuscoCompuesta(fMayorYmenor, "Fuerza","Altura");

		
//muestra por pantalla los resultados del filtro compuesto	
		
		System.out.println("");
		System.out.println("FILTRADOS");
		System.out.println("");
		if(!cartasMayor1.isEmpty())
			System.out.println("Cartas con fuerza > 10: ");
		System.out.println("");
		
		for(Carta c: cartasMayor1) {
			for(Atributo a: c.getAtributos()) {
				if(a.getNombreAtributo().equals("Fuerza")) {
					System.out.println(c);
					System.out.println(a.getNombreAtributo()+" " + a.getPoderAtributo());
				}
				
			}
		}
		System.out.println("");
		if(!cartasMayor2.isEmpty())
			System.out.println("Cartas con liderazgo > 30: ");
		System.out.println("");
		
		for(Carta c: cartasMayor2) {
			for(Atributo a: c.getAtributos()) {
				if(a.getNombreAtributo().equals("Liderazgo")) {
					System.out.println(c);
					System.out.println(a.getNombreAtributo()+" " + a.getPoderAtributo());
				}
				
			}
		}
		
		System.out.println("");
		if(!cartasMenor1.isEmpty())
			System.out.println("Cartas con astucia < 10: ");
		System.out.println("");
		
		for(Carta c: cartasMenor1) {
			for(Atributo a: c.getAtributos()) {
				if(a.getNombreAtributo().equals("Astucia")) {
					System.out.println(c);
					System.out.println(a.getNombreAtributo()+" " + a.getPoderAtributo());
				}
				
			}
		}
		System.out.println("");
		if(!cartasIguales.isEmpty())
			System.out.println("Cartas con velocidad igual 35: ");
		System.out.println("");
		
		for(Carta c: cartasIguales) {
			for(Atributo a: c.getAtributos()) {
				if(a.getNombreAtributo().equals("Velocidad")) {
					System.out.println(c);
					System.out.println(a.getNombreAtributo()+" " + a.getPoderAtributo());
				}
				
			}
		}	

		if(!cartasMenor2.isEmpty())
			System.out.println("Cartas con valentia < a 29: ");
		System.out.println("");
		
		for(Carta c: cartasMenor2) {
			for(Atributo a: c.getAtributos()) {
				if(a.getNombreAtributo().equals("Valentia")) {
					System.out.println(c);
					System.out.println(a.getNombreAtributo()+" " + a.getPoderAtributo());
				}
				
			}
		}	
		
		System.out.println("");
		if(!cartasMayoresYmenores.isEmpty())
			System.out.println("Resultados del filtro compuesto, fuerza > 15 y altura < 10: ");
		System.out.println("");
		
		for(Carta c: cartasMayoresYmenores) {
			for(Atributo a: c.getAtributos()) {
				if(a.getNombreAtributo().equals("Fuerza")) {
					System.out.println(c);
					System.out.println(a.getNombreAtributo()+" " + a.getPoderAtributo());
				}
				if(a.getNombreAtributo().equals("Altura")) {
					System.out.println(c);
					System.out.println(a.getNombreAtributo()+" " + a.getPoderAtributo());
				}
			}
		}
		
		
		
		
	
	}
		
	

	
	
//Se crean nombres para los atributos	
	
	public static ArrayList<String> nombresAtributos() {
		
		ArrayList<String> nombresAtributos = new ArrayList<String>();
		
		nombresAtributos.add("Fuerza");
		nombresAtributos.add("Ternura");
		nombresAtributos.add("Astucia");
		nombresAtributos.add("Travieso");
		nombresAtributos.add("Valentia");
		nombresAtributos.add("Liderazgo");
		nombresAtributos.add("Velocidad");
		nombresAtributos.add("Peso");
		nombresAtributos.add("Altura");
		nombresAtributos.add("Carisma");
		
		return nombresAtributos;
	}
	
	
//se crean los atributos segun la cantidad de nombres disponibles

	public static ArrayList<Atributo> crearAtributos() {
		
		ArrayList<String>nombresDeAtributos = nombresAtributos();
		
		ArrayList<Atributo> atributos = new ArrayList<Atributo>();
			
				if(!nombresDeAtributos.isEmpty()) {
					
					for(int j=0; j<nombresDeAtributos.size();j++) {
						
						atributos.add(new Atributo(nombresDeAtributos.get(j)));
						
					}
				
				}
		
		return atributos;
	}
	
	
}
