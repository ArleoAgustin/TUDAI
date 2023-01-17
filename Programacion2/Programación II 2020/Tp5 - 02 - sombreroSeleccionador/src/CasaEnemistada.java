import java.util.ArrayList;

public class CasaEnemistada extends CasaCualidades{
	
	private ArrayList<CasaCualidades> casasEnemigas;
	
	public CasaEnemistada(String nombre){
		super(nombre);
		casasEnemigas = new ArrayList<CasaCualidades>();
	}
	
	public boolean cumpleCondiciones(Estudiante est) {
		return super.cumpleCondiciones(est) && !esAceptadoCasaEnemiga(est);
	}
	
	public void anadirCasaEnemistada(CasaCualidades casa){
		casasEnemigas.add(casa);
	}
	
	public boolean esAceptadoCasaEnemiga(Estudiante est) {
		for (CasaCualidades casa : casasEnemigas) {
				if (casa.cumpleCondiciones(est)){
					return true;
				}
		}
		return false;
	}
}
