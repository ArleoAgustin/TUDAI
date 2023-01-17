package tp4.ej4;

public class Main {

	public static void main(String[] args) {

		Seleccion s = new Seleccion("Argentina");
		
		Persona j1 = new Futbolista("Agustin", "Arleo", "En concentracion", 15);
		Persona j2 = new Futbolista("Agustin", "Soar", "En pais de origen", 11);
		Persona j3 = new Futbolista("Kako", "Garcia", "En viaje", 13);
		Persona j4 = new Futbolista("Vago", "SS", "En pais de origen", 10);
		
		Persona m1 = new Masajista("CCC", "AAA", "En pais de origen", 9);
		Persona m2 = new Masajista("ZZZ", "VVV", "En concentracion", 5);
		Persona e = new Entrenador("Gallardo", "Marcelo", "En concentracion", 1);
		
		s.addPersona(j1);
		s.addPersona(j2);
		s.addPersona(j3);
		s.addPersona(j4);
		s.addPersona(m1);
		s.addPersona(m2);
		s.addPersona(e);
		
		System.out.println(s.estaDisponible(j4));
	}

}
