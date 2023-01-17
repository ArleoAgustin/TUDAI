
public abstract class CriterioString extends Criterio{
	private String remitente;

	public CriterioString(String remitente) {
		this.remitente = remitente;
	}
	
	public CriterioString() {}

	@Override
	public boolean cumple(Envio envio) {
		if (remitente!=null) { 
		return this.getAtributo(envio).equals(remitente);
		} else {
			this.remitente = envio.getRemitente();
			return this.cumple(envio);
		}
	}

	public abstract String getAtributo(Envio envio);
}

