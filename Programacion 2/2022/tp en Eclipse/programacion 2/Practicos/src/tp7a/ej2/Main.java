package tp7a.ej2;

import tp7a.ej2.condicion.Condicion;
import tp7a.ej2.condicion.CondicionAnd;
import tp7a.ej2.condicion.CondicionAutor;
import tp7a.ej2.condicion.CondicionCantPalabrasContenido;
import tp7a.ej2.condicion.CondicionContenidoPalabraClave;
import tp7a.ej2.condicion.CondicionMismoTitulo;
import tp7a.ej2.condicion.CondicionNot;
import tp7a.ej2.condicion.CondicionTituloContienePalabra;
import tp7a.ej2.condicion.ContienePalabraClave;

public class Main {

	public static void main(String[] args) {
	
		Biblioteca b = new Biblioteca();
		
		Documento d1 = new Documento("Aventuras de Pablito", "Pablito clavo un clavito que clavo Paulito");
		Documento d2 = new Documento("Marcas de perifericos", "El teclado logitech esta bueno");
		Documento d3 = new Documento("Descripcion de computadora", "La compu vuela");
		
		d1.addPalabrasClaves("clavo");
		d1.addPalabrasClaves("Zapato");
		d1.addPalabrasClaves("un");
		
		d2.addPalabrasClaves("El");
		d2.addPalabrasClaves("si");
		
		d3.addPalabrasClaves("compu");
		
		d1.addAutores("Agustin");
		d1.addAutores("Gallardo");
		d1.addAutores("Duki");

		d3.addAutores("CRO");
		d3.addAutores("Icardi");
		
		b.addDocumento(d1);
		b.addDocumento(d2);
		b.addDocumento(d3);
		
		Condicion c1 = new ContienePalabraClave("clavo");
		Condicion c2 = new CondicionMismoTitulo("Marcas de perifericos");
		Condicion c3 = new CondicionTituloContienePalabra("Aventuras");
		Condicion c4 = new CondicionContenidoPalabraClave("e"); //error
		Condicion c5 = new CondicionCantPalabrasContenido(2);
		Condicion c6 = new CondicionAutor("Gallardo");
		Condicion c7 = new CondicionAnd(c1,c6);
		Condicion c8 = new CondicionNot(c7);
		
		System.out.println(b.buscarDocumentos(c4));
	}

}
