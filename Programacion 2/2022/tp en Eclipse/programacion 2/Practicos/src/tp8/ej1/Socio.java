package tp8.ej1;

import java.util.ArrayList;

public class Socio {
	
	private String nombre, apellido;
	private int edad;
	private boolean cuotaPaga;
	private ArrayList<Cancha> alquileres;
	
	public Socio(String nombre, String apellido, int edad, boolean cuotaPaga) {
		
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.cuotaPaga = cuotaPaga;
		this.alquileres = new ArrayList<>();
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCuotaPaga() {
		return cuotaPaga;
	}

	public void setCuotaPaga(boolean cuotaPaga) {
		this.cuotaPaga = cuotaPaga;
	}

	public ArrayList<Cancha> getAlquileres() {
		return new ArrayList<>(alquileres);
	}

	public void addAlquiler(Cancha alquiler) {
		this.alquileres.add(alquiler);
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public boolean alquiloCancha(int nro) {
		
		for(Cancha c: alquileres) {
			if(c.getId() == nro)
				return true;
		}
		return false;
	}
	
	public int vecesQSeAlquilo(int nro) {
		
		int cant = 0;
		for(Cancha c: alquileres) {
			if(c.getId() == nro)
				cant++;
		}
		return cant;
	}
	
	public boolean pagoAlquiler(int valor) {
		
		for(Cancha c: alquileres) {
			if (c.getCosto() > valor)
				return true;
		}
		return false;
	}
	
	
    @Override
	public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", Cuota paga=" + cuotaPaga +
                '}'+"\n";
    }
	
	
	
	
	
}
