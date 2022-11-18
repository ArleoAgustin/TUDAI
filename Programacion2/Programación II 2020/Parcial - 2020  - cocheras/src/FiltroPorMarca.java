
public class FiltroPorMarca extends Filtro{
	private String marca;

	public FiltroPorMarca(String marca) {
		super();
		this.marca = marca;
	}

	@Override
	public boolean filtrar(Automovil a) {
		return a.equals(marca);
	}

}
