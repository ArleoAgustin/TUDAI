package tp9_2020.ej2;

import java.util.ArrayList;

public abstract class Combo extends Envio {
	
	protected ArrayList<Envio> envios;
	
	
	public Combo(int nro) {
		super(nro);
		
		
	}
	
	public abstract void addEnvio(Envio e);

	@Override
	public String getDireccionDestino() {
		
		if(!this.envios.isEmpty())
			return envios.get(0).getDireccionDestino();
		
		return null;
	}

	@Override
	public String getRemitente() {
		
		if(!this.envios.isEmpty())
			return envios.get(0).getRemitente();
		
		return null;
	}

	@Override
	public double getPeso() {
		
		double aux = 0;
		if(!this.envios.isEmpty())
			for(Envio e: envios) {
				aux+= e.getPeso();
			}
		
		return aux;
	}
	
	public void  setNroTracking(int nroTracking) {
		
		for(Envio e: envios) {
			e.setNroTracking(nroTracking);
			this.nroTracking = nroTracking;
			
		}
	}

	@Override
	public String getDestinatario() {
		if(!this.envios.isEmpty())
			return envios.get(0).getDestinatario();
		
		return null;
	}

	

	@Override
	public String getDireccionOrigen() {
		
		if(!this.envios.isEmpty())
			return envios.get(0).getDireccionOrigen();
		
		return null;
	}


}
