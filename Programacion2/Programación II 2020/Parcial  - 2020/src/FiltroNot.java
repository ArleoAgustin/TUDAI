
public class FiltroNot extends Filtro{
	private Filtro f;
	
	public FiltroNot(Filtro f) {
		this.f = f;
	}

	@Override
	public boolean filtrar(Automovil a) {
		return !this.f.filtrar(a);
	}
}
