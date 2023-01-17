import java.util.ArrayList;


public abstract class ElectoralComponent {
	public abstract Table getPollingStation(Person p);
	public abstract ArrayList<Vote> getVotes(Filter f);
	public abstract ArrayList<Person> assignPlaceTovote(ArrayList<Person> people);
	public abstract int getNumberVotes();
}
