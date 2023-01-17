package tp8.ej1;

import java.util.ArrayList;

import tp8.ej1.Filtros.Filtro;

public class Club {
	
	private ArrayList<Socio> socios;
	private ArrayList<Cancha> canchas;
	
	public Club() {	
		this.socios = new ArrayList<>();
		this.canchas = new ArrayList<>();
	}

	public ArrayList<Socio> getSocios() {
		return socios;
	}

	public void addSocio(Socio socio) {
		this.socios.add(socio);
	}

	public ArrayList<Cancha> getCanchas() {
		return new ArrayList<>(canchas);
	}

	public void addCancha(Cancha cancha) {
		this.canchas.add(cancha);
	}
	
	public ArrayList<Socio> busquedaDeSocios(Filtro f){
		
		ArrayList<Socio> cumplen = new ArrayList<>();
		for(Socio s: socios) {
			if(f.cumple(s))
				cumplen.add(s);
		}
		return cumplen;
	}
	
}
