package saltarin;

import java.util.ArrayList;

import saltarin.filtros.Filtro;
import saltarin.filtros.FiltroAnd;
import saltarin.filtros.FiltroPrecio;
import saltarin.filtros.FiltroVolumen;

public class Main {

	public static void main(String[] args) {

		Producto p1 = new Producto("p1","bic",10,10,10);
		Producto p2 = new Producto("p2","trabi",20,20,20);

		Kit kit2 = new Kit("kit2");
		Producto p3 = new Producto("p3","bic",30,30,30);
		kit2.add(p3);
		
		Kit kit1 = new Kit("kit1");
		kit1.add(p1);
		kit1.add(p2);
		kit1.add(kit2);

		/*System.out.println(kit1.getVolumen());
		System.out.println(kit1.getMarca());
		System.out.println(kit1.getPrecio());
		System.out.println(kit1.getCantidadProductos());*/
		
		// El producto/kit/paquete se publicita en el diario 
		// si el precio es mayor a 2500 y el volumen menor a 1000 cm3
		
		Filtro precio = new FiltroPrecio(25);
		Filtro vol = new FiltroVolumen(25);
		Filtro filtro = new FiltroAnd(precio, vol);
				
		Libreria libreria = new Libreria("Saltarin",filtro);
		libreria.add(kit1);
		
		ArrayList<Elemento> resultado = libreria.buscar(precio);
		
		System.out.println(resultado);
		
	}

}
