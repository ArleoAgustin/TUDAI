
public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Alarma 1:");
		Sensor sensor1 = new Sensor("la puerta del cocina");
		Sensor sensor2 = new Sensor("la ventana del cocina");
		Sensor sensor3 = new Sensor("movimiento en cocina");
		Alarma alarma1 = new Alarma(sensor1, sensor2, sensor3);
		alarma1.addSensor("movimiento en el patio");
		alarma1.comprobar();
		System.out.println("Alarma 2:");
		AlarmaLuminosa alarma2 = new AlarmaLuminosa(sensor1, sensor2, sensor3);
		alarma2.addSensor("movimiento en el patio");
		alarma2.addSensor("movimiento en el patio");
		alarma2.comprobar();
	}

}
