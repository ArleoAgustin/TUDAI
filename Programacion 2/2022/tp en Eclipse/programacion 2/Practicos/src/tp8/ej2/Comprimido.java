package tp8.ej2;

public class Comprimido extends Carpeta {
	
	private double tasaDeCompresion;

	public Comprimido(String nombre, double tasaDeCompresion) {
		super(nombre);
		this.tasaDeCompresion = tasaDeCompresion;
	}
	
	public double getTamanio() {
		return super.getTamanio() * tasaDeCompresion;
	}
	
	
}
