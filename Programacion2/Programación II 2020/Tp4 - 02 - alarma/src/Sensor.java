
public class Sensor {

	private String nombre;
	private boolean activado;
	
	public Sensor(String nombre) {
		this.nombre = nombre;
		activado = true;
	}
	
	public boolean comprobar() {
		return (isActivado());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isActivado() {
		return activado;
	}

	public void setActivado(boolean activado) {
		this.activado = activado;
	}
	
	
}
