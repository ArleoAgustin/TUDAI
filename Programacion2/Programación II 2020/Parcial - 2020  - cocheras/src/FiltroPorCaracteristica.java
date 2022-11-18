
public class FiltroPorCaracteristica extends Filtro{
	private Caracteristica caracteristica;
	
	public FiltroPorCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Override
	public boolean filtrar(Automovil a) {
		return a.containsCaracteristica(caracteristica);
	}
}
