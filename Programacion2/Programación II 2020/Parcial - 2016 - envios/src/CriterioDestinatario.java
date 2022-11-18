
public class CriterioDestinatario extends CriterioString{
	@Override
	public String getAtributo(Envio envio) {
		return  envio.getDestinatario();
	}

	@Override
	public boolean cumple(Envio envio) {
		return super.cumple(envio);
	}
}