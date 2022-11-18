
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Cliente cnuevo = new Cliente("Marcelo", "Armentano", null, 0, 0);

	cnuevo.addAutor("Borges");
	cnuevo.addGenero("Accion");
	
	Producto pp = new Producto("xxx", "Borges", null, 0, 0);

	pp.addGenero("Accion2");
	
	System.out.println(cnuevo.leGusta(pp));
	
	cnuevo.setComportamiento(new ComportamientoExigente());
	
	System.out.println(cnuevo.leGusta(pp));
	
	cnuevo.setComportamiento(new ComportamienbtoTodoBien());
	
	pp.setAutor("Otro");
	System.out.println(cnuevo.leGusta(pp));
	
	}

}
