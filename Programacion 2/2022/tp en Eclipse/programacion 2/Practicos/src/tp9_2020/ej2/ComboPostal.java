package tp9_2020.ej2;

import java.util.ArrayList;

public class ComboPostal extends Combo {

	private String ciudadDeterminada;
	
	
	public ComboPostal(String ciudadDeterminada, int nro) {
		super(nro);
		this.ciudadDeterminada = ciudadDeterminada;
		this.envios = new ArrayList<>();
		
	}

	@Override
	public void addEnvio(Envio e) {
		
		if(e.getDireccionDestino().contains(ciudadDeterminada))
			this.envios.add(e);
	}
	
	
}
