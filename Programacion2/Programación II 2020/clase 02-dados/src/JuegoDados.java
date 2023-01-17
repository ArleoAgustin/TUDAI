public class JuegoDados {
	
	Jugador j1;
	Jugador j2;
	Cubilete vaso;
	
	
	public JuegoDados(String nombre1, String nombre2, int caras) {
		j1 = new Jugador(nombre1);
		j2 = new Jugador(nombre2);
		vaso = new Cubilete(caras);
	}
	
	public void jugar() {
		
		int tirada1=0;
		int tirada2=0;
		for(int i=0; i<10; i++) {
			tirada1= j1.tirarDados(vaso);
			tirada2= j2.tirarDados(vaso);
			if ((tirada1>=7)&&(tirada1>tirada2)){
				j1.incrementarPuntos();
			}else 
				if ((tirada2>=7)&&(tirada2>tirada1)) {
					j2.incrementarPuntos();
				}
	
		}//SALGO DEL FOR
		
		Jugador ganador = getGanador();
		
		if (ganador!=null) {
			System.out.println("Gano el jugador " + ganador.getNombre() );
		} else {
			System.out.println("Hubo un empate");
		}
		
		
	}
	
	
	public Jugador getGanador() {
		if (j1.getPuntos()>j2.getPuntos()) {
			return j1;
		} else if (j2.getPuntos()>j1.getPuntos()) {
			return j2;
		} else {
			return null;
		}
	}

}