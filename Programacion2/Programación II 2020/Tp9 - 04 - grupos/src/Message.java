import java.util.ArrayList;

public class Message {
	private String name;
	private String nameid;
	private ArrayList<String> words;
	
	public Message(String name, String nameid) {
		this.words = new ArrayList<String>();
		this.name = name;
		this.nameid = nameid;
	}
	
	public String getName() {
		return name;
	}

	public String getNameid() {
		return nameid;
	}

	public boolean constanisWord(String word) {
		return this.words.contains(word);
	}
}
