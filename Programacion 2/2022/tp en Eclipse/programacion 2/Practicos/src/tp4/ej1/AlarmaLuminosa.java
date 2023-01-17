package tp4.ej1;

public class AlarmaLuminosa extends Alarma {
		
	//private Luz l;
	
	public AlarmaLuminosa(boolean vidrioRoto, boolean aberturaAbierta, boolean movimiento) {
		super(vidrioRoto, aberturaAbierta, movimiento);
	}
	
	public void encender() {
		
		if(super.comprobar()) {
			
			super.encender();
			//	l.encender();
		}
	}
}
