
public class Main {
	public static void main(String[] args) {
		
		productoAvicola producto0 = new productoFresco("p1", 67);
		productoFresco producto1 = new productoFresco("p1", 67);
		productoRefrigerado producto2  = new productoRefrigerado("p1", 67);
		productoCongeladoAire producto3 = new productoCongeladoAire("p1", 67);
		productoRefrigeradoAgua producto4 = new productoRefrigeradoAgua("p1", 67);
		productoCongeladoNitrogeno producto5 =  new productoCongeladoNitrogeno("p1", 67);
		producto0.imprimirDatos();
		producto1.imprimirDatos();
		producto2.imprimirDatos();
		producto3.imprimirDatos();
		producto4.imprimirDatos();
		producto5.imprimirDatos();
	}
}
