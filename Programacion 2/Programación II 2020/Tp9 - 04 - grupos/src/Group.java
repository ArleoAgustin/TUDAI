import java.util.ArrayList;


public class Group extends GroupSystem{
	private ArrayList<Group> groups;
	private ArrayList<Employee> employees;
	private Filter filterMesssage;
	
	public Group(Filter filterMesssage) {
		this.groups =  new ArrayList<Group>();
		this.employees =  new ArrayList<Employee>();
		this.filterMesssage = filterMesssage;
	}
	
	@Override
		public int getNumberEmployees() {
		int  aux = this.employees.size();
		for (Group group : groups) {
			aux += group.getNumberEmployees();
		}
		return aux;
	}

	@Override
	public int getNumberMessages() {
		int  aux = 0;
		for (Employee employee : employees) {
			aux += employee.getNumberMessages();
		}
		for (Group group : groups) {
			aux += group.getNumberMessages();
		}
		return aux;
	}

	@Override
	public ArrayList<Employee> getNotRepitedEmployees(Filter filter, Orderer orderer) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		for (Employee employee : this.employees) {
			employees.addAll(employee.getNotRepitedEmployees(filter, orderer));
		}
		for (Group group : groups) {
			employees.addAll(group.getNotRepitedEmployees(filter, orderer));
		}
		return null;
	}
	
	@Override
	public void addMessage(Message message) {
		if(this.filterMesssage.Filtrate(message)) {
			for (Employee employee : this.employees) {
				employee.addMessage(message);
			}
		}
		for (Group group : groups) {
			group.addMessage(message);
		}
	}
	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}
	
	public void addGroup(Group gropu) {
		this.groups.add(gropu);
	}


}
