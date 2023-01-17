import java.util.ArrayList;


public class Letter {
	private ArrayList<String> present;
	private String sender;
	
	public Letter(String sender) {
		this.present = new ArrayList<String>();
		this.sender = sender;
	}
	
	public Letter(String sender, ArrayList<String> wishes) {
		this.present = wishes;
		this.sender = sender;
	}

	public void addPresent(String present) {
		this.present.add(present);
	}
	
	public boolean containsPresent(String present) {
		return this.present.contains(present);
	}
	
	public ArrayList<String> getPresent() {
		return present;
	}
	public void setPresent(ArrayList<String> present) {
		this.present = present;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
}
