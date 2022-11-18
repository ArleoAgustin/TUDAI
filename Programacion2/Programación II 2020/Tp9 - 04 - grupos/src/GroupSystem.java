import java.util.ArrayList;

public abstract class GroupSystem {
	
	public abstract int getNumberEmployees();
	public abstract int getNumberMessages();
	public abstract ArrayList<Employee> getNotRepitedEmployees(Filter filter, Orderer orderer);
	public abstract void addMessage(Message message);
}
