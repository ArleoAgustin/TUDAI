package tp1.ej3;

public class PuntoGeometrico {
	
	private double x;
	private double y;
	
	public PuntoGeometrico() {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	public PuntoGeometrico(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void moverX(double incremento) {
		this.x += incremento;
	}
	
	public void moverY(double incremento) {
		this.y += incremento;
	}
	
	public double distanciaEuclidea(PuntoGeometrico p) {
		
		double otropX = p.getX();
		double otropY = p.getY();
		return (Math.sqrt(((this.x - otropX) * (this.x - otropX)) + ((this.y - otropY) * (this.y - otropY))));
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}
	
	
	
}
