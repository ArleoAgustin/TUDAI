package clase20211118recu.condiciones;

import clase20211118recu.ProdAbstracto;

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
