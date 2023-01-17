
public class Pelicula extends ProductoAlquilable{
	
	private String titulo;
	private int maxStock;
	private int stock;
	
	public Pelicula(int maxStock) {
		this.maxStock = maxStock;
		this.stock = maxStock;
	}
	
	public boolean sePuedeAlquilar() {
		return (stock > 1);
	}
	
	public void AlquilarProducto() {
		if (stock > 1) {
			stock--;
		}		
	}
	
	public void devolveProducto() {
		if (stock < maxStock) {
			stock++;
		}		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getMaxStock() {
		return maxStock;
	}
	public void setMaxStock(int maxStock) {
		this.maxStock = maxStock;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
