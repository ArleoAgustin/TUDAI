package recuperatorioSeguros;

import java.util.ArrayList;

import recuperatorioSeguros.Filtros.Filtro;
import recuperatorioSeguros.comportamiento.CalculadorCosto;

public class SeguroSimple extends Seguro {
	
	private String descripcion;
	private double valorAsegurado;
	private int nroPoliza;
	private CalculadorCosto calcular;
	
	public SeguroSimple(int dni, int nroPoliza, String descripcion, double valorAsegurado) {
		super(dni);
		this.nroPoliza = nroPoliza;
		this.descripcion = descripcion;
		this.valorAsegurado = valorAsegurado;
	}

	public CalculadorCosto getCalcular() {
		return calcular;
	}



	public void setCalcular(CalculadorCosto calcular) {
		this.calcular = calcular;
	}
	

	@Override
	public double getValorAsegurado() {
		return this.valorAsegurado;
	}

	@Override
	public int getNroPoliza() {
		return this.nroPoliza;
	}

	@Override
	public double getMonto() {
		return	calcular.calcularCosto(this);
	}

	@Override
	public ArrayList<Seguro> buscar(Filtro f) {
		
		ArrayList<Seguro> res = new ArrayList<>();

		if(f.cumple(this))
			res.add(this);
		return res;
	}
}
	

