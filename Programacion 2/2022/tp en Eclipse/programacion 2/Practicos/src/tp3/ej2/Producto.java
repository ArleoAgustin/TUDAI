package tp3.ej2;

public class Producto {
	
	private double peso, costoFabricacion, valorDeVenta;
	private String madera, color;
	
	public Producto(double peso, double costoFabricacion, double valorDeVenta, String madera, String color) {
		
		this.peso = peso;
		this.costoFabricacion = costoFabricacion;
		this.valorDeVenta = valorDeVenta;
		this.madera = madera;
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getCostoFabricacion() {
		return costoFabricacion;
	}

	public void setCostoFabricacion(double costoFabricacion) {
		this.costoFabricacion = costoFabricacion;
	}

	public double getValorDeVenta() {
		return valorDeVenta;
	}

	public void setValorDeVenta(double valorDeVenta) {
		this.valorDeVenta = valorDeVenta;
	}

	public String getMadera() {
		return madera;
	}

	public void setMadera(String madera) {
		this.madera = madera;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
