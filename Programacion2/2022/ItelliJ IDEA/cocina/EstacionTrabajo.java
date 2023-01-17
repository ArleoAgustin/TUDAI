package clase20211109.cocina;

import java.util.ArrayList;

public class EstacionTrabajo {
    private String id;
    private ArrayList<Comida> comidasEnCurso;
    private Criterio criterio;

    public EstacionTrabajo(String id, Criterio criterio) {
        this.id = id;
        comidasEnCurso = new ArrayList<>();
        this.criterio = criterio;
    }

    public void setCriterioAceptacion(Criterio otroNuevo){
        this.criterio = otroNuevo;
    }

    public boolean aceptas(Comida comida){
        return criterio.acepta(comida);
    }

    public void tomarComida(Comida comida){
        comidasEnCurso.add(comida);
        //NO IMPRIMAN POR PANTALLA EN EL MODELO!
        System.out.println("La estacion "+this.id+" está cocinando la comida "+
                comida.getNombre());
    }
}
