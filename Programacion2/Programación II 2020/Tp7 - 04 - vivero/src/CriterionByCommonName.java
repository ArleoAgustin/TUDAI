
public class CriterionByCommonName extends Criterion {
	private String word;
	
	public CriterionByCommonName(String word) {
		this.word = word;	
	}
	
	public boolean satisfies(Plant p) {
		return p.coontainsWordinPlants(word);
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
}