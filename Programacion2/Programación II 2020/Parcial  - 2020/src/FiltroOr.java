
public class FiltroOr extends Filtro{
	private Filtro f1;
	private Filtro f2;
	
	public FiltroOr(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean filtrar(Automovil a) {
		return this.f1.filtrar(a)||this.f2.filtrar(a);
	}
}
