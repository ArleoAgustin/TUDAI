package saltarin.filtros.recu2021;

import saltarin.filtros.recu2021.condiciones.Condicion;

public class ComboLiviano extends Combo{

    public ComboLiviano(String nombre, double porcentajeDtoPorProducto, double porcentajeTopeDto, Condicion condicion) {
        super(nombre, porcentajeDtoPorProducto, porcentajeTopeDto, condicion);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() - this.productoMenorPeso().getPrecio();
    }
}
