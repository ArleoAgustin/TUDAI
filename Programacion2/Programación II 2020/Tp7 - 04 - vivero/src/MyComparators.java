import java.util.Comparator;

public abstract class MyComparators implements Comparator<Plant>{
	private  Comparator<Plant> secondComparator;
	public MyComparators(Comparator<Plant> secondComparator) {
		this.setSecondComparator(secondComparator);
	}
	public MyComparators() {
	}
	@Override
	public abstract int compare(Plant p1, Plant p2);
	public Comparator<Plant> getSecondComparator() {
		return secondComparator;
	}
	public void setSecondComparator(Comparator<Plant> secondComparator) {
		this.secondComparator = secondComparator;
	}
}
