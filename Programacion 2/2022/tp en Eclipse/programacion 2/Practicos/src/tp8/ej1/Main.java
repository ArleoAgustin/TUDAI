package tp8.ej1;
import java.util.ArrayList;
import java.util.Collections;

import tp8.ej1.Filtros.Filtro;
import tp8.ej1.Filtros.FiltroEdad;
import tp8.ej1.Filtros.FiltroNroCancha;
import tp8.ej1.Filtros.FitroPrecioAlquiler;
import tp8.ej1.comparadores.ComparadorAlquiler;
import tp8.ej1.comparadores.ComparadorApellido;
import tp8.ej1.comparadores.ComparadorCuotaPaga;
import tp8.ej1.comparadores.ComparadorEdad;
import tp8.ej1.comparadores.ComparadorNombre;
import tp8.ej1.comparadores.ComparadorSocio;

public class Main {

	public static void main(String[] args) {
		
		Club talleres = new Club();
		
		Cancha c1 = new Cancha(501);
		Cancha c2 = new Cancha(5);
		Cancha c3 = new Cancha(800);
		Cancha c4 = new Cancha(7000);
		Cancha c5 = new Cancha(5105);
		
		Socio s1 = new Socio("Agustin", "Arleo", 18, false);
		Socio s2 = new Socio("Lucas", "Duana", 21, true);
		Socio s3 = new Socio("Gonzalo", "Gaete", 15, true);
		Socio s4 = new Socio("Bautista", "Keegan", 12, true);
		Socio s5 = new Socio("Leandro", "Pagano", 17, false);
		Socio s6 = new Socio("Mauro", "Gaete", 2, true);
		
		s1.addAlquiler(c1);
		s1.addAlquiler(c2);
		s2.addAlquiler(c5);
		s2.addAlquiler(c3);
		s3.addAlquiler(c1);
		s3.addAlquiler(c4);
		s4.addAlquiler(c5);
		s4.addAlquiler(c2);
		s4.addAlquiler(c2);
		s5.addAlquiler(c3);
		s6.addAlquiler(c2);
		
		talleres.addSocio(s6);
		talleres.addSocio(s2);
		talleres.addSocio(s4);
		talleres.addSocio(s3);
		talleres.addSocio(s5);
		talleres.addSocio(s1);

		
		Filtro f1 = new FiltroEdad();
		Filtro f2 = new FiltroNroCancha(2);
		Filtro f3 = new FitroPrecioAlquiler(500);
		
		
		ArrayList<Socio> socios = talleres.getSocios();
		
		ComparadorSocio comp1 = new ComparadorApellido(new ComparadorNombre());
		ComparadorSocio comp2 = new ComparadorEdad();
		ComparadorSocio comp3 = new ComparadorCuotaPaga();
		
		/*
	 	System.out.println(socios);
		 
		
		Collections.sort(socios, comp1);
	
		System.out.println("");
		System.out.println("Ordenados por Apellido y nombre");
		System.out.println(socios);
		
		System.out.println("");
		System.out.println("Ordenados por menores de edad");
		
		
		socios = talleres.busquedaDeSocios(f1);
		
		Collections.sort(socios, comp2);
		Collections.reverse(socios);
		
		System.out.println("");
		System.out.println(socios);
		System.out.println("");
		
	/*	System.out.println("Ordenados por cantidad de canchas alquiladas");
			
		socios = talleres.busquedaDeSocios(f2);
		System.out.println(socios);
		Collections.sort(socios, new ComparadorAlquiler(2));
		Collections.reverse(socios);
		System.out.println("");
		System.out.println(socios);
		System.out.println("");
		System.out.println(s4.vecesQSeAlquilo(2));
		*/
		
		socios = talleres.busquedaDeSocios(f3);
		Collections.sort(socios, new ComparadorApellido());
		Collections.reverse(socios);
		Collections.sort(socios, comp3);
		Collections.reverse(socios);
		System.out.println("");
		System.out.println(socios);
	
	}
	//) Todos los socios que alquilaron alguna vez la cancha N°13, ordenados cantidad
	//total de alquileres de esa cancha.
	
}
