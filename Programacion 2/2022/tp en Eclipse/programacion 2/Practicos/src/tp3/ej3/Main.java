package tp3.ej3;

public class Main {

	public static void main(String[] args) {

		//cualidades para personaje 1
		
				Cualidad c1 = new Cualidad("vision nocturna", 150);
				Cualidad c2 = new Cualidad("velocidad", 200);
				Cualidad c3 = new Cualidad("Fuerza", 410);
				Cualidad c4 = new Cualidad("Edad", 33);
			
			//cualidades para personaje 2
			
				Cualidad cc1 = new Cualidad("vision nocturna", 150);
				Cualidad cc2 = new Cualidad("velocidad", 55);
				Cualidad cc3 = new Cualidad("Fuerza", 400);
				Cualidad cc4 = new Cualidad("Edad", 50);
				
			//personajes
				
				Personaje p1 = new Personaje("Agustin", "Batman");
				Personaje p2 = new Personaje("Lucas", "Capitan america");
			
			//agrego cualidades
				
				p1.addCualidad(c1);
				p1.addCualidad(c2);
				p1.addCualidad(c3);
				p1.addCualidad(c4);
				
				p2.addCualidad(cc1);
				p2.addCualidad(cc2);
				p2.addCualidad(cc3);
				p2.addCualidad(cc4);
				
				Juego j = new Juego(p1, p2);
				
				j.jugar(c4);

	}

}
