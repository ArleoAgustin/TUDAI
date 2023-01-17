package tp4.ej5;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Avicola a = new Avicola();
		
		Producto p1 = new ProductoFresco(LocalDate.of(2022, 9, 4), 1555,"nashe", LocalDate.of(2022, 9, 1),
				"Los pinos");
		Producto p2 = new CongeladoXnitrogeno(LocalDate.of(2022, 9, 2), 121,"godines", LocalDate.of(2022, 9, 5),
				"El sol", 44, -50, "Seco", 10);
		
		
		a.addProducto(p1);
		a.addProducto(p2);
		System.out.println(a.imprimirDAtosProductos(p2));
	}

}
