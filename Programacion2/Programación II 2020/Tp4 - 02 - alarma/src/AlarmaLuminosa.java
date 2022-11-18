
public class AlarmaLuminosa extends Alarma{
	
	//private Luz luz;
	
	public AlarmaLuminosa (Sensor sensor1, Sensor sensor2, Sensor sensor3) {
		super(sensor1, sensor2, sensor3);
	}

	public void activarAlarma(String zona) {
		//this.timbre.hacerSonar();
		//this.luz.hacerSonar();
		System.out.println("Se han registrdos cambios: "+zona);
	}
}
