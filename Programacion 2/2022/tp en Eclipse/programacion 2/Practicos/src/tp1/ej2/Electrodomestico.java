package tp1.ej2;

public class Electrodomestico {
	
	private String nombre;
	private double precio;
	private String color;
	private double consumo;
	private double peso;
	
	public Electrodomestico(String nombre) {
		
		this.nombre = nombre;
		this.precio = 100;
		this.color = "gris plata";
		this.consumo = 10;
		this.peso = 2;
	}
	
	public boolean bajoConsumo() {
		
		return this.consumo < 45;
	}
	
	public double balance() {
		
		return this.precio / this.peso;
	}
	
	public boolean esAltaGama() {
		
		return this.balance() > 3;
	}
	
	

	@Override
	public String toString() {
		return "Electrodomestico [nombre=" + nombre + ", precio=" + precio + ", color=" + color + ", consumo=" + consumo
				+ ", peso=" + peso + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
}
