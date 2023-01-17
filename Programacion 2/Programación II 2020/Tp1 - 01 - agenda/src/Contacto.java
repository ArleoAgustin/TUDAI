
public class Contacto {
	
	private String nombre;
	private String mail;
	private int numero;
	
	public Contacto (String nombre) {
		this.nombre = nombre;
		mail = "Pendiente";
		numero = 000000;
	}
	
	public Contacto (String nombre, String mail) {
		this.nombre = nombre;
		this.mail = mail;
		numero = 000000;
	}
	
	public Contacto (String nombre, String mail, int numero) {
		this.nombre = nombre;
		this.mail = mail;
		this.numero = numero;
	}
	
	public boolean estoyEnReunion(Reunion reunion) {
		boolean contactoEncontrado = false;
		for (String participante : reunion.getParticipantes()) {
			if (contactoEncontrado == false) {
				if (participante == getNombre()) {
					contactoEncontrado = true;
				}
			}
		}
		return contactoEncontrado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}
