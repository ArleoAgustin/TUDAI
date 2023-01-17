import java.util.ArrayList;


public class Rectangulo {
	
	
	private PuntoGeometrico p1;
	private PuntoGeometrico p2;
	private PuntoGeometrico p3;
	private PuntoGeometrico p4;
	private float lado1;
	private float lado2;
	private ArrayList<PuntoGeometrico> puntos = new ArrayList<PuntoGeometrico>();
	
	public Rectangulo (PuntoGeometrico pp1, PuntoGeometrico pp2){
		p1  = pp1;
		p4 = pp2;
		p2 = calcuularCoordenadaNuevoPunto(pp1,pp2);
		p3 = calcuularCoordenadaNuevoPunto(pp2,pp1);
		lado1 = calcularLado(p1, p3);
		lado2 = calcularLado(p1, p2);
		puntos.add(p1);
		puntos.add(p2);
		puntos.add(p3);
		puntos.add(p4);
	}
	
	public Rectangulo (PuntoGeometrico punto, float llado1, float llado2){
		p1 = punto;
		p2 = new PuntoGeometrico();
		p3 = new PuntoGeometrico();
		p4 = new PuntoGeometrico();
		
		p2.desplazarCordenada((p1.getX()+llado2), p1.getY());
		p3.desplazarCordenada(p1.getX(), (p1.getY()+llado1));
		p4.desplazarCordenada(p2.getX(), p3.getY());
		lado1 = calcularLado(p1, p3);
		lado2 = calcularLado(p1, p2);
		
		puntos.add(p1);
		puntos.add(p2);
		puntos.add(p3);
		puntos.add(p4);
	}
	
	private PuntoGeometrico calcuularCoordenadaNuevoPunto (PuntoGeometrico pp1, PuntoGeometrico pp2){
		PuntoGeometrico p = new PuntoGeometrico(pp2.getX(),pp1.getY());
		return p;
	}
	
	private float calcularLado ( PuntoGeometrico pp1, PuntoGeometrico pp2){
		float longitudLado = pp1.calcularDistanciaEuclidea(pp2);
		return longitudLado;
	}
	
	public void transladarRectangulo (float x, float y){
		for (PuntoGeometrico punto : puntos){
			punto.desplazarPunto(x, punto.getX());
			punto.desplazarPunto(y, punto.getY());
		}
	}
	
	public float calcularArea (){
		return (lado1 * lado2);
	}
	
	public int rectanguloMayor(Rectangulo rectangulo){
		if (calcularArea() > rectangulo.calcularArea()){
			return 1;
		} else if (calcularArea() < rectangulo.calcularArea()){
			return -1;
		} else{
			return 0;
		}
	}
	
	public boolean esCuadrado (){
		if (lado1 == lado2){
			return true;
		} else {
			return false;
		}
	}
	
	public float obtenerLargoLadoMayor (){
		if (lado1 > lado2){
			return lado1;
		} else {
			return lado2;
		}
	}
	
	public void direccion (){
		System.out.print("\nEl rectangulo ");
		if (!esCuadrado()){
			if (lado1 > lado2){
				System.out.print("est· parado");
				//return true;
			} else {
				System.out.print("est· acostado");
				//return false;
			}
		} else {
			System.out.print("es un cuadrado");
			//return false
		}
	}
	
	public void dameDatos (){
		System.out.println("\n\nDatos del Rect·ngulo: " 
				+ "\nLado 1: " + lado1 + "\nLado 2: " + lado2 
				+ "\nEl lado mayo mide: "+ obtenerLargoLadoMayor()
				+ "\nVertice 1: ("+p1.getX()+", "+p1.getY()+")"
				+ "\nVertice 2: ("+p2.getX()+", "+p2.getY()+")"
				+ "\nVertice 3: ("+p3.getX()+", "+p3.getY()+")"
				+ "\nVertice 4: ("+p4.getX()+", "+p4.getY()+")"
				+ "\n¡rea del rect·ngulo: " + calcularArea() 
				+ "\nEs un cuadrado: " + esCuadrado());
	}

	public PuntoGeometrico getP1() {
		return p1;
	}

	public void setP1(PuntoGeometrico p1) {
		this.p1 = p1;
	}

	public PuntoGeometrico getP2() {
		return p2;
	}

	public void setP2(PuntoGeometrico p2) {
		this.p2 = p2;
	}

	public PuntoGeometrico getP3() {
		return p3;
	}

	public void setP3(PuntoGeometrico p3) {
		this.p3 = p3;
	}

	public PuntoGeometrico getP4() {
		return p4;
	}

	public void setP4(PuntoGeometrico p4) {
		this.p4 = p4;
	}

	public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}
	
	
}
