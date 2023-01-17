package tp6.ej1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
	
		VideoClub ElTuerto = new VideoClub();
		
		Cliente c1 = new Cliente("Agustin");
		Cliente c2 = new Cliente("Gonzalo");
		
		Item p1 = new Pelicula("Iron_Man", 2);
		Item p2 = new Pelicula("Cars", 1);
		
		Item v1 = new Vehiculo("VW", "AB350CZ", "Nafta", 15000);
		Item v2 = new Vehiculo("Ford", "AB677SA", "Diesel", 115000);
		
		Alquiler a1 = new Alquiler(p1, LocalDate.of(2022, 9, 30), c1);
		
		Alquiler a2 = new Alquiler(v1, LocalDate.of(2022, 9, 23), c2);
		
		ElTuerto.addAlquiler(a1);
		ElTuerto.addAlquiler(a2);
		
		ElTuerto.addCliente(c1);
		ElTuerto.addCliente(c2);
		
		ElTuerto.addProducto(p1);
		ElTuerto.addProducto(p2);
		ElTuerto.addProducto(v1);
		ElTuerto.addProducto(v2);
		
		System.out.println(ElTuerto.clientesConAlquilerVencido());
	}

}
