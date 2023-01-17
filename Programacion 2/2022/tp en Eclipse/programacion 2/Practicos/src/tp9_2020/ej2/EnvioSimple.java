package tp9_2020.ej2;

public class EnvioSimple extends Envio{
	
	private String destinatario, direccionDestino, remitente, direccionOrigen, formaDeEnvio;
	private double peso;
	
	public EnvioSimple(String destinatario, String direccionDestino, String remitente, String direccionOrigen,
			String formaDeEnvio, double peso, int nro) {
		
		super(nro);
		
		this.destinatario = destinatario;
		this.direccionDestino = direccionDestino;
		this.remitente = remitente;
		this.direccionOrigen = direccionOrigen;
		this.formaDeEnvio = formaDeEnvio;
		this.setPeso(peso);
	}

	@Override
	public String getDireccionDestino() {
		
		return direccionDestino;
	}

	@Override
	public String getRemitente() {
		
		return remitente;
	}

	@Override
	public double getPeso() {
		
		return peso;
	}

	@Override
	public void setNroTracking(int nroTracking) {
		
		
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String getDestinatario() {
		// TODO Auto-generated method stub
		return destinatario;
	}

	@Override
	public String getDireccionOrigen() {
		// TODO Auto-generated method stub
		return direccionOrigen;
	}

	public String getFormaDeEnvio() {
		return formaDeEnvio;
	}
	
	
}
