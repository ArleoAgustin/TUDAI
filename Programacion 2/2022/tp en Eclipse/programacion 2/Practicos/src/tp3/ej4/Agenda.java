package tp3.ej4;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Contacto> contactos = new ArrayList<Contacto>();
	private ArrayList<Contacto> contactosConMismoNro = new ArrayList<Contacto>();
	
	public Agenda() {
		
	}
	
	
	
	public ArrayList<Contacto> getContactosConMismoNro() {
		
		return this.contactosConMismoNro;
	}



	public ArrayList<Contacto> contactosConNumerosRepetidos() {
		
		ArrayList<Contacto> cnr = new ArrayList<Contacto>();
		
		for(Contacto c: this.contactos) {
			if(this.mismoNro(c))
				cnr.add(c);
		}
		
		this.contactosConMismoNro = cnr;
		return cnr;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void addContacto(Contacto c) {
			
			this.contactos.add(c);
	}
	
	public ArrayList<Contacto> getContactosRepetidos(){
		
		ArrayList<Contacto> repetidos = new ArrayList<Contacto>();
		
		
		for(Contacto c: this.contactos) {
			if(existe(c)) {
				repetidos.add(c);
			}
		}
		return repetidos;
	}
	
	public int promedioDeEdad() {
		
		int sumaEdad = 0;
		
		 for(Contacto c: this.contactos) {
			 sumaEdad += c.getEdad();
		 }
		 return sumaEdad / this.contactos.size();
	}
	
	public boolean mismoNro(Contacto c) {
		for(Contacto cont: this.contactos) {
			if((cont.getNroTelefono() == c.getNroTelefono() && (c != cont)) )
				
				return true;
		}
		return false;
	}
	
	public boolean existe(Contacto c) {
		
		for(Contacto cont: this.contactos) {
			if((cont.getApellido().equals(c.getApellido())
					&& (cont.getNombre().equals(c.getNombre())))
					&& (cont.getNroTelefono() == cont.getNroTelefono())
					&& c != cont){
				return true;
			}
			else
				return false;
		}
	return false;
	}
}
