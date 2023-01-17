
public class FiltroIgual extends Filtro implements FiltroComparable{
	@SuppressWarnings("rawtypes")
	private Comparable c1;
	
	public FiltroIgual(@SuppressWarnings("rawtypes") Comparable c1) {
		this.c1 = c1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean filtrate(@SuppressWarnings("rawtypes") Comparable c2) {
		try {
			return c1.compareTo(c2)==0;
		} catch(Exception exc) {
			return false;
		}
	}
}
