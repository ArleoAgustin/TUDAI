package tp6.ej1;

public class Pelicula extends Item {
	
	private String nombre;
	private int copias;
	
	
	public Pelicula(String nombre, int cantPelicula) {
		this.setNombre(nombre);
		this.copias = cantPelicula;
	}

	@Override
	public boolean sePuedeAlquilar() {
		
		if(copias >=1)
			return true;
		else
			return false;
	}

	@Override
	public void alquilarItem() {
		if(this.sePuedeAlquilar())
			this.copias--;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
