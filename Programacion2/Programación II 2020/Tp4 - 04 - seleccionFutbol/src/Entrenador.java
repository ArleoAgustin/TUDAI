
public class Entrenador extends ContinjenteSeleccion{
	
	private int identificadorDeFederacion;
	
	public Entrenador(String nombre, String estado, int identificadorDeFederacion){
		super(nombre, estado);
		this. identificadorDeFederacion = identificadorDeFederacion;
	}
	
	public Entrenador(String nombre, String apellido, String fechaDenacimiento, int pasaporte, String estado, String posicion, int identificadorDeFederacion){
		super(nombre, apellido, fechaDenacimiento, pasaporte, estado);
		this. identificadorDeFederacion = identificadorDeFederacion;
	}

	public int getIdentificadorDeFederacion() {
		return identificadorDeFederacion;
	}

	public void setIdentificadorDeFederacion(int identificadorDeFederacion) {
		this.identificadorDeFederacion = identificadorDeFederacion;
	}
}
