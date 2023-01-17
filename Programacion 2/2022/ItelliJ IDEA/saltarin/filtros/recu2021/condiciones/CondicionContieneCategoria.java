package saltarin.filtros.recu2021.condiciones;

import saltarin.filtros.recu2021.ProdAbstracto;

public class CondicionContieneCategoria extends Condicion{
    private String catQueBusco;

    public CondicionContieneCategoria(String catQueBusco) {
        this.catQueBusco = catQueBusco;
    }

    @Override
    public boolean cumple(ProdAbstracto elemento) {
        return elemento.tieneCategoria(catQueBusco);
    }


}
