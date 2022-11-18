
public class FiltroPorModeloDeAutoMayor extends Filtro{
	private int modelo;
	
	public FiltroPorModeloDeAutoMayor(int modelo) {
		this.modelo = modelo;
	}

	@Override
	public boolean filtrar(Automovil a) {
		return a.getModelo()>this.modelo;
	}
}
