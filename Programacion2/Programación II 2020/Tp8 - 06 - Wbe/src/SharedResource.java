
public class SharedResource extends Resource{
	private boolean assigned;
	
	@Override
	public boolean isAvailable() {
		return false;
	}
	
	
}
