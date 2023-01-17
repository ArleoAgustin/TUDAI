package farmaciaIterableSimple.aseguradora.filtros;

import farmaciaIterableSimple.aseguradora.SeguroSimple;

public abstract class Filtro {
    public abstract boolean cumple(SeguroSimple seguro);
}
