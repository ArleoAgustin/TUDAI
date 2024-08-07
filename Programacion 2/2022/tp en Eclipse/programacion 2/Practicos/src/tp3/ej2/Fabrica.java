package tp3.ej2;

import java.util.ArrayList;

public class Fabrica {
	
	private ArrayList<Producto> productosDisponibles = new ArrayList<Producto>();
	
	static final int porcentajePrecioDeVenta = 35;
	public Fabrica() {
		
	}
	
	public double calcularCostoFabricacionProductos() {
		
		double valor = 0;
		for(Producto p: this.productosDisponibles) {
				valor+= p.getCostoFabricacion();
		}
		return valor;
	}
	
	public double calcularValorDeVentaDeProductos() {
		
		double valor = 0;
		for(Producto p: this.productosDisponibles) {
				valor+= p.getCostoFabricacion() + ((this.porcentajePrecioDeVenta / 100) * p.getCostoFabricacion());
		}
		return valor;
	}
	
	public ArrayList<Producto> getProductosDisponibles() {
		return productosDisponibles;
	}

	public void setProductosDisponibles(ArrayList<Producto> productosDisponibles) {
		this.productosDisponibles = productosDisponibles;
	}
	
	

	
}
