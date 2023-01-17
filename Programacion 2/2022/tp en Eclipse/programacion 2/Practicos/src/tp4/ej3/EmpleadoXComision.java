package tp4.ej3;

public class EmpleadoXComision extends Empleado {

	private int ventas;
	private double comisionXVenta = 0.1;
	private double precioProducto;
	
	public EmpleadoXComision(double salario, int ventas) {
		super(salario);
		this.precioProducto = 500;
		this.ventas = ventas;
	}
	
	public double getSalario() {
		
		return super.getSalario() + obtenerPorcentaje();
		
	}
	
	public double obtenerPorcentaje() {
		
		return this.ventas * this.precioProducto * this.comisionXVenta;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public double getComisionXVenta() {
		return comisionXVenta;
	}

	public void setComisionXVenta(double comisionXVenta) {
		this.comisionXVenta = comisionXVenta;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
	
		

}
