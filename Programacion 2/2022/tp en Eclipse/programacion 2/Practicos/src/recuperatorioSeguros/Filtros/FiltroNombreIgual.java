package recuperatorioSeguros.Filtros;

import recuperatorioSeguros.Seguro;

public class FiltroNombreIgual extends Filtro {
	
	private String nombre;
	
	
	
	public FiltroNombreIgual(String nombre) {
		super();
		this.nombre = nombre;
	}



	@Override
	public boolean cumple(Seguro s) {
		return nombre.equals(s.getNombre());
	}

}
