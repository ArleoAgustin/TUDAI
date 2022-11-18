import java.util.ArrayList;


public class Employee extends GroupSystem{
	private ArrayList<Message> messages;
	private String fullName;
	private static int  id = 0;
	private int numberLegacy;
	private int age;
	
	
	
	public Employee(String fullName, int age) {
		super();
		this.messages =  new ArrayList<Message>();
		this.fullName = fullName;
		this.age = age;
		this.id++;
		this.numberLegacy = this.id;
	}

	public Employee() {
		this.messages =  new ArrayList<Message>();
	}
	
	public int getNumberMessages() {
		return this.messages.size();
	}

	@Override
	public int getNumberEmployees() {
		return 1;
	}

	@Override
	public ArrayList<Employee> getNotRepitedEmployees(Filter filter, Orderer orderer) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		for (Message message : messages) {
			if(!employees.contains(this)) {
				if(filter.Filtrate(message)) {
					employees.add(this);
					return employees;
				}	
			}
		}
		return employees;
	}
	
	public void addMessage(Message message) {
		this.messages.add(message);
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Employee employee = (Employee) obj;
			return this.numberLegacy == employee.getNumberLegacy();
			
		} catch(Exception exc) {
			return false;
		}
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getNumberLegacy() {
		return numberLegacy;
	}

	public void setNumberLegacy(int numberLegacy) {
		this.numberLegacy = numberLegacy;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
