package tp4.ej1;

public class Alarma {
	
	protected boolean vidrioRoto, aberturaAbierta, movimiento;
	//private Timbre t = new Timbre();
	
	public Alarma(boolean vidrioRoto, boolean aberturaAbierta, boolean movimiento) {
		
		this.vidrioRoto = vidrioRoto;
		this.aberturaAbierta = aberturaAbierta;
		this.movimiento = movimiento;
	}
	
	public void encender() {
	
		if(this.comprobar()) {
			//this.t.hacerSonar();
		}
	}
	
	public boolean comprobar() {
		
		if(this.aberturaAbierta || this.vidrioRoto || this.movimiento) {
			return true;
			
		}
		return false;
	}

	public boolean isVidrioRoto() {
		return vidrioRoto;
	}

	public void setVidrioRoto(boolean vidrioRoto) {
		this.vidrioRoto = vidrioRoto;
	}

	public boolean isAberturaAbierta() {
		return aberturaAbierta;
	}

	public void setAberturaAbierta(boolean aberturaAbierta) {
		this.aberturaAbierta = aberturaAbierta;
	}

	public boolean isMovimiento() {
		return movimiento;
	}

	public void setMovimiento(boolean movimiento) {
		this.movimiento = movimiento;
	}
	
	
	
	
}
