package tp4.ej5b;

public class Usuario extends Persona {
	
	private String nombre_usuario, password;

	public Usuario(String cargo, String nombre, String apellido, int edad, String nombre_usuario, String password) {
		super(cargo, nombre, apellido, edad);
		this.nombre_usuario = nombre_usuario;
		this.password = password;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return super.toString() + "Nombre de usuario: " + nombre_usuario + "\n"+
				"Password: " + password + "\n";
	}
	
	
	
	
}
