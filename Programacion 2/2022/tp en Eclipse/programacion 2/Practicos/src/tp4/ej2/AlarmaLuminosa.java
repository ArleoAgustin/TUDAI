package tp4.ej2;

public class AlarmaLuminosa extends Alarma {
		
	//private Luz l;
	
	public AlarmaLuminosa() {

	}
	
	public void encender() {
		
		if(!super.comprobar().isEmpty()) {
			
			super.encender();
			//	l.encender();
		}
	}
}
