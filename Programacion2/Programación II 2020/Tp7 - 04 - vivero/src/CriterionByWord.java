
public class CriterionByWord extends Criterion {
	private String word;
	
	public CriterionByWord(String word) {
		this.word = word;	
	}
	
	public boolean satisfies(Plant p) {
		return p.getSctificName().contains(word);
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
}
