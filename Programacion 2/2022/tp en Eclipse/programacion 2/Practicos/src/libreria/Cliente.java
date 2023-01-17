package libreria;

import java.util.ArrayList;

public class Cliente {
	
	private String nombre, apellido, direccion, tipo;
	private int dni;
	private ArrayList<String> autores, generos = new ArrayList<>();
	private ArrayList<Producto> compras = new ArrayList<>();
	
	
	
	public Cliente(String nombre, String apellido, String direccion, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.tipo = "Normal";
	}

	public Cliente() {
		
	}
	
	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean compro(Producto p) {
		return compras.contains(p);
	}
	
	public void setCopias(Producto p) {
		compras.add(p); 
	}
	
	public void borrar(Producto p) {
		compras.remove(p);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public void addAutor(String a) {
		
		if(!autores.contains(a))
			autores.add(a);
	}
	
	public String toString() {
		return nombre + " " + compras;
	}

	public int getDescuento() {
		// hacer
		return 0;
	}

	public boolean yaCompro(Producto p) {
		// hacer
		return false;
	}
}
