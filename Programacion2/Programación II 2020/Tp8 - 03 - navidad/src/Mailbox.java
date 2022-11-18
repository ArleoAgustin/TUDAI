import java.util.ArrayList;


public class Mailbox extends Christmas{
	private ArrayList<Integer> dniArray;
	private ArrayList<Letter> letters;
	
	public Mailbox() {
		dniArray = new ArrayList<Integer>();
		letters = new ArrayList<Letter>();
	}
	
	@Override
	public int getNumberOFLetter() {
		return letters.size();
	}

	@Override
	public int getNumberOFLetter(Filter f) {
		int aux = 0;
		for (Letter letter : letters) {
			if(f.filtrate(letter)) {
				aux++;
			}
		}
		return aux;
	}
	
	public void addLetter(Child child, Letter letter) {
		if(this.dniArray.contains(child.getDni())) {
			if (letters.contains(letter))
				this.letters.add(letter);
		} else {
			if (letters.contains(letter))
				letter.addPresent("Coal");
				this.letters.add(letter);
		}
	}

}
