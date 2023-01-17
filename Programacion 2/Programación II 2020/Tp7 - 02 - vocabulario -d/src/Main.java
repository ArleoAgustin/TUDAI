
public class Main {

	public static void main(String[] args) {
		String text = "Java es un lenguaje de programaci�n y una plataforma inform�tica que fue comercializada por primera vez en 1995 por Sun Microsystems. Hay muchas aplicaciones y sitios web que no funcionar�n, probablemente, a menos que tengan Java instalado y cada d�a se crean m�s. Java es r�pido, seguro y fiable. Desde port�tiles hasta centros de datos, desde consolas para juegos hasta computadoras avanzadas, desde tel�fonos m�viles hasta Internet, Java est� en todas partes, si es ejecutado en una plataforma no tiene que ser recompilado para correr en otra. Java es, a partir de 2012, uno de los lenguajes de programaci�n m�s populares en uso, particularmente para aplicaciones de cliente-servidor de web, con unos diez millones de usuarios reportados."+

					"\nEl lenguaje de programaci�n Java fue desarrollado originalmente por James Gosling, de Sun Microsystems (constituida en 1983 y posteriormente adquirida el 27 de enero de 2010 por la compan�a Oracle), y publicado en 1995 como un componente fundamental de la plataforma Java de Sun Microsystems. Su sintaxis deriva en gran medida de C y C++, pero tiene menos utilidades de bajo nivel que cualquiera de ellos. Las aplicaciones de Java son compiladas a bytecode (clase Java), que puede ejecutarse en cualquier m�quina virtual Java (JVM) sin importar la arquitectura de la computadora subyacente."+

					"\nLa compan�a Sun desarroll� la implementaci�n de referencia original para los compiladores de Java, m�quinas virtuales y librer�as de clases en 1991, y las public� por primera vez en 1995. A partir de mayo de 2007, en cumplimiento de las especificaciones del Proceso de la Comunidad Java, Sun volvi� a licenciar la mayor�a de sus tecnolog�as de Java bajo la Licencia P�blica General de GNU. Otros han desarrollado tambi�n implementaciones alternas a estas tecnolog�as de Sun, tales como el Compilador de Java de GNU y el GNU Classpath. ";
		EstadisticaTexto et = new EstadisticaTexto(text);
		
		//System.out.println(text);
		System.out.println("La frecuencia de la palabra es es: "+et.getFrequencyWord("es"));
		System.out.println("Las palabras en orden alfabetico son: "+et.getWordsinAsendingOrder());
		System.out.println("Obtener palabras en orden por frecuencia: "+et.getWordsInFrequencyOrder());
		System.out.println("Obtener las 5 palabras m�s frecuentes: "+et.getWordsMoreFrequent(5));
		System.out.println("Obtener las 5 palabras menos frecuentes: "+et.getWordsLessFrequent(5));
		

	}

}
