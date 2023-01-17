package centroAnimales;

import centroAnimales.criterios.Criterio;
import centroAnimales.criterios.CriterioCaracteristicaIgualValor;

import java.util.ArrayList;

public class CentroRecuperacion {

    private ArrayList<Jaula> jaulas;

    public CentroRecuperacion(){
        jaulas = new ArrayList<>();
    }

    public void addJaula(Jaula j){
        jaulas.add(j);
    }

    public ArrayList<Jaula> buscar(Criterio loquebusco){
        ArrayList<Jaula> retorno = new ArrayList<>();
        for (int i = 0; i < jaulas.size(); i++) {
            Jaula j = jaulas.get(i);
            if (loquebusco.cumple(j))
                retorno.add(j);
        }
        return retorno;
    }

    public Jaula buscarJaula(Criterio loquebusco){
        for (int i = 0; i < jaulas.size(); i++) {
            Jaula j = jaulas.get(i);
            if (loquebusco.cumple(j))
                return j;
        }
        return null;
    }


    public static void main(String[] args) {
        Caracteristica alto = new Caracteristica(
                "alto", 12.5);
        Caracteristica tieneArbol = new Caracteristica(
                "Tiene Arbol", true);
        Caracteristica material = new Caracteristica(
                "Material", "Aluminio");



        CentroRecuperacion laVete = new CentroRecuperacion();
        Jaula j1 = new Jaula();
        j1.addCaracteristica("alto", 110.0);
        j1.addCaracteristica("ancho", 220.0);
        laVete.addJaula(j1);
        Jaula j2 = new Jaula();
        j2.addCaracteristica("alto", 220.0);
        j2.addCaracteristica("ancho", 220.0);
        j2.addCaracteristica("tiene arbol", false);
        j2.addCaracteristica("la jaula de al lado", j1);
        laVete.addJaula(j2);


        /*CriterioMedida c = new CriterioMedida("ancho", 220);
        ArrayList<Jaula> altas220 = laVete.buscar(c);
        for (int i = 0; i < altas220.size(); i++) {
            System.out.println(altas220.get(i));
        }*/

        CriterioCaracteristicaIgualValor c2 = new CriterioCaracteristicaIgualValor("tiene arbol", false);
        ArrayList<Jaula> lasQueNoTienenArbol = laVete.buscar(c2);
        for (int i = 0; i < lasQueNoTienenArbol.size(); i++) {
            System.out.println(lasQueNoTienenArbol.get(i));
        }
    }


    //int --> Integer
    //double --> Double
    //boolean --> Boolean
    //float --> Float
}
