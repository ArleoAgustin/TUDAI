package recuperatorioHotel;

import java.time.LocalDate;
import java.util.ArrayList;

import recuperatorioHotel.Comparador.Comparador;
import recuperatorioHotel.Criterio.Criterio;

public class Habitacion extends ElementoHotel{
	
	private ArrayList<String> comodidades;
	
	private double metrosCuadrados;
	private int cantCamas;
	private LocalDate ultimaFechaOcupada;
	private boolean aceptaMascota;
	
	public Habitacion(double metrosCuadrados, int cantCamas, LocalDate ultimaFechaOcupada, boolean aceptaMascota) {
		
		super();
		this.comodidades = new ArrayList<>();
		this.metrosCuadrados = metrosCuadrados;
		this.cantCamas = cantCamas;
		this.ultimaFechaOcupada = ultimaFechaOcupada;
		this.aceptaMascota = aceptaMascota;
	}

	public ArrayList<String> getComodidades() {
		return new ArrayList<>(comodidades);
	}

	public void setComodidades(String c) {
		this.comodidades.add(c);
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public int getCantCamas() {
		return cantCamas;
	}

	public void setCantCamas(int cantCamas) {
		this.cantCamas = cantCamas;
	}

	public LocalDate getUltimaFechaOcupada() {
		return ultimaFechaOcupada;
	}

	public void setUltimaFechaOcupada(LocalDate ultimaFechaOcupada) {
		this.ultimaFechaOcupada = ultimaFechaOcupada;
	}

	public boolean isAceptaMascota() {
		return aceptaMascota;
	}

	public void setAceptaMascota(boolean aceptaMascota) {
		this.aceptaMascota = aceptaMascota;
	}
	
	public boolean estaLibre() {
		
		return this.ultimaFechaOcupada.isBefore(LocalDate.now());
	}

	
	
	@Override
	public ArrayList<Habitacion> buscarHabitaciones(Criterio c, Comparador comp) {
		
		ArrayList<Habitacion> res = new ArrayList<>();
		
		if( this.estaLibre() && c.cumple(this)) 
			res.add(this);
		
		
		return res;
	}



	@Override
	public ArrayList<Habitacion> habitacionesLibres() {
		
		ArrayList<Habitacion> res = new ArrayList<>();
		
		if(this.estaLibre())
			res.add(this);
		
		return res;
	}

	@Override
	public int contarHabitaciones(Criterio c) {

		if(c.cumple(this))
			return 1;
		
		return 0;
	}
}
