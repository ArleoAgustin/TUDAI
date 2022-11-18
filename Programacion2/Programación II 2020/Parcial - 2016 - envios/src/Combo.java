import java.util.ArrayList;


public class Combo extends Envio{
	private ArrayList<Envio> envios;
	private Criterio condicion;
	private int porcentajeDescuento;
	
	public Combo(int numeroTracking, Criterio condicion, int porcentajeDescuento) {
		super();
		this.envios = new ArrayList<Envio>();
		this.condicion = condicion;
		this.porcentajeDescuento = porcentajeDescuento;
	}



	@Override
	public int getPeso() {
		int aux = 0;
		for (Envio envio : envios) {
			aux += envio.getPeso();
		}
		return aux;
	}

	@Override
	public String getRemitente() {
		for (Envio envio : envios) {
			return envio.getRemitente();
		}
		return null;
	}

	@Override
	public String getDestinatario() {
		for (Envio envio : envios) {
			return envio.getDestinatario();
		}
		return null;
	}

	@Override
	public String getDestinatarioDireccion() {
		for (Envio envio : envios) {
			return envio.getDestinatarioDireccion();
		}
		return null;
	}

	@Override
	public String getRemitenteDireccion() {
		for (Envio envio : envios) {
			return envio.getRemitenteDireccion();
		}
		return null;
	}

	@Override
	public void setNumeroTracking(int numeroTracking) {
		for (Envio envio : envios) {
			envio.setNumeroTracking(numeroTracking);
		}
		
	}
	
	public void addEnvio(Envio envio) {
		if (condicion.cumple(envio)) {
			this.setNumeroTracking(this.getNumeroTracking());
			this.envios.add(envio);
		}
	}
	
	public boolean revizarEnvio(Criterio condicion) {
		for (Envio envio : envios) {
			if(!envio.revizarEnvio(condicion))
				return false;
		}
		return true;
	}

	@Override
	public double getPrecio() {
		int aux = 0;
		for (Envio envio : envios) {
			aux += envio.getPeso();
		}
		return aux * (this.porcentajeDescuento/100);
	}

	@Override
	public ArrayList<Envio> getEnvio(Criterio criterio) {
		ArrayList<Envio> aux = new ArrayList<Envio> ();
		for (Envio envio : envios) {
				aux.addAll(envio. getEnvio(criterio));
		}
		return aux;
	}
	
}
