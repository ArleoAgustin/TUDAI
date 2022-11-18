
public class CerealPasturas extends Cereal{
	
	
	public CerealPasturas(){
		super();
	}
	
	public CerealPasturas(String nombre){
		super(nombre);
	}
	
	public boolean sirveLote(Lote lote) {
		return super.sirveLote(lote) && lote.getCantidadHecatreas() >= 50;
	}
}
