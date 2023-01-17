package clase20211109.cocina;

public class CriterioModoPreparacion extends Criterio{
    private String modoQueAcepto;

    public CriterioModoPreparacion(String modoQueAcepto) {
        this.modoQueAcepto = modoQueAcepto;
    }

    @Override
    public boolean acepta(Comida comida) {
        return comida.getModoPreparacion().equalsIgnoreCase(modoQueAcepto);
    }
}
