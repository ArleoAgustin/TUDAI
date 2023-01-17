package tp9_2020.ej2;

public abstract class Envio {
	
	protected int nroTracking;
	
	
	
	public Envio(int nroTracking) {
		
		this.setNroTracking(nroTracking);
	}
	public abstract String getDireccionDestino();
	public abstract String getRemitente();
	public abstract double getPeso();
	public abstract String getDestinatario();
	public abstract String getDireccionOrigen();
	
	public int getNroTracking() {
		return nroTracking;
	}
	public abstract void  setNroTracking(int nroTracking);
}
