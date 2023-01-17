import java.util.ArrayList;

public class Alarma {
	
	//pivate Timpre timbro
	private Sensor sensor1;
	private Sensor sensor2;
	private Sensor sensor3;
	private ArrayList<Sensor> sensores = new ArrayList<Sensor>();
	
	public Alarma(Sensor sensor1, Sensor sensor2, Sensor sensor3) {
		this.sensor1 = sensor1;
		this.sensor2 = sensor2;
		this.sensor3 = sensor3;
		sensores.add(sensor1);;
		sensores.add(sensor2);;
		sensores.add(sensor3);
	}
	
	public void comprobar() {
		for (Sensor sensor : sensores) {
			if (sensor.comprobar() == true){
				activarAlarma(sensor.getNombre());
			}
		}
	}
	
	public void activarAlarma(String zona) {
		//this.timbre.hacerSonar();
		System.out.println("Se han registrdos cambios: "+zona);
	}
	
	public void addSensor(String nombre) {
		sensores.add(new Sensor(nombre));
	}

	public Sensor getSensor1() {
		return sensor1;
	}

	public void setSensor1(Sensor sensor1) {
		this.sensor1 = sensor1;
	}

	public Sensor getSensor2() {
		return sensor2;
	}

	public void setSensor2(Sensor sensor2) {
		this.sensor2 = sensor2;
	}

	public Sensor getSensor3() {
		return sensor3;
	}

	public void setSensor3(Sensor sensor3) {
		this.sensor3 = sensor3;
	}
}
