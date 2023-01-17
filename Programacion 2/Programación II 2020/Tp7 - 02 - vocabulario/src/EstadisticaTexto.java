import java.util.*;

public class EstadisticaTexto {
	
	private String text;
	private ArrayList<Word> words;
	private Comparator<Word> c;
	
	public EstadisticaTexto(String texto) {
		this.text = texto;
		 words = new ArrayList<Word>();
		 asArrayList();
		 c = new ComparatorByFrequency();
	}

	public int getDifferenceWords() {
		return words.size();
	}

	public ArrayList<Word> getWordsinAsendingOrder(int numberWord) {
		ArrayList<Word> returned = new ArrayList<Word>(words);
		Collections.sort(returned, c);
		cut(returned, numberWord);
		return returned;
	}
	
	public ArrayList<Word> getWordsInFrequencyOrder(int numberWord) {
		ArrayList<Word> returned = new ArrayList<Word>(words);
		Collections.sort(returned, c.reversed());
		cut(returned, numberWord);
		return returned;
		}

	public void cut(ArrayList<Word> auxWords, int numberWords) {
		for (int j = auxWords.size() - 1; j > numberWords; j--) {
			auxWords.remove(j);
		}
	}
	
	private void asArrayList() {
		StringTokenizer tokenizer = new StringTokenizer(text, " ,():");
		while(tokenizer.hasMoreTokens()){
			String w = tokenizer.nextToken();
			Word word = new Word(w, 1);
			addWord(word);
		}
	}
	
	public double getFrequencyWord(String w1) {
		StringTokenizer tokenizer = new StringTokenizer(text, " ,():.");
		int cantWord = tokenizer.countTokens();
		for (Word w2 : words) {
			if(w2.getWord().equals(w1)) {
				return (double) w2.getFrequency() / cantWord;
			}
		}
		return 0.0;
	}

	private void addWord(Word w2) {
		boolean notRepited = false;
		for (Word w1 : words) {
			if(w1.equals(w2)) {
				w1.incrememnt();
				notRepited = true;
				break;
			}
		}
		if(notRepited == false) {
			words.add(w2);
		}
	}
}

