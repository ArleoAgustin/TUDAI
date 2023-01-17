
public class Person {
	private static int numberPerson;
	private int dni;
	
	public Person() {
		numberPerson++;
		dni = numberPerson;
	}

	public int getDni() {
		return dni;
	}

	public Vote vote(Politician p) {
		return new Vote(p);
	}
}
