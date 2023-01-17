
public class Termino extends Exprecion{
	private Exprecion e1;
	private Exprecion e2;
	private Operador operacion;
	
	public Termino(Exprecion e1, Exprecion e2, Operador operacion) {
		this.e1 = e1;
		this.e2 = e2;
		this.operacion = operacion;
	}
	
	public Termino(Termino termion) {
		this.e1 = termion.getE1();
		this.e2 = termion.getE2();
		this.operacion = operacion.getCopy(operacion);
	}

	@Override
	public String getExprecion() {
		return "("+this.getE1()+this.getOperacion()+this.getE2()+")";
	}

	@Override
	public String getNumeros() {
		String aux = "";
		aux += e1.getNumeros();
		aux += e2.getNumeros();
		return aux;
	}

	@Override
	public String getOperadores() {
		String aux = operacion.toString();
		aux += e1.getOperadores();
		aux += e2.getOperadores();
		return aux;
	}

	@Override
	public String toString() {
		return  e1.toString()+ operacion.toString()+e2.toString();
	}

	public Exprecion getE1() {
		return e1;
	}
	public Exprecion getE2() {
		return e2;
	}

	public Operador getOperacion() {
		return operacion;
	}

	@Override
	public Exprecion getCopia() {
		Exprecion auxA = this.getE1().getCopia();
		Exprecion auxB = this.getE1().getCopia();
		Termino aux = new Termino(auxA, auxB, this.operacion);
		return aux;
	}
}
