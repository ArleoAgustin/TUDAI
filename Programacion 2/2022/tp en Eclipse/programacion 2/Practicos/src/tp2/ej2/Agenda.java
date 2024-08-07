package tp2.ej2;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Reunion> reuniones = new ArrayList<Reunion>();

	public Agenda() {
		
	}

	public ArrayList<Reunion> getReuniones() {
		
		ArrayList<Reunion> r = this.reuniones;
		return r;
	}

	public void setReuniones(Reunion r) {
		
		if(this.verificarHorario(r))
			this.reuniones.add(r);
	}
	
	
	public boolean verificarHorario(Reunion nuevaR) {
		
		int horarioYduracion = nuevaR.getHorario() + nuevaR.getDuracion();
		
		for(Reunion r: reuniones) {
			
			if(r.getHorario() == nuevaR.getHorario())
				return true;
				if(r.getHorario() < horarioYduracion)
					return true;
				
		}
		return false;
	}
	
	
	
	
}
