
public class Main {

	public static void main(String[] args) {
		
		/*Dudas
		 * Retornar objetos - instancias
		 * Vector - array lint - como añadir elementos 
		 * como nombrar funciones y parametros
		 * iterar la creacion de instancias
		 * cuando igualas un objetoa otro se iguala la direccion de memeoria
		 * Los metodos que piden datos tienen que retornar o imprimir
		 * */
		
		Serie serie1 = new Serie(4, "Amor y Caballos");
		serie1.dameDatos();
		serie1.darPromedioSerie();
		serie1.obtenerEpisodiosVistos();
		serie1.dameDatosTemporadas();
		serie1.dameDatosTemporadasEpisodios();
	}

}
