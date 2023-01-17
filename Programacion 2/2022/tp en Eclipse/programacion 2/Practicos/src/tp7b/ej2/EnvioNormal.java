package tp7b.ej2;

public class EnvioNormal extends Envio {
	
	private double peso;
	
	public EnvioNormal(String destinatario, String direccionDestino, String remitente, String direccionRemitente, double peso, int nro) {
		super(destinatario, direccionDestino, remitente, direccionRemitente, nro);
		this.peso = peso;
	}

	@Override
	public double getPeso() {
		
		return peso;
	}

	@Override
	public void setNroTracking(int nro) {
		
		this.nroTracking = nro;
	}

	
	
}
