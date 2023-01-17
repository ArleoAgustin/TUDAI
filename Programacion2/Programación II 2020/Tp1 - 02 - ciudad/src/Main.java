
public class Main {

	public static void main(String[] args) {
		
		Provincia prov1 = new Provincia("Buenos Aires");
		Provincia prov2 = new Provincia("Cordoba");
		
		System.out.println("La ciudad "+prov1.getNombre()+" tiene deficit "+prov1.getDeficitCiudades());
		System.out.println("La ciudad "+prov2.getNombre()+" tiene deficit "+prov2.getDeficitCiudades());
		
	}

}
