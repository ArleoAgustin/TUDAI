
public class Futbolista extends ContinjenteSeleccion{

	private String posicion;
	private int pie;
	private int cantidadGolesConvertidos;
	
	public Futbolista(String nombre, String estado){
		super(nombre, estado);
	}
	
	
	public Futbolista(String nombre, String estado, String posicion, int pie, int cantidadGolesConvertidos){
		super(nombre, estado);
		this. posicion = posicion;
		this.pie = pie;
		this.cantidadGolesConvertidos = cantidadGolesConvertidos;
	}
	
	public Futbolista(String nombre, String apellido, String fechaDenacimiento, int pasaporte, String estado, String posicion, int pie, int cantidadGolesConvertidos){
		super(nombre, apellido, fechaDenacimiento, pasaporte, estado);
		this. posicion = posicion;
		this.pie = pie;
		this.cantidadGolesConvertidos = cantidadGolesConvertidos;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getPie() {
		return pie;
	}

	public void setPie(int pie) {
		this.pie = pie;
	}

	public int getCantidadGolesConvertidos() {
		return cantidadGolesConvertidos;
	}

	public void setCantidadGolesConvertidos(int cantidadGolesConvertidos) {
		this.cantidadGolesConvertidos = cantidadGolesConvertidos;
	}
	
	
}
