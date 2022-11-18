
public class Main {

	public static void main(String[] args) {
		PlataformaStreaming p = new PlataformaStreaming();
		
		CriterioDuracion c1 = new CriterioDuracion(120);
		CriterioGenero c2 = new CriterioGenero("Comedia");
		CriterioAnoPublicacion c3 = new CriterioAnoPublicacion(2017);
		CriterioGenero c4 = new CriterioGenero("Infantil");
		CriterioGenero c5 = new CriterioGenero("documental");
		Criterio cnot = new CriterioNot(c2);
		Criterio cand = new CriterioAnd(c1, cnot);
		Criterio cor1 = new CriterioOr(c4, c5);
		Criterio cor2 = new CriterioOr(c3, cor1);
		Criterio cor3 = new CriterioOr(cand, cor2);	
		p.setCriterio(cor3);
	}

}
