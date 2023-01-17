import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Worck {
	public abstract ArrayList<Task> getTasksList(Resource task);
	public abstract ArrayList<Resource> getResourcesList();
}
