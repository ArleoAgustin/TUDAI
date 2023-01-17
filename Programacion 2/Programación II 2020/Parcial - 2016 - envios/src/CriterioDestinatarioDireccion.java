
public class CriterioDestinatarioDireccion extends CriterioString{
	@Override
	public String getAtributo(Envio envio) {
		return  envio.getDestinatarioDireccion();
	}

	@Override
	public boolean cumple(Envio envio) {
		return super.cumple(envio);
	}
}

