package tp4.ej2;

import java.util.ArrayList;

public class Alarma {
	
	protected ArrayList<Sensor> sensores = new ArrayList<Sensor>();
	//private Timbre t = new Timbre();
	
	public Alarma() {
		
	}
	
	
	
	public void encender() {
	
		if(!this.comprobar().isEmpty()) {
			//this.t.hacerSonar();
			for(Sensor s: this.comprobar())
				System.out.println("zona en conflicto "+ s.getNombreSensor());
		}
	}
	
	public void addSensor(Sensor s) {
		this.sensores.add(s);
	}
	
	public ArrayList<Sensor> comprobar() {
		
		ArrayList<Sensor> sen = new ArrayList<Sensor>();
		
		for(Sensor s: this.sensores) {
			if(s.hayMovimiento())
				sen.add(s);
		}
		return sen;
	}

	
	
	
}
