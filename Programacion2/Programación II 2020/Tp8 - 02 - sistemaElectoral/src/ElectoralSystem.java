import java.util.ArrayList;
import java.util.Collections;

public class ElectoralSystem {
	private ArrayList<Politician> politicians;
	private ArrayList<Person> people;
	private PlaceToVote placeToVote;
	
	public ElectoralSystem() {
		this.people = new ArrayList<Person>();
		this.politicians = new ArrayList<Politician>();
		this.placeToVote = new PlaceToVote();
	}
	
	public void addElectoralComposite(PlaceToVote ec) {
		this.placeToVote.addPlaceToVote(ec);
	}

	public void vote(Person p, int name) {
		Table mesaParaVotar = this.placeToVote.getPollingStation(p);
		Politician politician =  politicians.get(name);
		mesaParaVotar.vote(p, politician);
	}
	
	public void vote(Person p) {
		Table mesaParaVotar = this.placeToVote.getPollingStation(p);
		Politician politician =  null;
		mesaParaVotar.vote(p, politician);
	}
	
	public void addPolitical(Politician p) {
		this.politicians.add(p);
	}
	
	public void addPerson(Person p) {
		this.people.add(p);
	}

	public double getPercentageOfVotesByFilter(Filter filter) {
		System.out.println(placeToVote.getVotes(filter).size() +" - "+this.placeToVote.getNumberVotes());
		return placeToVote.getVotes(filter).size() / (double) this.placeToVote.getNumberVotes();
	}
	
	public ArrayList<Politician> getListPolitician() {
		 ArrayList<Politician> aux = new  ArrayList<Politician>(politicians);
		 Collections.sort(aux);
		 return aux;
	}
	
	
	public void assignPeople() {
		//while(!people.isEmpty()) {
			this.placeToVote.assignPlaceTovote(people);
		//}
	}
 	/*
	public Political containsPolitic(String name) {
		for (Political politic : politicals) {
			if (politic.getName().equals(name))
				return politic;
		}
		return null;
	}*/
}
