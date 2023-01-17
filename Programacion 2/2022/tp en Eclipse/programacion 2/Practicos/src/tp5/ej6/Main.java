package tp5.ej6;

public class Main {

	public static void main(String[] args) {
		
		Congreso c = new Congreso();
		
		Trabajo t1 = new Resumen();
		Trabajo t2 = new Articulo();
		Trabajo t3 = new Poster();
		
		t1.addPalabra("FF");
		t1.addPalabra("HH");
		t1.addPalabra("AA");
		
		t2.addPalabra("LL");
		t2.addPalabra("WW");
		t2.addPalabra("TT");
		
		t3.addPalabra("PP");
		t3.addPalabra("PGG");
		t3.addPalabra("MM");
	
		Evaluador e1 = new Evaluador();
		Evaluador e2 = new Evaluador();
		
		e1.addPalabra("AA");
		e1.addPalabra("FF");
		e1.addPalabra("HH");
		e1.addPalabra("PP");
		
		e2.addPalabra("LL");
		e2.addPalabra("WW");
		e2.addPalabra("MM");
		e2.addPalabra("SS");
		
		e1.addTemaConocido("MVC");
		e1.addTemaConocido("PHP");
		
		e2.addTemaConocido("Visualizacion");
		e2.addTemaConocido("");
		
		c.addTrabajo(t1);
		c.addTrabajo(t2);
		c.addTrabajo(t3);
		
		c.addEvaluador(e1);
		c.addEvaluador(e2);
		
		c.addTemaEspecifico("Visualizacion");
		c.addTemaEspecifico("Redes");
		
		
		System.out.println(c.esExperto(e2));
	}

}
