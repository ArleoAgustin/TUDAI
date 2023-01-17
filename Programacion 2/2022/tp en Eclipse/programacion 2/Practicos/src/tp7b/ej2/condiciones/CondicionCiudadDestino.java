package tp7b.ej2.condiciones;

import tp7b.ej2.Envio;

public class CondicionCiudadDestino extends Condicion {
	
	private String s;
	
	
	public CondicionCiudadDestino(String s) {
		
		this.s = s;
	}


	@Override
	public boolean cumple(Envio e) {
		return s.toLowerCase().equals(e.getDireccionDestinatario().toLowerCase());
	}

}
