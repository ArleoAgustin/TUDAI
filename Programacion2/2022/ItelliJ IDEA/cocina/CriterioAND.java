package clase20211109.cocina;

public class CriterioAND extends Criterio{
    private Criterio c1,c2;

    public CriterioAND(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean acepta(Comida comida) {
        return c1.acepta(comida) && c2.acepta(comida);
    }
}
