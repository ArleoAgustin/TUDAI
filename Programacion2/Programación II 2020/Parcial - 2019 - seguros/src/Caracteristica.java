
public class Caracteristica {
	private String nombre;
	private Comparable caracteristica;
	
	public Caracteristica(String nombre, Comparable caracteristica) {
		this.nombre = nombre;
		this.caracteristica = caracteristica;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Comparable getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(Comparable caracteristica) {
		this.caracteristica = caracteristica;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		try{
			Caracteristica caracteristica = (Caracteristica) obj;
			return (caracteristica.getCaracteristica().compareTo(
					this.caracteristica)== 0&&caracteristica.getNombre().equals(this.getNombre())) ? true : false;
		} catch(Exception exc) {
			return false;
		}
	}
	
	
}
