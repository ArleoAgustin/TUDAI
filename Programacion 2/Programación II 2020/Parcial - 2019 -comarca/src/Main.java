
public class Main {
	public static void main(String []args) {
		SimpleTerritory st0 = new SimpleTerritory("Comarca 1", 12312332.0, 12312312, 999999999);
		SimpleTerritory st1 = new SimpleTerritory("Comarca 1", 12312.0, 1231, 1231312311);
		SimpleTerritory st2 = new SimpleTerritory("Comarca 1", 51231231, 12, 8797);
		SimpleTerritory st3 = new SimpleTerritory("Comarca 1", 2342342.0, 12, 123123123);
		CompositeTerritory ct0 =  new CompositeTerritory();
		CompositeTerritory ct1 =  new CompositeTerritory();
		CompositeTerritory ct2 =  new CompositeTerritory();
		CompositeTerritory ct3 =  new CompositeTerritory();
		
		ct0.addTerritoy(ct1);
		ct1.addTerritoy(ct3);
		ct1.addTerritoy(ct2);
		ct3.addTerritoy(st0);
		ct1.addTerritoy(st1);
		ct0.addTerritoy(st2);
		ct3.addTerritoy(st3);
		System.out.println("Ingreso : "+ct0.getCantidadTotalDeSueldo());
		System.out.println("Personas: "+ct0.getCantidadDeHabitantes());
		System.out.println("Ingreso percapita: "+ct0.getIngresoPercapita());
		System.out.println("Densidad de población: "+ct0.getDensidadDePoblacion());
	}
}
