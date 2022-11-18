public class Main {

	public static void main(String[] args) {
		
	//	Juego j1 = new Juego();
		
	//	j1.jugar();
/*		
		Dado d1 = new Dado(10);
		System.out.println("primera " + d1.getCara());
		
		Dado d2 = new Dado(8);
		
		Dado d3 = new Dado();
		
		d3.setCantidadCaras(10);
		
		for (int i= 0;i< 10 ; i++) {
		//	System.out.println("Salio " + d1.tirar());
		//	System.out.println("Salio2 " + d2.tirar());
		}
		
		
		
		Cubilete cubilete1 = new Cubilete(10);
		for (int i= 0;i< 10 ; i++) {
			System.out.println("EL cub salio " + cubilete1.tirar());
		}
*/
		JuegoDados juegoNuevo = new JuegoDados("Luis", "Sebastian",8);
		JuegoDados juegoOtro = new JuegoDados("Matias", "Sebastian",6);
		
		juegoNuevo.jugar();
		
		juegoOtro.jugar();
		
		System.out.println(juegoNuevo);
		System.out.println(juegoOtro);
		
		Jugador j1 = new Jugador("Sebastian");
		
		Jugador j2 = new Jugador("Sebastian");
		j1=j2;
		//j1.incrementarPuntos();
		// SI SON EL MISMO OBJETO 
		if (j1 == j2) { // COMPARA OBJETOS ES DECIR DIRECCIONES DE MEMORIA
			System.out.println("SON IGUALES");
		} else
			System.out.println("SON DISTINTOS");
			
		if (j1.equals(j2)) {
			System.out.println("SON IGUALES");
		} else
			System.out.println("SON DISTINTOS");
		
		
		
		
	}

}