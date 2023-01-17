
public class Vehiculo extends ProductoAlquilable{
	
	private String marca;
	private String patente;
	private String tipo;
	private int kms;
	private boolean estaAlquilado;
	
	public boolean sePuedeAlquilar() {
		return !estaAlquilado;
	}
	
	public void AlquilarProducto() {
		if (sePuedeAlquilar()) {
			estaAlquilado = true;
		}		
	}
	
	public void devolveProducto() {
		if (!sePuedeAlquilar()) {
			estaAlquilado = false;
		}		
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getKms() {
		return kms;
	}
	public void setKms(int kms) {
		this.kms = kms;
	}
}
