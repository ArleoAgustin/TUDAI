
public class Main {

	public static void main(String[] args) {
		/*
		 * El contingente de la selecci�n de f�tbol de un pa�s est� formado
		 * tanto por futbolistas como por un cuerpo t�cnico. Cada integrante del
		 * contingente posee un nombre, apellido, n�mero de pasaporte y fecha de
		 * nacimiento. Los futbolistas, adem�s, poseen una posici�n, si es zurdo
		 * o derecho y la cantidad de goles convertidos. Los entrenadores poseen
		 * un identificador de la federaci�n a la que pertenecen y los
		 * masajistas el t�tulo que poseen y la cantidad de a�os de experiencia.
		 * El sistema debe permitir conocer el estado de una persona. El estado
		 * puede ser �Viajando�, �En concentraci�n�, �En pa�s de origen�. Se
		 * debe poder saber si una persona est� disponible o no para un evento
		 * solidario para recaudar fondos. Una persona estar� disponible si est�
		 * en el pa�s de origen y no est� concentrando para un partido. Nota:
		 * Una misma persona no comparte dos roles distintos, por ejemplo un
		 * t�cnico no puede ser futbolista, ni masajista.
		 */
		
		Futbolista futbolista1 = new Futbolista("Juan", "Viajando");
		Futbolista futbolista2 = new Futbolista("Juan", "Pa�s de origen");
		Entrenador entrenador = new Entrenador("Juan", "Pa�s de origen", 12312);
		Masajista masajista = new Masajista("Juan", "Viajando", "T�tulo de no m�sico",12312);
		futbolista1.disponibleParaEvento();
		futbolista2.disponibleParaEvento();
		entrenador.disponibleParaEvento();
		masajista.disponibleParaEvento();
		
	}

}
