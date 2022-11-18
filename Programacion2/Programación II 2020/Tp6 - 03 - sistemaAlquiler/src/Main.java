
public class Main {

	public static void main(String[] args) {

		ProductoAlquilable p1 = new Pelicula(4);
		ProductoAlquilable p2 = new Pelicula(4);
		ProductoAlquilable p3 = new Pelicula(4);
		ProductoAlquilable p4 = new Pelicula(4);
		ProductoAlquilable p5 = new Pelicula(4);
		ProductoAlquilable p6 = new Vehiculo();
		ProductoAlquilable p7 = new Vehiculo();
		ProductoAlquilable p8 = new Vehiculo();
		ProductoAlquilable p9 = new Vehiculo();
		ProductoAlquilable p10 = new Vehiculo();
		
		Videoclub vc = new Videoclub();
		
		vc.addProducto(p1);	
		vc.addProducto(p2);	
		vc.addProducto(p3);	
		vc.addProducto(p4);	
		vc.addProducto(p5);	
		vc.addProducto(p6);	
		vc.addProducto(p7);	
		vc.addProducto(p8);	
		vc.addProducto(p9);	
		vc.addProducto(p10);
		
		Cliente c1 = new Cliente("Juan");
		Cliente c2 = new Cliente("Pedro");
		Cliente c3 = new Cliente("Bib Bop 3000");
		
		vc.alquilarProducto(p1, "2020-02-20", c1);
		vc.alquilarProducto(p1, "2020-06-11", c2);
		vc.alquilarProducto(p1, "2020-09-05", c3);
		vc.alquilarProducto(p10, "2020-09-05", c3);
		vc.alquilarProducto(p10, "2020-09-05", c3);
	}

}
