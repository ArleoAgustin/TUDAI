
public class CriterioRemitente extends Criterio{
	private String remitente;

	public CriterioRemitente(String remitente) {
		this.remitente = remitente;
	}
	
	public CriterioRemitente() {}

	@Override
	public boolean cumple(Envio envio) {
		if (remitente!=null) { 
		return envio.getRemitente().equals(remitente);
		} else {
			this.remitente = envio.getRemitente();
			return this.cumple(envio);
		}
	}
}
