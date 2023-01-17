package farmaciaIterableSimple.aseguradora.filtros;

import farmaciaIterableSimple.aseguradora.SeguroSimple;

public class FiltroDescripcion extends Filtro{
    private String subcadena;

    public FiltroDescripcion(String subcadena) {
        this.subcadena = subcadena;
    }

    @Override
    public boolean cumple(SeguroSimple seguro) {
        return seguro.getDescripcion().contains(subcadena);
    }
}
