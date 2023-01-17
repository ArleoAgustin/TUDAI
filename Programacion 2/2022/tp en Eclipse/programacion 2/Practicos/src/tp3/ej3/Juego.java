package tp3.ej3;


public class Juego {
	
	private Personaje p1, p2;
	
	public Juego(Personaje p1, Personaje p2) {
		
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public void jugar(Cualidad c) {
		
		this.enfrentarJugadores(c);
	}
	
	public void enfrentarJugadores(Cualidad c) {
		
		int v1 = 0;
		int v2 = 0;
		
		v1 = this.valorCualidad(p1, c);
		v2 = this.valorCualidad(p2, c);
		System.out.println(p1.getNombreDeSuperHeroe());
		System.out.println(c.getNombreCualidad()+": "+ v1);
		System.out.println("");
		System.out.println(p2.getNombreDeSuperHeroe());
		System.out.println(c.getNombreCualidad()+": "+ v2);
		System.out.println("");
		if(v1 > v2)
			this.imprimir(p1);
		else if(v2 > v1)
			this.imprimir(p2);
		else
			this.imprimir(null);
			
	}
	
	public int valorCualidad(Personaje p, Cualidad c) {
		
		for(Cualidad cua: p.getCualidades()) {
			if(cua.getNombreCualidad().equals(c.getNombreCualidad()))
					return cua.getValor();
		}
		return 0;
	}
	

	public void imprimir(Personaje p) {
		
		if(p != null)
			System.out.println("El gananor es "+ p.getNombreDeSuperHeroe());
		else
			System.out.println("Empataron");
	}
	
	
}