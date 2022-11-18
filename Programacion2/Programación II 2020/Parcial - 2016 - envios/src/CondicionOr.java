
public class CondicionOr extends Criterio{
	private Criterio c1;
	private Criterio c2;
	
	public CondicionOr(Criterio c1, Criterio c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(Envio envio) {
		return this.c1.cumple(envio)||this.c2.cumple(envio);
	}
	
}
