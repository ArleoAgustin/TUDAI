package ejemploDados;

public class Main {

	public static void main(String[] args) {
		
		Jugador j1 = new Jugador("Agustin");
		Jugador j2 = new Jugador("Lucas");
		
		Juego j = new Juego(10, j1,j2);
		
	j.Jugar();	
	}

}
