import java.util.ArrayList;

public class CasaExigente extends CasaCualidades{

	public CasaExigente(String nombre){
		super(nombre);
	}
	
	public boolean cumpleCondiciones(Estudiante est) {
		return super.cumpleCondiciones(est) && (conjuntoEstudiantes.size() == 0 || tieneFamiliares(est.getConjuntoFamiliares()));
	}
	
	public boolean tieneFamiliares(ArrayList<String> arrFamiliares) {
		for (String familiar : arrFamiliares) {
			if (conjuntoEstudiantes.contains(familiar)) {
				return true;
			}
		}
		return false;
	}
}