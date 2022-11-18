import java.util.ArrayList;


public abstract class Envio {
	private static int id;
	protected int numeroTracking;
	
	public Envio() {
		this.numeroTracking = id;
		id++;
	}
	
	public abstract int getPeso();
	public abstract String getRemitente();
	public abstract String getDestinatario();
	public abstract String getDestinatarioDireccion();
	public abstract String getRemitenteDireccion();
	public abstract double getPrecio();
	public abstract ArrayList<Envio> getEnvio(Criterio criterio);
	public abstract void setNumeroTracking(int numeroTracking);
	public abstract boolean revizarEnvio(Criterio condicion);

	public int getNumeroTracking() {
		return numeroTracking;
	}

}
