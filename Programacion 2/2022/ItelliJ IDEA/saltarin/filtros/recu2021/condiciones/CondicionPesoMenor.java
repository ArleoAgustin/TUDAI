package saltarin.filtros.recu2021.condiciones;

import saltarin.filtros.recu2021.ProdAbstracto;

public class CondicionPesoMenor extends Condicion{
    private double pesoMaximo;

    public CondicionPesoMenor(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    @Override
    public boolean cumple(ProdAbstracto elemento) {
        return elemento.getPeso() < pesoMaximo;
    }
}
