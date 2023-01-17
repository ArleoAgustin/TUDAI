import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class Main {

	public static void main(String[] args) {
		EstrategiaDeJuego edj1 = new Ambicioso();
		EstrategiaDeJuego edj2 = new Obstinado("fuerza");
		Jugador j1 = new Jugador("Juan", edj1);
		Jugador j2 = new Jugador("Pedro", edj2);
		Mazo mazoDeCartas = new Mazo();
		cargarBarajaPoDefetoConCartas(mazoDeCartas);
		JuegoDeCartas jdc = new JuegoDeCartas(j1, j2, mazoDeCartas, 100);
		jdc.asignarPocimas(cargarBarajaPoDefetoConCartasConPocimas());
		jdc.iniciarJuego();
	}

	/*
	 * Hola el trabajo esta aprobado:En carta, encontrarAtributoConPocima
	 * deberia recibir un nombre.en pocima abstracta con un metodo alcanza,
	 * deberia recibir atributo y devolver valor, no nombre y valor.
	 * Las pocimas
	 * Deberian recibir atributo. Q tenga un solo metodo que reciba atributo y
	 * devuelva valor es suficiente.Para el log podria mejorarse el
	 * imprimirValorPocima, haciendo que la carta tenga un toString y q ella
	 * muestre o no el valor de la pocima segun tenga o no, no preguntar en
	 * juego si tiene para mostrar de una u otra manera.
	 */

	public static void cargarBarajaPoDefetoConCartas(Mazo mazo) {
		String mazoPath = "./superheroes.json";
		// String mazoPath = "./autos.json";
		File jsonInputFile = new File(mazoPath);
		InputStream is;
		try {
			is = new FileInputStream(jsonInputFile);
			JsonReader reader = Json.createReader(is);
			JsonArray cartas = (JsonArray) reader.readObject().getJsonArray(
					"cartas");
			for (JsonObject cartaJson : cartas.getValuesAs(JsonObject.class)) {
				String nombreCarta = cartaJson.getString("nombre");
				JsonObject atributos = (JsonObject) cartaJson
						.getJsonObject("atributos");
				Carta carta = new Carta(nombreCarta);
				for (String nombreAtributo : atributos.keySet()) {
					Atributo atributo = new Atributo(nombreAtributo,
							atributos.getInt(nombreAtributo));
					carta.addAtributo(atributo);
				}
				mazo.push(carta);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Pocima> cargarBarajaPoDefetoConCartasConPocimas() {
		ArrayList<Pocima> pocimas = new ArrayList<Pocima>();

		pocimas.add(new PocimaGeneral("Foralecedora", 25));
		pocimas.add(new PocimaGeneral("Foralecedora plus", 50));
		pocimas.add(new PocimaGeneral("Foralecedora plus max", 75));
		pocimas.add(new PocimaGeneral("Foralecedora plus max duper", 100));

		pocimas.add(new PocimaGeneral("Kriptonita", -25));
		pocimas.add(new PocimaGeneral("Reductor de Plomo", -50));
		pocimas.add(new PocimaGeneral("Reductor plus max", -75));

		pocimas.add(new PocimaConstante("Quiero vale 4", 4));
		pocimas.add(new PocimaConstante("Número Mágico", 27));

		pocimas.add(new PocimaEspecifica("Pócima Selectiva Fuerza", 20,
				"Fuerza"));
		pocimas.add(new PocimaEspecifica("Pócima Selectiva Altura", 20, "Altua"));
		pocimas.add(new PocimaEspecifica("Pócima Selectiva Peso", 20, "Peso"));
		pocimas.add(new PocimaEspecifica("Pócima Selectiva Fuerza", 20,
				"Velocidad"));

		PocimaCompuesta pocimaConktail0 = new PocimaCompuesta();
		PocimaCompuesta pocimaConktail1 = new PocimaCompuesta();
		PocimaCompuesta pocimaConktail2 = new PocimaCompuesta();

		pocimaConktail1.addPocima(pocimaConktail2);
		pocimaConktail1.addPocima(new PocimaGeneral(
				"Foralecedora plus max duper", 100));

		pocimaConktail2
				.addPocima(new PocimaGeneral("Foralecedora plus max", 75));
		pocimaConktail2.addPocima(new PocimaEspecifica("Pócima Selectiva RPM",
				20, "RPM"));

		pocimaConktail0.addPocima(new PocimaEspecifica(
				"Pócima Selectiva Fuerza", 20, "Fuerza"));
		pocimaConktail0.addPocima(new PocimaGeneral("Foralecedora", 25));

		pocimas.add(pocimaConktail0);
		pocimas.add(pocimaConktail1);
		pocimas.add(pocimaConktail2);

		return pocimas;
	}
}
