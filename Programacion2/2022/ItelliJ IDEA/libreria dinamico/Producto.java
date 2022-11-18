import java.util.ArrayList;

public class Producto {

	String nombre;
	String autor;
	String resumen;
	ArrayList<String> generos;
	int cantidadPaginas;
	double precio;
	
	
	
	public Producto(String nombre, String autor, String resumen,  int cantidadPaginas,
			double precio) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.resumen = resumen;
		this.generos = new ArrayList<String>();
		this.cantidadPaginas = cantidadPaginas;
		this.precio = precio;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getResumen() {
		return resumen;
	}



	public void setResumen(String resumen) {
		this.resumen = resumen;
	}



	public int getCantidadPaginas() {
		return cantidadPaginas;
	}



	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public double getPrecio() {
		return precio;
	}
	
	
	public void addGenero(String  a) {
		if (! generos.contains(a))
			generos.add(a);
	}
	public boolean tieneGenero(String a) {
		return generos.contains(a);
	}
	public void borrarGenero(String a) {
		generos.remove(a);
	}



	
	public String toString() {
		return "Producto [nombre=" + nombre + ", autor=" + autor + ", resumen=" + resumen + ", generos=" + generos
				+ ", cantidadPaginas=" + cantidadPaginas + ", precio=" + precio + "]";
	}
	@Override
	public boolean equals(Object o1) {
		try {
			Producto elOtro = (Producto)o1;
			return nombre.equalsIgnoreCase(elOtro.getNombre())&&
					autor.equalsIgnoreCase(elOtro.getAutor());
		} catch (Exception e) {
			return false;
		}
	}
	
}
