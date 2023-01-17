
public class main {

	public static void main(String[] args) {
		
		System.out.println("Primer constructor:");
		PuntoGeometrico punto1 = new PuntoGeometrico(1, 4);
		PuntoGeometrico punto2 = new PuntoGeometrico(-4,-1);
		PuntoGeometrico punto3 = new PuntoGeometrico(2, 6);
		PuntoGeometrico punto4 = new PuntoGeometrico(4, 5);
		Rectangulo rectangulo1 = new Rectangulo(punto1, punto2);
		Rectangulo rectangulo2 = new Rectangulo(punto3, punto4);
		
		rectangulo1.dameDatos();
		rectangulo2.dameDatos();
		System.out.println("\n\nEl primer rectangulo es mayor que el segundo: "+rectangulo1.rectanguloMayor(rectangulo2));
	

		System.out.println("\n\nSegundo constructor:");
		Rectangulo rectangulo3 = new Rectangulo(punto1, 4, 2);
		Rectangulo rectangulo4 = new Rectangulo(punto3, 10, 8);
		rectangulo3.dameDatos();
		rectangulo4.dameDatos();
		System.out.println("\n\nEl primer rectangulo es mayor que el segundo: "+rectangulo3.rectanguloMayor(rectangulo4));

	}

}
