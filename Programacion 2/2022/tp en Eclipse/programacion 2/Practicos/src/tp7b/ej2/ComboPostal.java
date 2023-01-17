package tp7b.ej2;

import java.util.ArrayList;

import tp7b.ej2.condiciones.Condicion;

public class ComboPostal extends Envio{
	
	private ArrayList<Envio> envios;

	
	public ComboPostal(String destinatario, String direccionDestino, String remitente, String direccionRemitente,
			int nro) {
		super(destinatario, direccionDestino, remitente, direccionRemitente, nro);
		
	}


	public ArrayList<Envio> getEnvios() {
		return envios;
	}


	public void addEnvio(Envio e, Condicion c) {
		
		if(c.cumple(e))
			e.setNroTracking(this.nroTracking);
			this.envios.add(e);
	}


	@Override
	public double getPeso() {

		double p =0.0;
		for(Envio e: envios) {
			p += e.getPeso();
		}
		return p;
	}


	@Override
	public void setNroTracking(int nro) {
		
		for(Envio env: envios) {
			env.setNroTracking(nro);
		}
		
	}

	
	
}
