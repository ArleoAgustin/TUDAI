
public class ComportamientoNormal extends Comportamiento {

	@Override
	public boolean leGusta(Cliente c, Producto p) {
		return c.leGustaAutor(p.getAutor());
	}

}
