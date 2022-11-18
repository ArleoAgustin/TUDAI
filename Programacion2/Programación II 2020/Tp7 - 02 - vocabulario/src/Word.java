
public class Word {
	private String word;
	private int frequency;
	
	public Word(String word,  int frequency) {
		this.word = word;
		this.frequency = frequency;
	}

	public String getWord() {
		return word;
	}
	public int getFrequency() {
		return frequency;
	}
	public void incrememnt() {
		frequency++;
	}
	public String toString() {
		return "\n	· "+word;
	}
	public boolean equals(Object o) {
		try {
			Word w2 = (Word) o;
			String w1 = word;
			return w1.equals(w2.getWord());
		} catch (Exception exc) {
			return false;
		}
	}
}
