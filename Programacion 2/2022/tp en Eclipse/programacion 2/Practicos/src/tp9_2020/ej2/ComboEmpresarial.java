package tp9_2020.ej2;

public class ComboEmpresarial extends Combo {

	private String remitente;
	
	public ComboEmpresarial(String remitente, int nro) {
		super(nro);		
		this.remitente = remitente;
	}

	@Override
	public void addEnvio(Envio e) {
		
		if(e.getRemitente().equals(remitente))
			this.envios.add(e);

	}

}
