import java.util.ArrayList;


public class Paquete extends Envio{
	private String destinatario;
	private String remitente;
	private String destinatarioDireccion;
	private String remitenteDireccion;
	private boolean envioADomiciolio;
	private int peso;
	private int precio;
	
	public Paquete(String destinatario, String remitente, String destinatarioDireccion, String remitenteDireccion, boolean envioADomiciolio, int peso) {
		this.destinatario = destinatario;
		this.remitente = remitente;
		this.destinatarioDireccion = destinatarioDireccion;
		this.remitenteDireccion = remitenteDireccion;
		this.envioADomiciolio = envioADomiciolio;
		this.peso = peso;
	}

	@Override
	public String getDestinatario() {
		return destinatario;
	}

	@Override
	public String getRemitente() {
		return remitente;
	}

	@Override
	public String getDestinatarioDireccion() {
		return destinatarioDireccion;
	}

	@Override
	public String getRemitenteDireccion() {
		return remitenteDireccion;
	}


	@Override
	public int getPeso() {
		return peso;
	}

	@Override
	public void setNumeroTracking(int numeroTracking) {
		this.numeroTracking = numeroTracking;
		
	}
	
	public boolean isEnvioADomiciolio() {
		return envioADomiciolio;
	}

	@Override
	public boolean revizarEnvio(Criterio condicion) {
		return condicion.cumple(this);
	}

	@Override
	public double getPrecio() {
		return this.precio;
	}

	@Override
	public ArrayList<Envio> getEnvio(Criterio criterio) {
		ArrayList<Envio> aux = new ArrayList<Envio> ();
			if(criterio.cumple(this))
				aux.add(this);
		return aux;
	}
}
