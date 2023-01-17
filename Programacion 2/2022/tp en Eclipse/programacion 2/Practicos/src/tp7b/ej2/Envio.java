package tp7b.ej2;

public abstract class Envio {
	
	private String destinatario, direccionDestinatario, remitente, direccionRemitente;
	private boolean retiroEnSucursal;
	protected int nroTracking;

	public Envio(String destinatario, String direccionDestino, String remitente, String direccionRemitente, int nro) {
		
		this.destinatario = destinatario;
		this.direccionDestinatario = direccionDestino;
		this.remitente = remitente;
		this.direccionRemitente = direccionRemitente;
		this.retiroEnSucursal = false;
		this.nroTracking = nro;
	}
	
	
	
	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getDireccionDestinatario() {
		return direccionDestinatario;
	}

	public void setDireccionDestinatario(String direccionDestinatario) {
		this.direccionDestinatario = direccionDestinatario;
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getDireccionRemitente() {
		return direccionRemitente;
	}

	public void setDireccionRemitente(String direccionRemitente) {
		this.direccionRemitente = direccionRemitente;
	}

	public abstract double getPeso();


	public boolean isRetiroEnSucursal() {
		return retiroEnSucursal;
	}

	public void setRetiroEnSucursal(boolean retiroEnSucursal) {
		this.retiroEnSucursal = retiroEnSucursal;
	}



	public int getNroTracking() {
		return nroTracking;
	}



	public abstract void setNroTracking(int e);	
	
}
