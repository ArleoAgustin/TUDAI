import java.util.Comparator;


public class ComparatorByFrequency implements Comparator<Word>{
	@Override
	public int compare(Word w1, Word w2) {
		return w1.getFrequency() - w2.getFrequency();
	}
}
