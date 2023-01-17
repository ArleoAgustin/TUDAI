import java.util.ArrayList;

public class PlaceToVote extends ElectoralComponent{
	private ArrayList<ElectoralComponent> ec;
	
	public PlaceToVote() {
		ec = new ArrayList<ElectoralComponent>();
	}

	@Override
	public Table getPollingStation(Person p) {
		for (ElectoralComponent electoralComponent : ec) {
			if (electoralComponent.getPollingStation(p) != null) {
				return electoralComponent.getPollingStation(p);
			}
			
		}
		return null;
	}
	
	@Override
	public int getNumberVotes() {
		int aux = 0;
		for (ElectoralComponent electoralComponent : ec) {
			aux += electoralComponent.getNumberVotes();
		}
		return aux;
	}
	
	public void addPlaceToVote(ElectoralComponent ec) {
		this.ec.add(ec);
	}

	@Override
	public ArrayList<Vote> getVotes(Filter f) {
		ArrayList<Vote> aux = new ArrayList<Vote>();
		for (ElectoralComponent electoralComponent : ec) {
			aux.addAll(electoralComponent.getVotes(f));
		}
		return aux;
	}

	@Override
	public ArrayList<Person> assignPlaceTovote(ArrayList<Person> people) {
		for (ElectoralComponent electoralComponent : ec) {
			if (!people.isEmpty()) {
				people = electoralComponent.assignPlaceTovote(people);
			} else {
				break;
			}
		}
		return people;
	}
}
