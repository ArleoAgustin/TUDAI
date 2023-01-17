package tp4.ej2;

public class Sensor {
	
	private String nombreSensor;
	private boolean detectoMovimiento;
	
	public Sensor(String nombre, boolean detecto) {
		
		this.nombreSensor = nombre;
		this.detectoMovimiento = detecto;
	}
	

	public boolean hayMovimiento() {
		
		if(this.detectoMovimiento)
			return true;
	
	return false;
	}
	

	public boolean isDetectoMovimiento() {
		return detectoMovimiento;
	}


	public void setDetectoMovimiento(boolean detectoMovimiento) {
		this.detectoMovimiento = detectoMovimiento;
	}


	public String getNombreSensor() {
		return nombreSensor;
	}


	public void setNombreSensor(String nombreSensor) {
		this.nombreSensor = nombreSensor;
	}
	

	
}