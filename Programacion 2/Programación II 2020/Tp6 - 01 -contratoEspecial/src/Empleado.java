
public class Empleado {
	
	private CondicionParaEmplear condicion;
	private String nombreCompleto;
	private String empresa;
	private int sueldo;
	
	public Empleado() {
		nombreCompleto = "N n";
		empresa = "N";
		sueldo = 0;
	}
	
	public Empleado(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
		empresa = "N";
		sueldo = 0;
	}
	
	public Empleado(String nombreCompleto, String empresa) {
		this.nombreCompleto = nombreCompleto;
		this.empresa = empresa;
		sueldo = 0;
	}
	
	public Empleado(String nombreCompleto, String empresa, int sueldo) {
		this.nombreCompleto = nombreCompleto;
		this.empresa = empresa;
		this.sueldo = sueldo;
	}
	
	public Empleado(String nombreCompleto, String empresa, int sueldo, CondicionParaEmplear condicion) {
		this.nombreCompleto = nombreCompleto;
		this.empresa = empresa;
		this.sueldo = sueldo;
		this.condicion = condicion;
	}
	
	public boolean sePuedeContratarEmpleado(Contrato contrato) {
		return this.condicion.sePuedeContratarEmpleado(this, contrato);
	}
	
	public void cambiarCondicion(CondicionParaEmplear condicion) {
		this.condicion = condicion;
	}

	public String toString() {
		return "Empleado: "+ nombreCompleto +" - "+ empresa + " - "+ sueldo+"$";
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
}
