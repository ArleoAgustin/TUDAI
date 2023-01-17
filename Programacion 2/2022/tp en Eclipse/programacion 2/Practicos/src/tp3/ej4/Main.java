package tp3.ej4;

public class Main {

	public static void main(String[] args) {
		
		Contacto c1 =  new Contacto("Lucas", "Duana",249231455, 22, "Tandil");
		Contacto c2 =  new Contacto("Gonzalo", "Gaete",249231455, 18, "Rauch");
		Contacto c3 =  new Contacto("Bautista", "Keegan",249231223, 25, "Rauch");
		Contacto c4 =  new Contacto("Leandro", "Pagano",2492311, 21, "Rauch");
		Contacto c5 =  new Contacto("Matias", "Ponce", 249231457, 20, "Azul");
		Contacto c6 =  new Contacto("Agustin", "Arleo",249231, 22, "Tandil");
		
		Contacto c7 =  new Contacto("Lucas", "Duana",249231455, 25, "Tandil");
		
		Agenda a = new Agenda();
		
		a.addContacto(c1);
		a.addContacto(c2);
		a.addContacto(c3);
		a.addContacto(c4);
		a.addContacto(c5);
		a.addContacto(c6);
		a.addContacto(c7);
		
		Celular c = new Celular(a);
		
	//	c.mostrarTodosLosContactos();
		//c.mostrarSoloRepetidos();
		//c.mostrarDatosDelContacto(c7);
		c.mostrarContactosConMismoNro();

	}

}
