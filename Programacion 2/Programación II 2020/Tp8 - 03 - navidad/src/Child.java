import java.util.ArrayList;

public class Child {
	private ArrayList<String> wishes;
	private String name;
	private static int numberPerson;
	private int dni;
		
	public Child(String name) {
		this.name = name;
		numberPerson++;
		dni = numberPerson;
		this.wishes = new ArrayList<String>();
	}
	
	public Letter writeALetter() {
		return new Letter(this.getName(), wishes);
	}

	public void addPresent(String wishes) {
		this.wishes.add(wishes);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
}
