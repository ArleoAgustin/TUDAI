package ejemploDados;
public class Juego {

	private int cantRondas;
	private Jugador j1;
	private Jugador j2;
	private Cubilete cub = new Cubilete();
	
	public Juego (int cantRondas, Jugador j1, Jugador j2) {
		this.cantRondas = cantRondas;
		this.j1 = j1;
		this.j2 = j2;
	}
	
	public void Jugar() {
		
		for(int i = 0; i< this.cantRondas;i++){
			int puntos1, puntos2;
			
			j1.tirar(cub);
			puntos1 = this.cub.getValor();
			j2.tirar(cub);
			puntos2 = this.cub.getValor();
	
			if(puntos1 >= 7 && puntos1 > puntos2) {
				System.out.println(j1.getNombre()+" gana la ronda con " + puntos1);
				j1.incrementarPuntos();
			}
			
			else if (puntos2 >= 7 && puntos2 > puntos1) {
				System.out.println(j2.getNombre()+" gana la ronda con " + puntos2);
				j2.incrementarPuntos();
			}
			
			else if (puntos1 < 7 && puntos2 <7)
				System.out.println("Los dados sacados fueron menor que 7");
			
			else
				System.out.println("La ronda termino en empate");
		}
		
		System.out.println("");
		System.out.println("");
		
		if(this.ganador()!= null) 
			
			System.out.println("El ganador es "+ this.ganador().getNombre() +" con un total de "+ this.ganador().getCantPuntos() + " puntos");

		else
			System.out.println("El juego termino en empate");
		
	}
	
	
	public Jugador ganador() {
		
		if(j1.getCantPuntos() > j2.getCantPuntos())
			return j1;
	
		else if(j2.getCantPuntos() > j1.getCantPuntos())
			return j2;
		else
			return null;
			
			
	}
}
