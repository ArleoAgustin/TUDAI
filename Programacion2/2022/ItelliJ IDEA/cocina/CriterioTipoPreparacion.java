package clase20211109.cocina;

public class CriterioTipoPreparacion extends Criterio{
    private String tipoQueAcepto; //por ejemplo "ensaladas" o "postres"

    public CriterioTipoPreparacion(String tipoQueAcepto) {
        this.tipoQueAcepto = tipoQueAcepto;
    }

    @Override
    public boolean acepta(Comida comida) {
        return comida.getTipo().equalsIgnoreCase(tipoQueAcepto);
    }
}
