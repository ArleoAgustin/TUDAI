package recuperatorioSeguros;

import java.time.LocalDate;
import java.util.ArrayList;

import recuperatorioSeguros.Filtros.Filtro;

public class SeguroTemporal extends Seguro {
	
	private LocalDate finicio;
	private LocalDate ffin;
	
	private Seguro seguro;

	public SeguroTemporal(int dni, LocalDate finicio, LocalDate ffin) {
		super(dni);
		this.finicio = finicio;
		this.ffin = ffin;
	}

	@Override
	public double getValorAsegurado() {
		
		if(LocalDate.now().isAfter(finicio) && LocalDate.now().isBefore(ffin)) {
			return seguro.getValorAsegurado();
		}
		return 0;
	}

	@Override
	public int getNroPoliza() {
		return seguro.getNroPoliza();
	}

	@Override
	public double getMonto() {
		if(LocalDate.now().isAfter(finicio) && LocalDate.now().isBefore(ffin)) {
			return seguro.getValorAsegurado();
		}
		return 0;
	}

	@Override
	public ArrayList<Seguro> buscar(Filtro f) {
		
		ArrayList<Seguro> res = new ArrayList<>();

		if(f.cumple(this))
			res.add(this);
		return res;
	}

}
