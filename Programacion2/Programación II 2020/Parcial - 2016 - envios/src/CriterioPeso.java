
public abstract class CriterioPeso extends Criterio{
	protected Integer peso;

	public CriterioPeso(Integer peso) {
		this.peso = peso;
	}

	@Override
	public boolean cumple(Envio envio) {
		return this.comparar(envio.getPeso());
	}

	public abstract boolean comparar(Integer peso);
}

