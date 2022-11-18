
public class CriterioPesoMenor extends CriterioPeso{
	public CriterioPesoMenor(Integer peso) {
		super(peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean comparar(Integer peso) {
		return this.peso.compareTo(peso)==1;
	}

}
