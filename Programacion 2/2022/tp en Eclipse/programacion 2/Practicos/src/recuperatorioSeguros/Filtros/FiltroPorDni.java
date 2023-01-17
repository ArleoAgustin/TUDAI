package recuperatorioSeguros.Filtros;

import recuperatorioSeguros.Seguro;

public class FiltroPorDni extends Filtro {
	
	private int i;
	
	
	
	public FiltroPorDni(int i) {
		super();
		this.i = i;
	}



	@Override
	public boolean cumple(Seguro s) {
		return s.getDni() == i;
	}

}
