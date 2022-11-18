
public class Main {
	public static void main(String []args) {
		Section s0 = new Section("Generales");
		Section s1 = new Section("Espectáculos");
		Section s2 = new Section("Divorcios");
		Section s3 = new Section("Deportes");
		Section s4 = new Section("Fútbol");
		News n0 = new News("Link 1");
		News n1 = new News("Link 2");
		News n2 = new News("Link 3");
		News n3 = new News("Link 4");
		News n4 = new News("Link 5");
		News n5 = new News("Link 6");
		
		n3.addKeyWord("goleada");
		n4.addKeyWord("goleada");
		n5.addKeyWord("goleada");
		
		System.out.println("Secciones del sitio");
		s0.addClassifications(s1);
		s0.addClassifications(s3);
		s0.addClassifications(n5);
		s1.addClassifications(n0);
		s1.addClassifications(s2);
		s2.addClassifications(n1);
		s2.addClassifications(n2);
		s4.addClassifications(n3);
		s3.addClassifications(s4);
		s3.addClassifications(n4);
		s3.addClassifications(n5);

		s0.getLink("");

		Filter f = new FilterByKeyWord("goleada");
		System.out.println("Secciones del sitio:");
		s0.pageCopy(f).getLink("");
	}
}
