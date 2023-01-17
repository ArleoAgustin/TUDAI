package saltarin.filtros.recu2021;

import saltarin.filtros.recu2021.condiciones.Condicion;

public class ComboPagaUno extends Combo{
    public ComboPagaUno(String nombre, double porcentajeDtoPorProducto, double porcentajeTopeDto, Condicion condicion) {
        super(nombre, porcentajeDtoPorProducto, porcentajeTopeDto, condicion);
    }

    @Override
    public double getPrecio() {
        double mayor = 0;
        for (ProdAbstracto elem: elementos) {
            if (elem.getPrecio()>mayor)
                mayor = elem.getPrecio();
        }
        return mayor;
    }
}
