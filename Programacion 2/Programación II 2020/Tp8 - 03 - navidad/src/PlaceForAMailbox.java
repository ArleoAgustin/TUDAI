import java.util.ArrayList;

public class PlaceForAMailbox extends Christmas{
	private ArrayList<Christmas> placesForAmailboc;
	
	public PlaceForAMailbox() {
		this.placesForAmailboc = new ArrayList<Christmas>();
	}

	public void addPlace(Christmas christmas) {
		this.placesForAmailboc.add(christmas);
	}
	@Override
	public int getNumberOFLetter() {
		int aux = 0;
		for (Christmas christmas : placesForAmailboc) {
			aux += christmas.getNumberOFLetter();
		}
		return aux;
	}

	@Override
	public int getNumberOFLetter(Filter f) {
		int aux = 0;
		for (Christmas christmas : placesForAmailboc) {
			aux += christmas.getNumberOFLetter(f);
		}
		return aux;
	}
}
