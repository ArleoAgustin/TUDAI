package tp5.ej3;

public class Main {

	public static void main(String[] args) {
		
		Cooperativa coop = new Cooperativa();
		
		Lote l1 = new Lote(50);
		Lote l2 = new Lote(100);
		
		coop.addMineralDeInteres("A");
		coop.addMineralDeInteres("B");
		coop.addMineralDeInteres("C");
		
		l1.addMineral("A");
		l1.addMineral("B");
		l1.addMineral("C");
		
		l2.addMineral("S");
		l2.addMineral("S");
		l2.addMineral("s");
		
		Cereal c1 = new CosechaGruesa("Cosecha gruesa");
		Cereal c2 = new CosechaFina("Cosecha fina");
		Cereal c3 = new Pastura("Pastura", 50);
		
		c1.addMineral("ff");
		c1.addMineral("d");
		c1.addMineral("yy");
		
		c2.addMineral("A");
		c2.addMineral("B");
		c2.addMineral("C");
		
		
		c3.addMineral("A");
		c3.addMineral("B");
		c3.addMineral("C");
		
		coop.addCereal(c1);
		coop.addCereal(c2);
		coop.addCereal(c3);
		
		coop.addLote(l1);
		coop.addLote(l2);
		
	// 1)	
	//	System.out.println(coop.cerealesQuePuedenSembrarseEnLote(l2));
	// 2)	
	//	System.out.println(coop.lotesEnLosQueSePuedeSembrar(c3));
		
		System.out.println(coop.loteEspecial(l1));
	}

}
