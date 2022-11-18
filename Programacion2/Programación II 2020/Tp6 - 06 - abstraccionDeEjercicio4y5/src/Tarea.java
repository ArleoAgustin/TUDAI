
public class Tarea  extends TareayRelizadorDeTareas {
	
	public Tarea() {
		super();
	}
	
	public Tarea(double valor, String nombre) {
		super(valor, nombre);
	}
	
	public boolean sosMayor(Tarea p2) {
		Tarea p1 = this;
		return p1.getValor() > p2.getValor();
	}
	/*
	private int velocidadCpu;
	
	public Proceso(int velocidadCpu) {
		this.velocidadCpu = velocidadCpu;
	}

	public int getVelocidadCpu() {
		return velocidadCpu;
	}

	public void setVelocidadCpu(int velocidadCpu) {
		this.velocidadCpu = velocidadCpu;
	}*/

	@Override
	public boolean sosMayor(TareayRelizadorDeTareas p2) {
		// TODO Auto-generated method stub
		return false;
	}
}
