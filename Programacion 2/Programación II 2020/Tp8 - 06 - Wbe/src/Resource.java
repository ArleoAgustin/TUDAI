import java.time.LocalDate;
import java.util.ArrayList;


public abstract class Resource extends Worck{

	@Override
	public ArrayList<Task> getTasksList(Resource task) {
		ArrayList<Task> aux =  new ArrayList<Task>();
		if (this.equals(task)) {
			return aux;
		}
		return null;
	}

	@Override
	public ArrayList<Resource> getResourcesList() {
		ArrayList<Resource> aux =  new ArrayList<Resource>();
		aux.add(this);
		return aux;
	}
	
	public boolean isAllocateResourse() {
		return this.isAvailable();
	}

	public abstract boolean isAvailable();
}
