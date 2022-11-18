import java.util.Comparator;


public class Main {
	public static void main(String[] args) {
		Nursery n = new Nursery();
		Plant p0 = new Plant("a", "f", "Q", false, 1, 9);
		Plant p1 = new Plant("b", "d", "W", false, 4, 8);
		Plant p2 = new Plant("c", "j", "F", false, 7, 9);
		Plant p3 = new Plant("d", "a", "G", false, 7, 8);
		Plant p4 = new Plant("e", "f", "E", false, 7, 7);
		Plant p5 = new Plant("f", "l", "T", false, 2, 7);
		Plant p6 = new Plant("g", "c", "Y", false, 5, 7);
		Plant p7 = new Plant("h", "a", "J", false, 8, 8);
		Plant p8 = new Plant("i", "o", "V", false, 3, 4);
		Plant p9 = new Plant("k", "u", "X", false, 8, 2);
		n.addPlant(p0);
		n.addPlant(p1);
		n.addPlant(p2);
		n.addPlant(p3);
		n.addPlant(p4);
		n.addPlant(p5);
		n.addPlant(p6);
		n.addPlant(p7);
		n.addPlant(p8);
		n.addPlant(p9);
		
		Criterion c1 = new CriterionByWord("a");
		Criterion cri = new CriterionNot(c1);
		Comparator<Plant> com =  new ComparatorByWaterRequirement();
		
		System.out.println(n.getOrderedPlants(cri, com)+"\n\n");
		 
	}
}
