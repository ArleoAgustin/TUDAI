package clase20211109.cocina;

public class CriterioTiempoMenor extends Criterio{
    private int tiempoMaximo;

    public CriterioTiempoMenor(int tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }

    @Override
    public boolean acepta(Comida comida) {
        return comida.getTiempoCoccion() < tiempoMaximo;
    }
}
