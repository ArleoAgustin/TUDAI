package tp3.ej4;

public class Celular {
	
	private Agenda agenda;
	
	public Celular(Agenda a) {
		
		this.agenda = a;
		
	}
	
	public void mostrarDatosDelContacto(Contacto c) {
		
		System.out.println("Contacto: ");		
			System.out.println( c.getNombre() + " " + c.getApellido() + "\n"+
					"edad: " + c.getEdad() + "\n" +
					"telefono: " + c.getNroTelefono() + "\n" +
					"Ciudad: " + c.getCiudad()); 			
		
	}
	
	public void mostrarTodosLosContactos() {
		
		System.out.println("Todos los contactos: ");
		System.out.println("");
		
		for(Contacto c: this.agenda.getContactos()) {
			System.out.println(c.getNombre() + " " + c.getApellido());
			
		}
		
		System.out.println("");
		System.out.println("Contactos repetidos");
		System.out.println("");
		
		if(!this.agenda.getContactosRepetidos().isEmpty()) {
			for(Contacto cr: this.agenda.getContactosRepetidos()) {
				
				System.out.println(cr.getNombre() + " " + cr.getApellido());
			}
		}
		else
			System.out.println("No hay contactos repetidos");
		
		System.out.println("");
		System.out.println("Promedio de edad: " + this.agenda.promedioDeEdad());
	}
	
	
	public void mostrarSoloRepetidos() {
		
		System.out.println("Todos los ccontactos repetidos ");
		System.out.println("");
		for(Contacto c: this.agenda.getContactosRepetidos()) {
	
			System.out.println(c.getNombre() + " " + c.getApellido());
		}
	}
	

	public void mostrarContactosConMismoNro() {

		if(!this.agenda.contactosConNumerosRepetidos().isEmpty()) {
			System.out.println("Contactos con mismo numero:");
			for(Contacto c: this.agenda.contactosConNumerosRepetidos()) {
			
				System.out.println(c.getNombre() + " " + c.getApellido());
			}
		}
		else
			System.out.println("No hay contactos con numeros repetidos");
			
	}

}
