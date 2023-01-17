package tp2.ej2;

public class Participante {
	
	private int nroTelefono;
	private String mail;
	
	public Participante(int nroTelefono, String mail) {
		
		this.nroTelefono = nroTelefono;
		this.mail = mail;
	}

	public int getNroTelefono() {
		return nroTelefono;
	}

	public void setNroTelefono(int nroTelefono) {
		this.nroTelefono = nroTelefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
	
}
