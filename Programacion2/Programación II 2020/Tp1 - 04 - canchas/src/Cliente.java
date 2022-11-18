
public class Cliente {
	
	private String nombre;
	private int cantVecesVenirUltimoMes;
	private int mesPasado;
	private int mesActual;
	
	public Cliente (String nombre, int cantVecesVenirUltimoMes){
		this.nombre = nombre;
		this. cantVecesVenirUltimoMes = cantVecesVenirUltimoMes;
	}
	
	public boolean obtenerDescuento() {
	 	return (cantVecesVenirUltimoMes >= 1) ;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantVecesVenirUltimoMes() {
		return cantVecesVenirUltimoMes;
	}

	public void setCantVecesVenirUltimoMes(int cantVecesVenirUltimoMes) {
		this.cantVecesVenirUltimoMes = cantVecesVenirUltimoMes;
	}

	public int getMesPasado() {
		return mesPasado;
	}

	public void setMesPasado(int mesPasado) {
		this.mesPasado = mesPasado;
	}

	public int getMesActual() {
		return mesActual;
	}

	public void setMesActual(int mesActual) {
		this.mesActual = mesActual;
	}
}
