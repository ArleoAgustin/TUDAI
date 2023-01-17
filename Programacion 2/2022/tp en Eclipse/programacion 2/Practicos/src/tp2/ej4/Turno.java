package tp2.ej4;

import java.time.LocalDate;

public class Turno {
	
	private LocalDate fecha;
	private Usuario user;
	private double valorDelTurno;
	private final double descuentoParaSocios = 10;
	
	public Turno(LocalDate f, Usuario u, Cancha c) {
		
		this.fecha = f;
		this.user = u;
		this.valorDelTurno = c.getValor();
		aplicarDescuento();
	}
	

	public void aplicarDescuento() {
		
		if(this.user.isSocio())
			this.valorDelTurno = (this.descuentoParaSocios/100) * this.valorDelTurno;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public Usuario getUser() {
		return user;
	}


	public void setUser(Usuario user) {
		this.user = user;
	}


	public double getValorDelTurno() {
		return valorDelTurno;
	}
	
	
	
	
	
	
}
