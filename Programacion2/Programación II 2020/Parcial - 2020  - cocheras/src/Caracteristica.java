
public class Caracteristica implements Comparable<Comparable>{
	private String nombre;
	private Comparable valor;
	
	public Caracteristica(String nombre, Comparable valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	@Override
	public int compareTo(Comparable valor) {
		return this.valor.compareTo(valor);
	}

	@Override
	public boolean equals(Object obj) {
		try {
			Caracteristica caracteristica = (Caracteristica) obj;
			if (caracteristica.getNombre().equals(caracteristica.getNombre())
					&& caracteristica.getValor().compareTo(this.getValor()) == 0) {
				return true;
			} else {
				return false;
			}
		} catch(Exception exc) {
			return false;
		}
	}

	public String getNombre() {
		return nombre;
	}
	public Comparable getValor() {
		return valor;
	}
}
