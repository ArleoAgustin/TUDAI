package parcialito4;

import java.util.ArrayList;

import parcialito4.Condiciones.Condicion;

public class CasaDeComputacion {
	
	private String nombre;
	private ArrayList<Producto> productosALaVenta;
	private ArrayList<Cliente> clientes;
	private ArrayList<Proveedor> proveedores;
	private ArrayList<Empleado> empleados;
	
	
	public CasaDeComputacion(String nombre) {
		
		this.nombre = nombre;
		this.productosALaVenta = new ArrayList<>();
		this.clientes = new ArrayList<>();
		this.proveedores = new ArrayList<>();
		this.empleados = new ArrayList<>();
	}

	


	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public ArrayList<Producto> getProductosALaVenta() {
		return new ArrayList<>(productosALaVenta);
	}




	public void addProductosALaVenta(Producto producto) {
		this.productosALaVenta.add(producto);
	}




	public ArrayList<Cliente> getClientes() {
		return new ArrayList<>(clientes);
	}




	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}




	public ArrayList<Proveedor> getProveedores() {
		return new ArrayList<>(proveedores);
	}




	public void addProveedor(Proveedor p) {
		this.proveedores.add(p);
	}




	public ArrayList<Empleado> getEmpleados() {
		return new ArrayList<>(empleados);
	}




	public void addEmpleado(Empleado e) {
		this.empleados.add(e);
	}




	public ArrayList<Producto> buscarProducto(Condicion c){
		
		ArrayList<Producto> busqueda = new ArrayList<>();
		
		for(Producto p: this.productosALaVenta) {
			if(c.cumple(p))
				busqueda.add(p);
		}
		return busqueda;
	}
}
