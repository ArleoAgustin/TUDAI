import java.util.ArrayList;


public class Table extends ElectoralComponent{
	private ArrayList<Integer> dniArray;
	private ArrayList<Vote> votes;
	public Table() {
		dniArray = new ArrayList<Integer>();
		votes = new ArrayList<Vote>();
	}
	
	public void addElectoralComponent(int dni) {
		if (dniArray.size()<1) {
			this.dniArray.add(dni);
		}
	}
	
	public void vote(Person pe,Politician po) {
		if (this.getPollingStation(pe) != null)
			votes.add(pe.vote(po));
	}
	
	@Override
	public int getNumberVotes() {
		return votes.size();
	}
	
	@Override
	public Table getPollingStation(Person p) {
		for (Integer dni : dniArray) {
			if (dni.compareTo(p.getDni()) == 0) {
				return this;
			}
		}
		return null;
	}
	
	@Override
	public ArrayList<Vote> getVotes(Filter f) {
		ArrayList<Vote> aux = new ArrayList<Vote>();
		for (Vote vote : votes) {
			if(f.filtrate(vote)) {
				aux.add(vote);
			}
		}
		return aux;
	}

	@Override
	public ArrayList<Person> assignPlaceTovote(ArrayList<Person> people) {
		dniArray.add(people.get(0).getDni());
		people.remove(0);	
		dniArray.add(people.get(0).getDni());
		people.remove(0);	
		return people;
	}
	
	public String toString() {
		return "\nElectoral table"+dniArray;
	}
}