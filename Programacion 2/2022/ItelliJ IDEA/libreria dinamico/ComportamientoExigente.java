import java.util.ArrayList;

public class ComportamientoExigente extends Comportamiento {

	@Override
	public boolean leGusta(Cliente c, Producto p) {
	 ArrayList<String> generos = c.getGeneros();
		
		for (int i =0; i<generos.size();i++) {
			if (
					(p.tieneGenero(generos.get(i)))
							&& 
					(c.leGustaAutor(p.getAutor()))
				) 
					
					{
				return true;
			}
		}
		return false;
	}

}
