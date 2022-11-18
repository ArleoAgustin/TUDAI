

public abstract class Christmas {
	public double getPercentageOfLetter(Filter f) {
		return (double) this.getNumberOFLetter(f) /  (double) this.getNumberOFLetter();
	}
	public abstract int getNumberOFLetter();
	public abstract int getNumberOFLetter(Filter f);
}
