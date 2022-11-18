
public class ContinjenteSeleccion {

	private String nombre;
	private String apellido;
	private String fechaDenacimiento;
	private int pasaporte;
	private String estado;
	
	public ContinjenteSeleccion(String nombre, String estado){
		this.nombre=  nombre;
		this.estado = estado;
	}
	
	public void disponibleParaEvento() {
		if (estaEnPaisOrigen(this)!= "" ) {
			System.out.println("El "+estaEnPaisOrigen(this)+"esta disponible");
		}
	}
	
	public String estaEnPaisOrigen(ContinjenteSeleccion persona) {
		if (persona.getEstado() == "País de origen") {
			return persona.getNombre();
		} else {
			return "";
		}
	}
	
	public ContinjenteSeleccion(String nombre, String apellido, String fechaDenacimiento, int pasaporte, String estado){
		this.nombre=  nombre;
		this.apellido = apellido;
		this. fechaDenacimiento= fechaDenacimiento;
		this.pasaporte = pasaporte;
		this.estado = estado;
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
	public String getFechaDenacimiento() {
		return fechaDenacimiento;
	}
	public void setFechaDenacimiento(String fechaDenacimiento) {
		this.fechaDenacimiento = fechaDenacimiento;
	}
	public int getPasaporte() {
		return pasaporte;
	}
	public void setPasaporte(int pasaporte) {
		this.pasaporte = pasaporte;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
