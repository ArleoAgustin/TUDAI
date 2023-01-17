
public class CriterioRemitenteDireccion extends CriterioString{
	@Override
	public String getAtributo(Envio envio) {
		return  envio.getRemitenteDireccion();
	}

	@Override
	public boolean cumple(Envio envio) {
		return super.cumple(envio);
	}
}

