package recuperatorioSeguros;

import java.util.ArrayList;

import recuperatorioSeguros.Filtros.Filtro;

public class SeguroCompuesto extends Seguro {

	private ArrayList<Seguro> seguros;

	public SeguroCompuesto(int dni) {
		super(dni);
	}


	@Override
	public double getValorAsegurado() {
		
		double aux = 0;
		for(Seguro s: this.seguros) {
			aux += s.getValorAsegurado();
		}
		return aux;
	}

	@Override
	public int getNroPoliza() {
		
		int aux = 0;
		
		for(Seguro s: this.seguros) {
			if(s.getNroPoliza() > aux) 
				aux = s.getNroPoliza();
		}
		return aux;
	}

	@Override
	public double getMonto() {
		
		double aux = 0.0;
		
		for(Seguro s: this.seguros) {
			aux += s.getMonto();
		}
		return aux;
	}


	@Override
	public ArrayList<Seguro> buscar(Filtro f) {
		
		ArrayList<Seguro> res = new ArrayList<>();
		
		for(Seguro s: this.seguros) {
			res.addAll(s.buscar(f));
		}
		
		return res;
		
	}
	
	
}